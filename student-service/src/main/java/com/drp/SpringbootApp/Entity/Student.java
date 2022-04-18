package com.drp.SpringbootApp.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {

	@Id
	private String student_id;
	private String name;
	private String branch_id;
	public Student(String student_id, String name, String branch_id) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.branch_id = branch_id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", branch_id=" + branch_id + "]";
	}
	
	
}
