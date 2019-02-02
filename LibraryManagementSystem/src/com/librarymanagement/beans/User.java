package com.librarymanagement.beans;
import java.time.LocalDate;
public class User {
	private String name;
	private String dOB;
    private String bloodGroup;
    private	String sex;
	private String branch;
	private String session;
	private String mobileno;
	private String rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", dOB=" + dOB + ", bloodGroup=" + bloodGroup + ", sex=" + sex + ", branch="
				+ branch + ", session=" + session + ", mobileno=" + mobileno + ", rollno=" + rollno + "]";
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
}
