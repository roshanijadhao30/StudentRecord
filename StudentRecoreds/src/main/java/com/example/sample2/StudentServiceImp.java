package com.example.sample2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

@Service
public class StudentServiceImp implements StudentService {
	
    private StudentRepository studentRepo;
    
    
	public StudentServiceImp(StudentRepository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}


	@Override
	public Student SaveStudent(Student student) {
		
		return studentRepo.save(student);
	}


	@Override
	public List<Student> getAllStudent() {
		
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void deleteStudentById(Long id) {
	
		studentRepo.deleteById(id);
	}


	@Override
	public Student getStudentId(Long id) {
		
		return studentRepo.findById(id).get();
	}


	@Override
	public Student Update(Student student) {
		
		return studentRepo.save(student);
	}
	
}
