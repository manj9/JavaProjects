package dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.biz.StudentPojo;
import com.controller.Details;

public class StudentDatabase {

	Map<String, StudentPojo> database = new HashMap<String, StudentPojo>();

	public void addstudent(StudentPojo add) {

		database.put(add.getName(), add);

		Set<String> keys = database.keySet();
		for (String key : keys) {
			StudentPojo stpo = database.get(key);
			System.out.println(key + "" + stpo);

		}
	}

	public void deletestudent(String key) {
		database.remove(key);

	}

}
