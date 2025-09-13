import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class GetRepair extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("u1");
		String s2=request.getParameter("u2");
		String s3=request.getParameter("u3");
                String s4=request.getParameter("u4");
                String s5=request.getParameter("u5");
                String s6=request.getParameter("u6");
                String s7=request.getParameter("u7");
                String s8=request.getParameter("u8");
                String s9=request.getParameter("u9");
		out.println("<html>");
		out.println("<body>");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eservices?useSSL=false","root","root");
			Statement st=con.createStatement();
			String q="insert into GetRepair values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"')";
			st.executeUpdate(q);
//			response.sendRedirect("Logindemo.html");
//                        JOptionPane.showMessageDialog(null," Your Request sent successfully");
			out.println("<h1>Your Request sent successfully</h1>");
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
