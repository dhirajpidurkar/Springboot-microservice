package com.drp.SpringbootApp.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.drp.SpringbootApp.Entity.Branch;

@Repository
public class BranchDao_impl implements BranchDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public Branch saveBranch(Branch branch) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(branch);
		tr.commit();
		return branch;
	}

	@Override
	public Branch getBranch(String id) {
		Session session = sf.openSession();
		Branch branch = session.get(Branch.class, id);
		return branch;
	}

}
