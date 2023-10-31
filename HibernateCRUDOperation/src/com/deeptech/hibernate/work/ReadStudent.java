package com.deeptech.hibernate.work;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Student;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class ReadStudent {

	public static void main(String[] args) {
	      SessionFactory sf = HibernateUtil.connection();
	      Session ses = sf.openSession();
	    	ses.beginTransaction();//performs DML operation(insert,select,update,delete)
	    	//Collection Framework
	    	Query q =ses.createQuery("from Student");
	        List<Student> st = q.list();  
	        for(Student s:st)
	        {
	        	System.out.println(s.getStudentName()+"\t"+s.getRegNum()+"\t"+s.getCourse());
	        }
	        ses.getTransaction().commit();
	        ses.close();
	        sf.close();
		}
}