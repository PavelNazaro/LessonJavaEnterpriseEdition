package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstHttpServlet", urlPatterns = "/httpservlet/*")
public class FirstHttpServlet extends HttpServlet {

    private Logger logger = LoggerFactory.getLogger(FirstHttpServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>FirstHttpServlet</h1>");
        resp.getWriter().println("<p>getContextPath: " + req.getContextPath() + "</p>");
        resp.getWriter().println("<p>getPathTranslated: " + req.getPathTranslated() + "</p>");
        resp.getWriter().println("<p>getRequestURI: " + req.getRequestURI() + "</p>");
        resp.getWriter().println("<p>getRemoteHost: " + req.getRemoteHost() + "</p>");
        resp.getWriter().println("<p>getRemoteAddr: " + req.getRemoteAddr() + "</p>");
        resp.getWriter().println("<p>getLocalAddr: " + req.getLocalAddr() + "</p>");
        resp.getWriter().println("<p>getProtocol: " + req.getProtocol() + "</p>");
        resp.getWriter().println("<p>getRemotePort: " + req.getRemotePort() + "</p>");
        resp.getWriter().println("<p>getServerPort: " + req.getServerPort() + "</p>");
        resp.getWriter().println("<p>getLocalPort: " + req.getLocalPort() + "</p>");
        resp.getWriter().println("<p>getServletPath: " + req.getServletPath() + "</p>");
        resp.getWriter().println("<p>getPathInfo: " + req.getPathInfo() + "</p>");
        resp.getWriter().println("<p>getQueryString: " + req.getQueryString() + "</p>");
        resp.getWriter().println("<p>param1: " + req.getParameter("param1") + "</p>");
        resp.getWriter().println("<p>param2: " + req.getParameter("param2") + "</p>");

        resp.setHeader("Content-type", "text/html; charset=utf8");
//        resp.setStatus(202);
//        resp.sendRedirect("https://ya.ru");
//        resp.sendRedirect(req.getContextPath() + "/");
//        getServletContext().getRequestDispatcher("/").forward(req, resp);
        req.setAttribute("attr1", "value");
        getServletContext().getRequestDispatcher("/firstservlet").include(req, resp);
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").include(req, resp);
    }
}
