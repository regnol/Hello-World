import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * CounterServlet
 */
public class CounterServlet extends HttpServlet{

    private ServletConfig config ;

    @Override
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        // super.init(config);
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doGet(req, resp);
        ServletContext context = config.getServletContext();

        Integer count = null;

        synchronized(context){
            count =(Integer) context.getAttribute("count");
            if (count == null) {
                count = 1;
            } else {
                count += 1;
            }


            context.setAttribute("count", count);
        }

        resp.setContentType("text/html;utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>流量哦统计</title></head><body>");
        out.println("<p>页面访问次数</p><p>");
        out.println(count);
        out.println("</p></body></html");
        out.close();
    }
}