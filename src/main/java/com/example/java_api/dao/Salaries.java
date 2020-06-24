package com.example.java_api.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salaries")
public class Salaries {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_no")
	private int emp_no;
	
	@Column(name="salary_id")
	private int salary_id;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="for_date")
	private Date for_date;
	
	@Column(name="to_date")
	private Date to_date;

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public int getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(int salary_id) {
		this.salary_id = salary_id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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

	public Salaries(int emp_no, int salary_id, int salary, Date for_date, Date to_date) {
		super();
		this.emp_no = emp_no;
		this.salary_id = salary_id;
		this.salary = salary;
		this.for_date = for_date;
		this.to_date = to_date;
	}

	public Salaries() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
