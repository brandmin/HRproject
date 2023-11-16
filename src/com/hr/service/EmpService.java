package com.hr.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.dao.EmpDao;
import com.hr.dto.EmpDto;

public class EmpService {
public static EmpDao empDao = new EmpDao();
	
	public static void selectId(HttpServletRequest request, HttpServletResponse response) {
		EmpDto dto = empDao.selectId(
				Integer.parseInt(request.getParameter("employee_id")));
		request.setAttribute("dto", dto);		
	}
	
	public static void selectDepId(HttpServletRequest request, HttpServletResponse response) {
		EmpDto dto = empDao.selectId(
				Integer.parseInt(request.getParameter("employee_id")));
		request.setAttribute("dto", dto);		
	}
	
	public static void selectDepEmp(HttpServletRequest request, HttpServletResponse response) {
		EmpDto dto = empDao.selectId(
				Integer.parseInt(request.getParameter("department_id")));
		request.setAttribute("dto", dto);		
	}
}
