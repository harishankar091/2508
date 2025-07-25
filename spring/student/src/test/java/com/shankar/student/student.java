package com.shankar.student;

public class student {
	private int sid;
	private String sname;
	private String course;

	// setters and getters
	public int getsid() {
		return sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void studentinfo() {
		System.out.println("student id: " + sid);
		System.out.println("student name: " + sname);
		System.out.println("student course: " + course);

	}


}
