
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Login2Servlet
 */
public class Login2Servlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=gb2312");

        PrintWriter out = resp.getWriter();

        out.println("<html><head><title>登录页面,login2</title></head><body>");

        out.println("<form action=portal method=POST>");
        out.println("<div><input type=text name=userName> </div>");
        out.println("<div><input type=password name=pwd> </div>");
        out.println("<div><input type=submit value=登录> <input type=reset value=重置> </div>");
        out.println("</from></body>");

        // out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}