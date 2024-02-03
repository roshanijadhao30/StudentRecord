package com.example.sample2;

import java.util.List;

public interface StudentService {
	
	Student SaveStudent(Student student);
	
	List<Student> getAllStudent();
	
	Student getStudentId(Long id);
	
	Student Update(Student student);
	
	void deleteStudentById(Long id);
}
