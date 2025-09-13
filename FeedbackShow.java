import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

import javax.swing.*;

public class FeedbackShow extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<link rel='stylesheet' href='FeedbackShow.css'>");
out.println("</head>");
out.println("<body>");

//out.println("<div id='mymenu'>");

//out.println(" <ul> <li> Home </li> <li><a href='Insertdemo.html'> Insert  </a> </li> <li> <a href='Searchdemo.html'>Search </a> </li> <li> <a href='ShowAll'>ShowAll <a/> </li> <li> <a href='Updatedemo.html'> Update </a> </li> <a href='Deletedemo.html'> <li> Delete </a> </li><li><a href='Logindemo.html'> LogOut </a> </li> <li> About </li> <li> Contact </li> </ul>");

out.println("</div>");

//out.println("<div id='mydata'>");

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eservices?useSSL=false","root","root");
Statement st=con.createStatement();
String q="select * from Feedback";
ResultSet rs=st.executeQuery(q);
out.println("<center>");
out.println("<table cellpadding='12'>");
out.println("<tr>");
out.println("<td> Name</td>");
out.println("<td> Email</td>");
out.println("<td> Feedback</td>");
out.println("</tr>");

while(rs.next())
{
out.println("<tr>");
out.println("<td>"+rs.getString(1)+"</td>");
out.println("<td>"+rs.getString(2)+"</td>");
out.println("<td>"+rs.getString(3)+"</td>");

out.println("</tr>");
}

out.println("</table>");
out.println("</center>");
out.println("</div>");
con.close();
}
catch(Exception e)
{
	
out.println(e);
}
out.println("</body>");
out.println("</html>");
out.close();
}

}

//set classpath=C:\Program Files\Apache Software Foundation\Tomcat 8.5\lib\servlet-api.jar;.;%classpath%