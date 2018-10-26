/*
 * Copyright 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.unice.polytech.sacc;

import com.google.cloud.Timestamp;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.IncompleteKey;
import com.google.cloud.datastore.Key;
import com.google.cloud.datastore.KeyFactory;
import com.google.cloud.datastore.Query;
import com.google.cloud.datastore.QueryResults;
import com.google.cloud.datastore.StructuredQuery;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// [START gae_flex_datastore_app]
@SuppressWarnings("serial")
@WebServlet(name = "datastore", urlPatterns = {"", "/", "/delete"})
public class DataStoreServlet extends HttpServlet {

  private static final long serialVersionUID = -92037165009171105L;
  private Gson _gson = null;

  public DataStoreServlet() {
    super();

    _gson = new Gson();

  }
  // a utility method to send object
  // as JSON response
  private void sendAsJson(HttpServletResponse response, Object obj, Type type) throws IOException {

    response.setContentType("application/json");

    String res = _gson.toJson(obj, type);

    PrintWriter out = response.getWriter();

    out.print(res);
    out.flush();
  }

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    
    // Mettez en place le code permettant d'ouvrir une connexion au datastore (1
    // ligne).
    Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
    // ----

    // Retrieve the last 10 visits from the datastore, ordered by timestamp.
    Query<Entity> query = Query.newEntityQueryBuilder().setKind("article")
        .setOrderBy(StructuredQuery.OrderBy.desc("timestamp")).build();
    QueryResults<Entity> results = datastore.run(query);

    ArrayList<Article> entities = new ArrayList<>();
    while (results.hasNext()) {
      Entity entity = results.next();
      entities.add(new Article(entity.getString("name"), entity.getDouble("price"), entity.getLong("quantity")));
    }

    sendAsJson(resp, entities, new TypeToken<Collection<Article>>(){}.getType());
    
  }

  @Override
  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

    // Mettez en place le code permettant d'ouvrir une connexion au datastore (1
    // ligne).
    Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
    // ----

    KeyFactory keyFactory = datastore.newKeyFactory().setKind("article");

    String pathInfo = req.getRequestURI();

    if (pathInfo == null || pathInfo.equals("/")) {

      StringBuilder buffer = new StringBuilder();
      BufferedReader reader = req.getReader();
      String line;
      while ((line = reader.readLine()) != null) {
        buffer.append(line);
      }

      String payload = buffer.toString();

      // Check it's actually an Article json
      Article a = _gson.fromJson(payload, Article.class);

      IncompleteKey key = keyFactory.newKey(a.getName());

      FullEntity<IncompleteKey> newArticle = FullEntity.newBuilder(key)
        .set("name", a.getName())
        .set("price", a.getPrice())
        .set("quantity", a.getQuantity())
        .set("timestamp", Timestamp.now()).build();

      datastore.add(newArticle);

      sendAsJson(resp, a, new TypeToken<Article>(){}.getType());
    } else if (pathInfo.equals("/delete")) {
      StringBuilder buffer = new StringBuilder();
      BufferedReader reader = req.getReader();
      String line;
      while ((line = reader.readLine()) != null) {
        buffer.append(line);
      }

      JsonObject o = new JsonParser().parse(buffer.toString()).getAsJsonObject();

      String id = o.get("id").getAsString();

      Key articleKey = keyFactory.newKey(id);
      datastore.delete(articleKey);
      resp.setContentType("text/plain");
      PrintWriter out = resp.getWriter();
      out.print("Deleted : " + articleKey.toString() + " ?\n");
      out.flush();
    } else {
      resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
      return;
    }

  }
}
// [END gae_flex_datastore_app]
