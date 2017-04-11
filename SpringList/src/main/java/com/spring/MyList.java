package com.spring;

import java.util.List;

public class MyList {

	private List studentList;

	public void setStudentList(List studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "MyList [studentList=" + studentList + "]";
	}

}
