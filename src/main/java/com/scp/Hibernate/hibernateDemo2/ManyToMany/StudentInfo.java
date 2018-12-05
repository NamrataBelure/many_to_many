package com.scp.Hibernate.hibernateDemo2.ManyToMany;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="studentinfo")
public class StudentInfo {
@Id
 private int rollNo;
 private String name;
 
 @ManyToMany(cascade=CascadeType.ALL)
 @JoinColumn
List<Subject> subject;

public StudentInfo(int rollNo, String name, List<Subject> subject) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.subject = subject;
}

public StudentInfo() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "StudentInfo [rollNo=" + rollNo + ", name=" + name + ", subject=" + subject + "]";
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Subject> getSubject() {
	return subject;
}

public void setSubject(List<Subject> subject) {
	this.subject = subject;
}
}
