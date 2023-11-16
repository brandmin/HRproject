<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/HRproject/Employees/updateDB.employees" method="post">
	<table border="1" width="90%" id="employees">
		<tr>
			<th>employee_id</th>
			<th>first_name</th>
			<th>last_name</th>
			<th>email</th>
			<th>phone_number</th>
			<th>hire_date</th>
			<th>job_id</th>
			<th>salary</th>
			<th>commission_pct</th>
			<th>manager_id</th>
			<th>department_id</th>
		</tr>
		<tr>
			<input type="hidden" name="id" value="${requestScope.dto.employee_id }">
			<td>${requestScope.dto.employee_id }</td>
			<td><input type="text" name="first_name" value="${requestScope.dto.first_name }"></td>
			<td>${requestScope.dto.last_name}</td>
			<td>${requestScope.dto.email }</td>
			<td>${requestScope.dto.phone_number }</td>
			<td>${requestScope.dto.hire_date }</td>
			<td>${requestScope.dto.job_id }</td>
			<td>${requestScope.dto.salary }</td>
			<td>${requestScope.dto.commission_pct }</td>
			<td>${requestScope.dto.manager_id }</td>
			<td>${requestScope.dto.department_id }</td>
		</tr>
	</table>
	<a href="/HRproject/Employees/selectAll.employees">목록가기</a>
	<input type="submit" value="수정">
</form>
</body>
</html>