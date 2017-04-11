package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.Student;
import com.dao.Connect;

public class Details {

	public void details(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		Student std = new Student();
		String name = request.getParameter("name");
		std.setName(name);
		String tool = request.getParameter("tool");
		std.setTool(tool);
		String phone = request.getParameter("phone");
		std.setPhone(phone);
		String sex = request.getParameter("sex");
		std.setSex(sex);
		String address = request.getParameter("address");
		std.setAddress(address);
		String state = request.getParameter("state");
		std.setState(state);
		String country = request.getParameter("country");
		std.setCountry(country);

		Connect con = new Connect();
		con.conn(std);

	}
}

