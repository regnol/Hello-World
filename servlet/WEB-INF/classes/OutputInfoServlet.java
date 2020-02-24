import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * OutputInfoServlet
 */
public class OutputInfoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // req.setCharacterEncoding("arg0");
        resp.setContentType("text/html;charset=gb2312");
        PrintWriter out = resp.getWriter();

        Enumeration e =  req.getHeaderNames();

        out.println("<html><head><title>info page</title><head>");
        out.println("<body><center><table border=1 align=center >");
        out.println("<caption>Servlet 接收到的http消息报头的信息</caption>");
        out.println("<tr bgcolor=#999999><td>消息报头的名字</td><td>消息报头的值</td><tr>");

        while (e.hasMoreElements()) {
            String name =(String) e.nextElement();
            String value = req.getHeader(name);
            out.print("<tr><td>"+name+"</td><td>"+value+"</td></tr>");
        }
        out.println("</table>");

        out.println("<table border=1 align=center><capion>其他访问信息</caption");
        out.println("<tr><td>客户端IP地址</td><td>"+req.getRemoteAddr()+"/td></tr>");
        out.println("<tr><td>客户端端口号</td><td>"+req.getRemotePort()+"/td></tr>");
        out.println("<tr><td>服务端的IP地址</td><td>"+req.getLocalAddr()+"/td></tr>");
        out.println("<tr><td>服务端的端口号</td><td>"+req.getLocalPort()+"/td></tr>");
        out.println("</table>");

        out.println("</center></body></html>");

        out.close();
    }
}