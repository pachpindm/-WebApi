package org.mayur.webapp.student.database;

import java.util.HashMap;
import java.util.Map;

import org.mayur.webapp.student.model.Student;

public class StudentDatabase {

	public static Map<Long, Student> studentData = new HashMap<Long, Student>();

	public static Map<Long, Student> getStudentData() {
		return studentData;
	}

}
