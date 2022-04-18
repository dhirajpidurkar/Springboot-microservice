package com.drp.SpringbootApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drp.SpringbootApp.Entity.Student;
import com.drp.SpringbootApp.Model.ResponseTemplateVO;
import com.drp.SpringbootApp.Services.StudentServices;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentServices service;
	
	@PostMapping(value = "/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		
		return service.saveStudent(student);
	}
	
	@RequestMapping(value = "/getStudent/{student_id}",method = RequestMethod.GET)
	public Student getStudent(@PathVariable String student_id) {
		
		return service.getStudent(student_id);
	}
	
	@GetMapping(value = "/getStudentwithBranch/{student_id}")
	public ResponseTemplateVO getStudentwithBranch(@PathVariable String student_id) {
		
		return service.getStudentwithBranch(student_id);
		
		
	}
}
