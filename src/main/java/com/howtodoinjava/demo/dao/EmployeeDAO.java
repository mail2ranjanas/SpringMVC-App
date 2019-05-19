package com.howtodoinjava.demo.dao;

import java.util.List;

import com.howtodoinjava.demo.model.EmployeeVO;

/*
 * The emplloyee class
 */
public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
	
	
}