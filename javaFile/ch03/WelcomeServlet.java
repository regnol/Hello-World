package org.wzl.yanyan;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		
		req.setCharacterEncoding("utf-8");
		
		res.setContentType("text/html;charset=utf-8");
		
		String msg = getInitParameter("hellow");
		
		String userName = req.getParameter("userName");
		String pwd = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		out.println("<html><head><title>welcome></title></head><body>");
		
		out.println("<div>"+msg+":"+userName+ "</div>");
		out.close();
		
	}
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		doGet(req,res);
	}
}
