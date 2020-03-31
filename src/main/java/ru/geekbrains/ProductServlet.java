package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    private Logger logger = LoggerFactory.getLogger(FirstHttpServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("doGet Product");
        List<Product> products = new ArrayList<>();
        products.add(new Product(-1L, "Product1", "Desc1", new BigDecimal(10)));
        products.add(new Product(-1L, "Product2", "Desc2", new BigDecimal(17)));
        products.add(new Product(-1L, "Product3", "Desc3", new BigDecimal(22)));
        products.add(new Product(-1L, "Product4", "Desc4", new BigDecimal(31)));
        products.add(new Product(-1L, "Product5", "Desc5", new BigDecimal(44)));
        products.add(new Product(-1L, "Product6", "Desc6", new BigDecimal(56)));
        products.add(new Product(-1L, "Product7", "Desc7", new BigDecimal(59)));
        products.add(new Product(-1L, "Product8", "Desc8", new BigDecimal(99)));
        products.add(new Product(-1L, "Product9", "Desc9", new BigDecimal(103)));

        req.setAttribute("products", products);
        getServletContext().getRequestDispatcher("/product.jsp").forward(req, resp);
    }
}
