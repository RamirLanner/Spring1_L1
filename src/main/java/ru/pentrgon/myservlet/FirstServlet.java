package ru.pentrgon.myservlet;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "MyServlet", urlPatterns = "/go")
public class FirstServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.getWriter().printf("<html><body><h1>Hello world</h1></body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.getWriter().printf("Hello world");
    }

    @Override
    public void destroy() {
        //super.destroy();
        logger.debug("Destroy");
    }

    @Override
    public void init() throws ServletException {
        //super.init();

        logger.debug("Init");
    }
}
