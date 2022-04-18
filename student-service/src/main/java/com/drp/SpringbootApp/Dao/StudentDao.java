package com.drp.SpringbootApp.Dao;

import com.drp.SpringbootApp.Entity.Student;

public interface StudentDao {
	
	public Student saveStudent(Student student);
	public Student getStudent(String id);
	
	

}
