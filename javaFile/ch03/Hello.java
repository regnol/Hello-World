import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;

public class Hello implements Servlet {
	
	private ServletConfig config;
	
	public void init(ServletConfig config){
		this.config = config;
	};
	
	public void destroy(){};
	
	public String getServletInfo() {
        return null;
    }
	
	public ServletConfig getServletConfig() {
        return config;
    }
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.print("hellow world_今天打老虎 这是使用Servlet接口实现的Servlet 实例");
        out.close();
	};
}