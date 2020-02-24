
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * demo01.dispatcher.Portal
 */
public class PortalServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=gb2312");

        PrintWriter out = resp.getWriter();

        String name = req.getParameter("userName");
        String pwd = req.getParameter("pwd");

        out.println("<html><head><title>portal页面</title></head><body>");

        if ("zs".equals(name)&& "123".equals(pwd)) {
            ServletContext context = getServletContext();
            RequestDispatcher dispatcher = context.getRequestDispatcher("/welcome");
            dispatcher.forward(req, resp);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("login2");
            rd.include(req, resp);
        }

        out.println("</body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}