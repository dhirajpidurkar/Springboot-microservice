package com.drp.SpringbootApp.Services;

import com.drp.SpringbootApp.Entity.Branch;

public interface BranchServices {

	public Branch saveBranch(Branch branch);
	public Branch getBranch(String id);
	
}
