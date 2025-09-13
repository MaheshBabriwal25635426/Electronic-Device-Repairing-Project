
 <%@page import="javax.servlet.*" %>
 <%@page  import="javax.servlet.http.*" %>
 <%@page  import="java.sql.*" %>
<%@page import="javax.swing.*" %>
<html>
    <head>
<link rel='stylesheet' href='Feedback.css'>
</head>
<body>

<div id='mymenu'>


</div>

<div id='mydata'>
<%
    try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eservices?useSSL=false","root","root");
Statement st=con.createStatement();
String q="select * from Feedback";
ResultSet rs=st.executeQuery(q);
%>
<center>
<table cellpadding='12'>
<tr>
<td> Name</td>
<td> Email</td>
<td> Feedback</td>
</tr>
<%
while(rs.next())
{
    %>
<tr>
    <td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%= rs.getString(3) %></td>

</tr>
<%
}
%>
</table>
</center>
</div>
<% con.close();
}
    
catch(Exception e)
{
	
out.println(e);
}
%>
</body>
</html>

