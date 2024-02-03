package com.example.sample2;

import java.lang.ProcessBuilder.Redirect;
import com.example.sample2.StudentService;

import org.hibernate.type.TrueFalseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceImp studentservice;
	
	@GetMapping("/students")
	public String ListStudent(Model model) {
		model.addAttribute("students", studentservice.getAllStudent());
		return "students";
	}
	
	@GetMapping("/student/new")
	public String get(Model model) {
    	Student student = new Student();
		model.addAttribute("student", student);
		return "about.html";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("Student") Student student) {
		studentservice.SaveStudent(student);
		return "redirect:/students";
	}
	
	@RequestMapping("/students/{id}")
	public String handler(@PathVariable("id") Long id) {
		studentservice.deleteStudentById(id);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String EditFrom(@PathVariable("id") Long id, Model model) {
		model.addAttribute("student", studentservice.getStudentId(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String update(@PathVariable("id") Long id, @ModelAttribute("Student") Student student, Model model ) {
		Student st = studentservice.getStudentId(id);
		st.setId(id);
		st.setName(student.getName());
		st.setCource(student.getCource());
		st.setAge(student.getAge());
		st.setEmail(student.getEmail());
		st.setDate(student.getEmail());
		
		studentservice.Update(student);
		return "redirect:/students";
	}
}
