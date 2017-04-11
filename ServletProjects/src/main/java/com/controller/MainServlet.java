package com.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	
	public class MainServlet extends HttpServlet {
		
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		Details details = new Details();
		details.details(req, res);
		PrintWriter out = res.getWriter();
		out.println("student details are saved");
		
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doGet(req,res);
	}
	}

