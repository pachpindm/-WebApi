package org.mayur.webapp.student.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	Long studentId;
	String studentFirstName;
	String studentLastName;
	Long studentMarks;

	public Student() {
	}

	public Student(Long studentId, String studentFirstName, String studentLastName, Long studentMarks) {
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentMarks = studentMarks;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public Long getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(Long studentMarks) {
		this.studentMarks = studentMarks;
	}

}
