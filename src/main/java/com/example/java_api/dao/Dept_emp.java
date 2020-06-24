package com.example.java_api.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept_emp")
public class Dept_emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dept_id")
	private int dept_id;
	
	@Column(name="emp_no")
	private int emp_no;
	
	@Column(name="dept_no")
	private int dept_no;
	
	@Column(name="for_date")
	private Date for_date;
	
	@Column(name="to_date")
	private Date to_date;

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	public Date getFor_date() {
		return for_date;
	}

	public void setFor_date(Date for_date) {
		this.for_date = for_date;
	}

	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	public Dept_emp(int dept_id, int emp_no, int dept_no, Date for_date, Date to_date) {
		super();
		this.dept_id = dept_id;
		this.emp_no = emp_no;
		this.dept_no = dept_no;
		this.for_date = for_date;
		this.to_date = to_date;
	}

	public Dept_emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	
	
	
}
