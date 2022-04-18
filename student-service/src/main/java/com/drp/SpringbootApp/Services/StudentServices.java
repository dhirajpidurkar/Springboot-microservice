package com.drp.SpringbootApp.Services;

import com.drp.SpringbootApp.Entity.Student;
import com.drp.SpringbootApp.Model.ResponseTemplateVO;

public interface StudentServices {

	public Student saveStudent(Student student);
	public Student getStudent(String id);
	public ResponseTemplateVO getStudentwithBranch(String id);
	
}
