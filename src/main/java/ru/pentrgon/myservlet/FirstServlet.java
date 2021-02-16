package ru.pentrgon.myservlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;

//@WebServlet(name = "MyServlet", urlPatterns = "/go")
public class FirstServlet extends HttpServlet {

    private Product[] products;


    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.getWriter().printf("<html><body><h1>Product list</h1></body></html>");
        for (Product product : products) {
            resp.getWriter().println(product.toString());
        }

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
        products =new Product[10];
        for (int i =0; i<products.length;i++){
            products[i] = new Product(i, "Product "+i, (i+12)*100);
        }

        logger.debug("Init");
    }
}
