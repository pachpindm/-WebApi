package org.mayur.webapp.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mayur.webapp.student.database.StudentDatabase;
import org.mayur.webapp.student.model.Student;

public class StudentService {
	Map<Long, Student> studentData = StudentDatabase.getStudentData();

	public StudentService() {
		Student studentOne = new Student(1l, "Mayur", "Pachpind", 60L);
		Student studentTwo = new Student(2l, "Ganesh", "Pachpind", 70L);
		studentData.put(1l, studentOne);
		studentData.put(2l, studentTwo);
	}

	public Student CreateStudent(Student student) {
		student.setStudentId((long) (studentData.size() + 1));
		studentData.put(student.getStudentId(), student);
		return student;
	}

	public Student readStudent(Long studentId) {
		return studentData.get(studentId);
	}

	public Student updateStudent(Student student) {
		if (student.getStudentId() <= 0) {
			return null;
		}
		studentData.put(student.getStudentId(), student);
		return student;
	}

	public Student deleteStudent(Long studentId) {
		return studentData.remove(studentId);
	}

	public List<Student> getAllStudent() {
		return new ArrayList<Student>(studentData.values());
	}
}
