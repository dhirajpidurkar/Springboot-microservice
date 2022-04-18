package com.drp.SpringbootApp.Dao;

import com.drp.SpringbootApp.Entity.Branch;

public interface BranchDao {
	
	public Branch saveBranch(Branch branch);
	public Branch getBranch(String id);
	
	

}
