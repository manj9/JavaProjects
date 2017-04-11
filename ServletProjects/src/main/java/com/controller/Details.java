package com.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.Student;
import com.dao.Connect;

public class Details {
	public void details(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		Student emp = new Student();
		String name = req.getParameter("name");
		emp.setName(name);
		String tool = req.getParameter("tool");
		emp.setTool(tool);
		String phone = req.getParameter("phone");
		emp.setPhone(phone);
		String sex = req.getParameter("sex");
		emp.setSex(sex);
		String address = req.getParameter("address");
		emp.setAddress(address);
		String state = req.getParameter("state");
		emp.setState(state);
		String country = req.getParameter("country");
		emp.setCountry(country);

		Connect con = new Connect();
		con.conn(emp);

	}
}
