import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * LoginServlet
 */
public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doPost(req, resp);
        String userName = req.getParameter("userName");
        String pwd = req.getParameter("pwd");

        if (userName != null && pwd != null && userName.equals("a") && pwd.equals("pwd")) {
            resp.sendRedirect("success.html");
        } else {
            resp.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE,"输入不正确");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}