package com.javaex.ex12;

public class Student extends Person {

	// field
	private String schoolName;

	// constructor
	public Student() {
		super();
		System.out.println("Student()");
	}

	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}

	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	// method -g/s
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//method - general
	public void showInfo() {
		System.out.println("*이름: " + super.name + ", *나이: " + super.age+", *학교: "+this.schoolName);
	}
	
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", getName()=" + name + ", getAge()=" + age
				+ "]";
	}
}
