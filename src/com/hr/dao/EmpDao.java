package com.hr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hr.dto.DepartmentsDto;
import com.hr.dto.EmpDto;
import com.hr.dto.EmployeesDto;
import com.hr.util.DBConn;

public class EmpDao {
	
	//사번으로 본인정보 및 부서 전체 조회
	public EmpDto selectId(Integer employee_id) {
		EmpDto resultDtos=new EmpDto();
		ResultSet rs=DBConn.statementQuery(String.format("select e.*,d.* from employees e,departments d where e.department_id = d.department_id and employee_id=%d;", employee_id));
		
		if(rs!=null) {
			try {
				rs.next();
				resultDtos=new EmpDto(new EmployeesDto(rs.getInt("employee_id"),
											rs.getString("first_name"),
											rs.getString("last_name"),
											rs.getString("email"),
											rs.getString("phone_number"),
											rs.getTimestamp("hire_date").toLocalDateTime(),
											rs.getString("job_id"),
											rs.getDouble("salary"),
											rs.getDouble("commission_pct"),
											rs.getInt("manager_id"),
											rs.getInt("department_id")),
											(new DepartmentsDto (rs.getInt("department_id"),rs.getInt("location_id"),
											rs.getString("department_name"),rs.getInt("manager_id"))));
			}catch(SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return resultDtos;
	}
	//사번으로 부서이름과 부서 id 출력
	public EmpDto selectDep(Integer employee_id) {
		EmpDto resultDtos=new EmpDto();
		ResultSet rs=DBConn.statementQuery(String.format("select d.department_name,d.department_id from employees e,departments d where e.department_id = d.department_id and employee_id=%d;", employee_id));
		
		if(rs!=null) {
			try {
				rs.next();
				resultDtos=new EmpDto(new EmployeesDto(rs.getInt("employee_id"),
											rs.getString("first_name"),
											rs.getString("last_name"),
											rs.getString("email"),
											rs.getString("phone_number"),
											rs.getTimestamp("hire_date").toLocalDateTime(),
											rs.getString("job_id"),
											rs.getDouble("salary"),
											rs.getDouble("commission_pct"),
											rs.getInt("manager_id"),
											rs.getInt("department_id")),
											(new DepartmentsDto (rs.getInt("department_id"),rs.getInt("location_id"),
											rs.getString("department_name"),rs.getInt("manager_id"))));
			}catch(SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return resultDtos;
	}
	//부서별 사원 정보 출력
	public EmpDto selectDeoEmp(Integer department_id) {
		EmpDto resultDtos=new EmpDto();
		ResultSet rs=DBConn.statementQuery(String.format("select e.first_name,d.department_name from employees e,departments d where e.department_id = d.department_id and d.department_id=%d;", department_id));
		
		if(rs!=null) {
			try {
				rs.next();
				resultDtos=new EmpDto(new EmployeesDto(rs.getInt("employee_id"),
											rs.getString("first_name"),
											rs.getString("last_name"),
											rs.getString("email"),
											rs.getString("phone_number"),
											rs.getTimestamp("hire_date").toLocalDateTime(),
											rs.getString("job_id"),
											rs.getDouble("salary"),
											rs.getDouble("commission_pct"),
											rs.getInt("manager_id"),
											rs.getInt("department_id")),
											(new DepartmentsDto (rs.getInt("department_id"),rs.getInt("location_id"),
											rs.getString("department_name"),rs.getInt("manager_id"))));
			}catch(SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return resultDtos;
	}
}