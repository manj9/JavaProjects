package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.StudentPojo;

/**
 * Servlet implementation class Student
 */
public class Student extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());

//		Details details = new Details();
//		details.getDetails(request, response);
		response.setContentType("text/html");
		StudentPojo student = new StudentPojo();
		
		String name = request.getParameter("name");
		student.setName(name);
		String address = request.getParameter("address");
		student.setAddress(address);
		String phone = request.getParameter("phonenumber");
		student.setPhonenumber(phone);
		String state = request.getParameter("state");
		student.setState(state);
		System.out.println(student);
		PrintWriter out = response.getWriter();
		out.println("student details are saved");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
