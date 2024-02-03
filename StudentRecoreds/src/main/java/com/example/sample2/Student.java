package com.example.sample2;

import java.util.Date;

import javax.xml.crypto.Data;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.*;
@Entity
@Table(name = "Student_Recored")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_Id")
	private Long id;
	private String Name;
	private String Cource;
	private String age;
	private String email;
	private String date;
	
	public Student() {
		super();
		
	}
	
	public Student(Long id, String name, String cource, String age, String email, String date) {
		super();
		this.id = id;
		this.Name = name;
		this.Cource = cource;
		this.age = age;
		this.email = email;
		this.date = date;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCource() {
		return Cource;
	}
	public void setCource(String cource) {
		Cource = cource;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
