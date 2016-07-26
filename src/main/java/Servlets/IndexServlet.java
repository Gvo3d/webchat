package Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Gvozd on 26.07.2016.
 */
public class IndexServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(5);


        out.println("Session interval is "+ session.getMaxInactiveInterval());

        Integer ival = (Integer) session.getAttribute("sesspeek.cntr");
        if (ival == null)
            ival = new Integer(1);
        else
            ival = new Integer(ival.intValue() + 1);
        session.setAttribute("sesspeek.cntr", ival);
        out.println("You have hit this page " + ival + " times.<p>");
        out.close();
    }
}
