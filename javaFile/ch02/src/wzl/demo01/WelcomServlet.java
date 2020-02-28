package src.wzl.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;

public class WelcomServlet implements Servlet {

    private ServletConfig config;

    public void destroy(){};

    public ServletConfig getServletConfig(){
        return config;
    }

    public String getServletInfo() {
        return null;
    }

    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException {
        PrintWriter out = res.getWriter();
        out.print("hellow world_今天打老虎");
        out.close();
    }
}