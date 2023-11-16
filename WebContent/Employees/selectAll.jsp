<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>직원 정보</h1>
<%
	java.time.LocalDateTime ld = java.time.LocalDateTime.now();
	request.setAttribute("ld", ld);
%>
<hr>
현재시간
<hr>
-${requestScope.ld }-
<fmt:parseDate value="${requestScope.ld }" 
pattern="yyyy-MM-dd'T'HH:mm:ss.SSS"
var="now" type="both" ></fmt:parseDate>
<hr>
<fmt:formatDate value="${now}" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"></fmt:formatDate>
<hr>
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
	<c:forEach items="${dtos }" var="employeesDto">	
		<tr>
			<td>${employeesDto.employee_id}</td>
        	<td><a href='/HRproject/Employees/selectOne.employees?employee_id=${employeesDto.employee_id }'>${employeesDto.first_name }</a></td>
        	<td>${employeesDto.last_name}</td>
        	<td>${employeesDto.email}</td>
        	<td>${employeesDto.phone_number}</td>
        	<td>${employeesDto.hire_date}</td>
        	<td>${employeesDto.job_id}</td>
        	<td>${employeesDto.salary}</td>
        	<td>${employeesDto.commission_pct}</td>
        	<td>${employeesDto.manager_id}</td>
        	<td>${employeesDto.department_id}</td>
		</tr>
	</c:forEach>
</table>
<a href="/HRproject/Employees/insert.jsp">사원추가</a>
</body>
</html>