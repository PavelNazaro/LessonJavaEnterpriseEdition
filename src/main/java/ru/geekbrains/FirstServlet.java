package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;
import java.io.Serializable;

public class FirstServlet implements Servlet, Serializable {
    private Logger logger = LoggerFactory.getLogger(FirstServlet.class);
    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("New request");

        res.getWriter().println("<h1>Hello World from servlet</h1>");
        res.getWriter().println("<p>attr1: " + req.getAttribute("attr1") + "</p>");
    }

    @Override
    public String getServletInfo() {
        return "Hello World!";
    }

    @Override
    public void destroy() {
        logger.info("FirstServlet class destroy");
    }
}
