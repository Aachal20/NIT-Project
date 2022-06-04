package com.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EMPLOYEE_DETAILS")
@Data
public class Employee {

	@Id
	@GeneratedValue
	private Integer empno;
	
	@Column(name="EMP_NAME" ,length=20)
	private String ename;
	
	@Column(name="EMP_JOB" ,length=20)
	private String job;
	
	@Column(name="EMP_DEPTNO")
	private Integer  deptno;
	
	@Column(name="EMP_SALARY")
	private Double sal;
}
