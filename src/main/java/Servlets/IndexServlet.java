package Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Gvozd on 26.07.2016.
 */
public class IndexServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<html>\n" +
                "<body>\n" +
                "<form action=\"AuthorizeServlet\" method=\"POST\">\n" +
                "First Name: <input type=\"text\" name=\"first_name\">\n" +
                "<br />\n" +
                "Password: <input type=\"text\" name=\"password\" />\n" +
                "<input type=\"submit\" value=\"Submit\" />    " + "<input type=\"register\" value=\"Register\" />\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
        out.close();
    }
}
