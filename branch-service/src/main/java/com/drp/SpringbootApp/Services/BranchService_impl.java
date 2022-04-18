package com.drp.SpringbootApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drp.SpringbootApp.Dao.BranchDao;
import com.drp.SpringbootApp.Entity.Branch;
@Service
public class BranchService_impl implements BranchServices {

	@Autowired
	private BranchDao dao;
	
	@Override
	public Branch saveBranch(Branch branch) {
		
		return dao.saveBranch(branch);
	}

	@Override
	public Branch getBranch(String id) {
		
		return dao.getBranch(id);
	}

}
