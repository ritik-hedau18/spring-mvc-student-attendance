<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Attendance</title>
</head>
<body>

      <h2>Enter Student Attendance</h2>
      
      <form action="checkAttendance">
      
      Student Name: <input type = "text" name = "name"> <br><br>
      Total Classes: <input type = "number" name = "classes"> <br><br>
      Attend Classes: <input type = "number" name = "attend"> <br><br>
      
      <input type = "submit" name = "Calculate Attendance">
      
      </form>

</body>
</html>