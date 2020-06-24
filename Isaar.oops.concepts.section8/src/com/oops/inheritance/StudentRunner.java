package com.oops.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName("anas");
		student.setEmail("isaarkhan@gmail.com");

		Person person = new Person();
		person.setName("ISAAR");
		person.setEmail("isaar33@gmail.com");
		person.setPhoneNumber("773-240-6189");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);

	}

	}


