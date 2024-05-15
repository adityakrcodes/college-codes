<%@page import = "java.sql.*" %>
<%@page import = "java.io.*" %>
<html>
	<head>
		<title>Connection with mysql database</title>
	</head>
	<body>
		<h1>Connection Status</h1>
		<%
			try{
				String connectionUrl = "jdbc:mysql://localhost:3306/test";
				Connection connect = null;
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				connect = DriverManager.getConnection(connectionUrl, "root", "");
				if(!connect.isClosed()){
					out.println("Successfully connected to " + "MySQL server using TCP/IP...");
					connect.close();
				}
			}
			catch(Exception ex){
				out.println("Unable to connect to Database");
			}
			
		%>
				
	</body>
</html>