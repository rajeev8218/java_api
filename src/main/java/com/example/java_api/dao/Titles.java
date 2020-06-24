package com.example.java_api.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="titles")
public class Titles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="title_id")
	private int title_id;

	@Column(name="emp_no")
	private int emp_no;
	
	@Column(name="title")
	private String title;
	
	@Column(name="for_date")
	private Date for_date;
	
	@Column(name="to_date")
	private Date to_date;
	
	public int getTitle_id() {
		return title_id;
	}

	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Titles(int title_id, int emp_no, String title, Date for_date, Date to_date) {
		super();
		this.title_id = title_id;
		this.emp_no = emp_no;
		this.title = title;
		this.for_date = for_date;
		this.to_date = to_date;
	}

	public Titles() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
