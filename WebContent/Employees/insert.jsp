<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="/HRproject/Employees/insertDB.employees" method="post">
		employee_id: <input type="text" name="employee_id"><br>
		first_name: <input type="text" name="first_name"><br>
		last_name: <input type="text" name="last_name"><br>
		email: <input type="text" name="email"><br>
		phone_number: <input type="text" name="phone_number"><br>
		hire_date: <input type="datetime-local" name="hire_date"><br>
		job_id: <input type="text" name="job_id"><br>
		salary: <input type="text" name="salary"><br>
		commission_pct: <input type="text" name="commission_pct"><br>
		manager_id: <input type="text" name="manager_id"><br>
		department_id: <input type="text" name="department_id"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>