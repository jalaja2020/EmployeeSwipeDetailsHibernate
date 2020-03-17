package com.hcl.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "EmployeeSwipe")
public class EmployeeSwipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empSwipeId;
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "HH:mm:ss")
	@Temporal(value=TemporalType.TIME)
	private Date empSwipeIn;
	@Temporal(value=TemporalType.TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "HH:mm:ss")
	private Date empSwipeOut;
	@Temporal(value=TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy")
	private Date empSwipeDate;
	
	private String location;
	
	@ManyToOne
	@JoinColumn(name="empId")
	Employee employee;
	
	public EmployeeSwipe() {
		super();
	}
	public EmployeeSwipe(int empSwipeId, Date empSwipeIn, Date empSwipeOut, Date empSwipeDate, String location) {
		super();
		this.empSwipeId = empSwipeId;
		this.empSwipeIn = empSwipeIn;
		this.empSwipeOut = empSwipeOut;
		this.empSwipeDate = empSwipeDate;
		this.location = location;
	}
	public int getEmpSwipeId() {
		return empSwipeId;
	}
	public void setEmpSwipeId(int empSwipeId) {
		this.empSwipeId = empSwipeId;
	}
	public Date getEmpSwipeIn() {
		return empSwipeIn;
	}
	public void setEmpSwipeIn(Date empSwipeIn) {
		this.empSwipeIn = empSwipeIn;
	}
	public Date getEmpSwipeOut() {
		return empSwipeOut;
	}
	public void setEmpSwipeOut(Date empSwipeOut) {
		this.empSwipeOut = empSwipeOut;
	}
	public Date getEmpSwipeDate() {
		return empSwipeDate;
	}
	public void setEmpSwipeDate(Date empSwipeDate) {
		this.empSwipeDate = empSwipeDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
