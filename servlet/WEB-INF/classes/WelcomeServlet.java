import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String greeting;

    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        // super.init();
        greeting = getInitParameter("greeting");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doGet(req, resp);
        req.setCharacterEncoding("gb2312");
        String userName = req.getParameter("userName");
        String welcomeInfo = greeting + "," + userName;

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<html><head><title>");
        writer.println(("welcome"));
        writer.println("</title></head>");
        writer.println("<body>");
        writer.println(welcomeInfo);
        writer.println(("</body></html>"));
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doPost(req, resp);
        req.setCharacterEncoding("gb2312");
        String userName = req.getParameter("userName");

        String welcomeInfo = greeting + "," + userName;

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<htm><head><title>sss</title></head><body>"+welcomeInfo+"</body></html>");
        // doGet(req,resp);
    }
}