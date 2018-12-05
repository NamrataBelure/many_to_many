package com.scp.Hibernate.hibernateDemo2.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudMain {

	public static void main(String[] args) {
	List<StudentInfo>stud=new ArrayList<StudentInfo>();
	StudentInfo si1=new StudentInfo(1, "anu",null );
	StudentInfo si2=new StudentInfo(2, "rupa",null);
	StudentInfo si3=new StudentInfo(3, "deepa",null);
	stud.add(si1);
	stud.add(si2);
	stud.add(si3);
	
	List<StudentInfo>stud1=new ArrayList<StudentInfo>();
	stud1.add(si1);
	stud1.add(si3);
	
	List<Subject>sub=new ArrayList<Subject>();
	Subject s1=new Subject(11,"java",null);
	Subject s2=new Subject(12, "sql",null);
	Subject s3=new Subject(13, "oracle",null);
	sub.add(s1);
	sub.add(s2);
	sub.add(s3);
	
	List<Subject>sub1=new ArrayList<Subject>();
	Subject s11=new Subject(21,"java1",null);
	Subject s21=new Subject(22, "sql1",null);
	
	s1.setStuInfo(stud);
	s1.setStuInfo(stud1);
	
	si1.setSubject(sub);
	si2.setSubject(sub1);
	
	SessionFactory factoy=new Configuration().configure("/com/scp/Hibernate/hibernateDemo2/ManyToMany/hibernate.cfg.xml").addAnnotatedClass(StudentInfo.class).addAnnotatedClass(Subject.class).buildSessionFactory();
    Session session=factoy.openSession();
    Transaction tr=session.beginTransaction();
    
    session.save(s2);
    session.save(s21);
    session.save(s11);
    System.out.println("student data updated....");
    session.save(sub1);
    session.save(sub);
    tr.commit();
    session.close();
    System.out.println("subject updated....");
	}

}
