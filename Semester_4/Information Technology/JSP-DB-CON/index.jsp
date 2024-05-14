<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Database ke sath sambandh</title>
</head>
<body>
	<h1>
		DATABASE aur JSP ka Rishta
	</h1>
	<%
		try{
			String connectionUrl = "jdbc:mysql://localhost:3306/asec";
			Connection connect = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection(connectionUrl, "root", "");
			if(!connect.isClosed()){
				out.println("Rishta sampurn hua!");
				connect.close();
			}
		} catch(Exception ex){
			out.println("Rishta mai darar hai, firse koshish kare!");
		}
	%>
</body>
</html>