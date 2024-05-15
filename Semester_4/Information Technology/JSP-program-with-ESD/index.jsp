<%@page import="java.time.Month" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Scripting Tags</title>
	</head>
	<body>
		convert a string to upper case:
		<% new String("HelloWorld").toUpperCase(); %>
		<%
			for(Month month:Month.values()){
				out.println("<br>"+month);
			}
		%>
		<%!
			int cube(int n){
				return n*n*n;
			}
		%>
		<% out.println("<br> Cube of 3 is: " + cube(3)); 
		%>
		
	</body>
</html>