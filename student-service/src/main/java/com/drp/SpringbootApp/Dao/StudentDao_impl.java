package com.drp.SpringbootApp.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.drp.SpringbootApp.Entity.Student;

@Repository
public class StudentDao_impl implements StudentDao {
	
	@Autowired
	private SessionFactory sf;

	@Override
	public Student saveStudent(Student student) {
		Session session =sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(student);
		tr.commit();
		return student;
	}

	@Override
	public Student getStudent(String id) {
		Session session =sf.openSession();
		Student student = session.get(Student.class, id);
		return student;
	}

}
