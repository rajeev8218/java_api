package com.example.java_api.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept_manager")
public class Dept_manager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="manager_id")
	private int manager_id;

	@Column(name="dept_no")
	private int dept_no;
	
	@Column(name="emp_no")
	private int emp_no;
	
	@Column(name="for_date")
	private Date for_date;
	
	@Column(name="to_date")
	private Date to_date;
	
	
	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
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

	public Dept_manager(int manager_id, int dept_no, int emp_no, Date for_date, Date to_date) {
		super();
		this.manager_id = manager_id;
		this.dept_no = dept_no;
		this.emp_no = emp_no;
		this.for_date = for_date;
		this.to_date = to_date;
	}

	public Dept_manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
