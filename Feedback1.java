import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Feedback1 extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("u1");
		String s2=request.getParameter("u2");
		String s3=request.getParameter("u3");
		
		out.println("<html>");
		out.println("<body>");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eservices?useSSL=false","root","root");
			Statement st=con.createStatement();
			String q="insert into Feedback values('"+s1+"','"+s2+"','"+s3+"')";
			int x=st.executeUpdate(q);
			//response.sendRedirect(".html");
//			out.println("<div id='mymenu'>");
			out.println("<center>");
			out.println("<table>");
			if(x!=0)
			{
                          response.sendRedirect("FeedbackShow1.jsp");
//out.println("<h1>Data Insert</h1>");
			}
			else
			{
				out.println("<h1>Data  Not Insert</h1>");
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