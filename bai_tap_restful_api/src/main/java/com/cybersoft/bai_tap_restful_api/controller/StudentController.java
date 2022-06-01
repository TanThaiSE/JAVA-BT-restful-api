package com.cybersoft.bai_tap_restful_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.bai_tap_restful_api.pojo.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/addrequestparam")
	public List<Student> addStudentParam(@RequestParam("ten") String name,@RequestParam("tuoi") int age){
		List<Student>lst=new ArrayList<Student>();
		Student st=new Student(name, age);
		lst.add(st);
		return lst;
	}
	
	@GetMapping("/addpathvariable/{ten}/{tuoi}")
	public List<Student> addStudentPathVariable(@PathVariable("ten") String name,@PathVariable("tuoi")int age){
		List<Student>lst=new ArrayList<Student>();
		Student st=new Student(name, age);
		lst.add(st);
		return lst;
	}
	
	@PostMapping("/addrequestbody")
	public List<Student> addStudentRequestBody(@RequestBody Student st){
		List<Student>lst=new ArrayList<Student>();
		lst.add(st);
		return lst;
	}
}
