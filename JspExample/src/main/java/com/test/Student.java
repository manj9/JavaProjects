package com.test;

public class Student {
	String studentName,stdCity;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}
}
/*
 *xml for this 
 *<bean id="xyz" class="com.test.Student">
 *<property name="studentName" value=""/>
 * <property name="stdCity" value=""/>
</bean>
 * 
 */
public class Customer{
	String custName,custCountry;
	
	public void setCustName(String custName){
		
		this.custName = custName;
	}
public void setCustCountry(String custCountry){
		
		this.custCountry = custCountry;
	}
}
