package com.drp.SpringbootApp.Model;

public class Branch {

	private String branch_id;
	private String branch_name;
	private String branch_code;
	
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public Branch(String branch_id, String branch_name, String branch_code) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_code = branch_code;
	}
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_code=" + branch_code + "]";
	}
	
	
	
	
	
}
