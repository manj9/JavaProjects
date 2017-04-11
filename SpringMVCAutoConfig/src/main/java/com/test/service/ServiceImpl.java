package com.test.service;

import org.springframework.stereotype.Service;

import com.test.beans.Person;

@Service
public class ServiceImpl implements MyService {

	public Person getPerson(Person person) {

		person.setName("manoj");
		person.setCity("Texas");

		return person;

	}

}
