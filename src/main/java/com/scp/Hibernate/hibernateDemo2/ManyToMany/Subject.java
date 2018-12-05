package com.scp.Hibernate.hibernateDemo2.ManyToMany;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

public class Subject {
private int subNo;
private String subName;

@ManyToMany(cascade=CascadeType.ALL)
List<StudentInfo> stuInfo;

public Subject(int subNo, String subName, List<StudentInfo> stuInfo) {
	super();
	this.subNo = subNo;
	this.subName = subName;
	this.stuInfo = stuInfo;
}

public Subject() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Subject [subNo=" + subNo + ", subName=" + subName + ", stuInfo=" + stuInfo + "]";
}

public int getSubNo() {
	return subNo;
}

public void setSubNo(int subNo) {
	this.subNo = subNo;
}

public String getSubName() {
	return subName;
}

public void setSubName(String subName) {
	this.subName = subName;
}

public List<StudentInfo> getStuInfo() {
	return stuInfo;
 }
public void setStuInfo(List<StudentInfo> stuInfo) {
	this.stuInfo = stuInfo;
 }
}
