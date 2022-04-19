package com.drp.SpringbootApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.drp.SpringbootApp.Dao.StudentDao;
import com.drp.SpringbootApp.Entity.Student;
import com.drp.SpringbootApp.Model.Branch;
import com.drp.SpringbootApp.Model.ResponseTemplateVO;

@Service
public class StudentService_impl implements StudentServices {

	@Autowired
	private StudentDao dao;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Student saveStudent(Student student) {
		
		return dao.saveStudent(student);
	}

	@Override
	public Student getStudent(String id) {
		
		return dao.getStudent(id);
	}

	@Override
	public ResponseTemplateVO getStudentwithBranch(String id) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Student student= dao.getStudent(id);
		Branch branch = restTemplate.getForObject("http://BRANCH-SERVICE/branch/getBranch/"+ student.getBranch_id(),Branch.class);
		vo.setStudent(student);
		vo.setBranch(branch);
		return vo;
	}

}
