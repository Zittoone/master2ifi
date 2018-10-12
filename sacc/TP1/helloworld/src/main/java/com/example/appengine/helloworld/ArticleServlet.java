package com.example.appengine.helloworld;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ArticleServlet
 */
public class ArticleServlet extends HttpServlet {

    private static final long serialVersionUID = -92037165009171105L;
    private Gson _gson = null;
    private List<Article> articles;

    // Adds some default models to our db
    public ArticleServlet() {
        super();

        _gson = new Gson();
        articles = new ArrayList<>();

        articles.add(new Article("Sarbacane", 10., 50));
        articles.add(new Article("Arroisoir", 12., 50));
        articles.add(new Article("Casquette", 19.99, 50));
        articles.add(new Article("Bandana", 9.99, 50));

    }

    // a utility method to send object
    // as JSON response
    private void sendAsJson(HttpServletResponse response, Object obj) throws IOException {

        response.setContentType("application/json");

        String res = _gson.toJson(obj);

        PrintWriter out = response.getWriter();

        out.print(res);
        out.flush();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        sendAsJson(resp, articles);
    }

    // Adds new model in DB
    // POST/JavaViewer/models
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String pathInfo = request.getPathInfo();

        if(pathInfo == null || pathInfo.equals("/")){

            StringBuilder buffer = new StringBuilder();
            BufferedReader reader = request.getReader();
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }

            String payload = buffer.toString();

            Article a = _gson.fromJson(payload, Article.class);

            articles.add(a);

            sendAsJson(response, a);
        }
        else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
    }
}