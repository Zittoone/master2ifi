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

import com.google.api.client.json.Json;
import com.google.cloud.Timestamp;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.EntityQuery;
import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.IncompleteKey;
import com.google.cloud.datastore.Key;
import com.google.cloud.datastore.KeyFactory;
import com.google.cloud.datastore.Query;
import com.google.cloud.datastore.QueryResults;
import com.google.cloud.datastore.StructuredQuery;
import com.google.cloud.datastore.StructuredQuery.CompositeFilter;
import com.google.cloud.datastore.StructuredQuery.Filter;
import com.google.cloud.datastore.StructuredQuery.PropertyFilter;
import com.google.cloud.datastore.PathElement;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// [START gae_flex_datastore_app]
@SuppressWarnings("serial")
@WebServlet(name = "datastore", urlPatterns = { "/magasins" })
public class DataStoreServletAncestor extends HttpServlet {

    private static final long serialVersionUID = -92037165009171105L;
    private Gson _gson = null;

    public DataStoreServletAncestor() {
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

        String pathInfo = req.getPathInfo();

        if (pathInfo == null || pathInfo.equals("/")) {

            String q = req.getQueryString();
            Map<String, String> queryParams = new HashMap<>();

            if(q != null) {
                String[] params = q.split("&");
                for(int i = 0; i < params.length; i++) {
                    queryParams.put(params[i].split("=")[0], params[i].split("=")[1]);
                }
            }
            
            List<Filter> optFilters = new ArrayList<>();

            if(queryParams.containsKey("magasin")) {
                optFilters.add(PropertyFilter.hasAncestor(
                    datastore.newKeyFactory().setKind("Magasin").newKey(queryParams.get("magasin"))
                ));
            }

            if(queryParams.containsKey("minQty")) {
                optFilters.add(PropertyFilter.gt("quantity", queryParams.get("minQty")));
            }

            Query<Entity> query;

            if(optFilters.size() > 1) {

                query = Query.newEntityQueryBuilder()
                    .setKind("Article")
                    .setOrderBy(StructuredQuery.OrderBy.desc("timestamp"))
                    .setFilter(CompositeFilter.and(optFilters.get(0), optFilters.get(1)))
                    .build();
            } else if(optFilters.size() == 1) {
                query = Query.newEntityQueryBuilder()
                    .setKind("Article")
                    .setOrderBy(StructuredQuery.OrderBy.desc("timestamp"))
                    .setFilter(CompositeFilter.and(optFilters.get(0)))
                    .build();
            } else {
                query = Query.newEntityQueryBuilder()
                    .setKind("Article")
                    .setOrderBy(StructuredQuery.OrderBy.desc("timestamp"))
                    .build();
            }

            QueryResults<Entity> results = datastore.run(query);

            ArrayList<Entity> entities = new ArrayList<>();
            while (results.hasNext()) {
                Entity entity = results.next();
                entities.add(entity);
            }

            sendAsJson(resp, entities, new TypeToken<Collection<Entity>>() {
            }.getType());

        }

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        // Mettez en place le code permettant d'ouvrir une connexion au datastore (1
        // ligne).
        Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
        // ----

        String pathInfo = req.getPathInfo();

        if (pathInfo == null || pathInfo.equals("/")) {

            JsonObject payload = getPayload(req);

            // Check it's actually an Article json
            Article a = _gson.fromJson(payload, Article.class);

            KeyFactory keyFactory = datastore.newKeyFactory().addAncestor(PathElement.of("Magasin", payload.get("magasin").getAsString())).setKind("Article");

            Key articleKey = keyFactory.newKey(payload.get("id").getAsString());

            datastore.delete(articleKey);

            IncompleteKey key = keyFactory.newKey(a.getName());

            FullEntity<IncompleteKey> newArticle = FullEntity.newBuilder(key).set("name", a.getName())
                    .set("price", a.getPrice()).set("quantity", a.getQuantity()).set("timestamp", Timestamp.now())
                    .build();

            datastore.add(newArticle);

            sendAsJson(resp, a, new TypeToken<Article>() {
            }.getType());
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        resp.sendRedirect("/magasins");
    }

    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String pathInfo = req.getPathInfo();

        // Mettez en place le code permettant d'ouvrir une connexion au datastore (1
        // ligne).
        Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
        // ----

        if (pathInfo == null || pathInfo.equals("/")) {

            JsonObject payload = getPayload(req);

            KeyFactory keyFactory = datastore.newKeyFactory().addAncestor(PathElement.of("Magasin", payload.get("magasin").getAsString())).setKind("Article");

            Key articleKey = keyFactory.newKey(payload.get("id").getAsString());

            datastore.delete(articleKey);
        }

        resp.sendRedirect("/magasins");
    }

    private JsonObject getPayload(HttpServletRequest req) throws IOException {
        StringBuilder buffer = new StringBuilder();
        BufferedReader reader = req.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        return new JsonParser().parse(buffer.toString()).getAsJsonObject();
    }
}
// [END gae_flex_datastore_app]
