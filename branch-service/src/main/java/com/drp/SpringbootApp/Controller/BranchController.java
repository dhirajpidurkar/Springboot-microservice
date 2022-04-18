package com.drp.SpringbootApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drp.SpringbootApp.Entity.Branch;
import com.drp.SpringbootApp.Services.BranchServices;

@RestController
@RequestMapping(value = "/branch")
public class BranchController {

	@Autowired
	private BranchServices service;
	
	@PostMapping(value = "/saveBranch")
	public Branch saveBranch(@RequestBody Branch branch) {
		
		return service.saveBranch(branch);
	}
	
	@RequestMapping(value = "/getBranch/{branch_id}",method = RequestMethod.GET)
	public Branch getBranch(@PathVariable String branch_id) {
		
		return service.getBranch(branch_id);
	}
}
