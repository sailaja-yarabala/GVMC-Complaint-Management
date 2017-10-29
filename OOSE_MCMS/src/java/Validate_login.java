import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import java.sql.*;
import javax.servlet.RequestDispatcher;

@WebServlet(name="Validate_login",urlPatterns="/Login")
public class Validate_login extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res)
    {
        try{
            res.setContentType("text/html;charset=UTF-8");
            PrintWriter out= res.getWriter();
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String constr= "jdbc:oracle:thin:@localhost:1521:XE";
            Connection con = DriverManager.getConnection(constr,"system","system");
            out.println("Connected");
            
            String usrname=req.getParameter("usrname");
            String pwd=req.getParameter("pwd");
            
            Statement st=con.createStatement();
            String qry="select * from login";
            ResultSet rs= st.executeQuery(qry);
            int flag=0;
            while(rs.next())
            {
                if(rs.getString(1).equals(usrname))
                {
                    if(rs.getString(2).equals(pwd))
                    {
                        //res.sendRedirect("/complaint_details.html");
                        //String path= "/display";
                        RequestDispatcher dispatcher =req.getRequestDispatcher("complaint_details.jsp");
                        dispatcher.forward(req,res);
                        flag=1;
                    }
                }
            }
                if(flag==0)
                {
                    res.sendRedirect("AdminLogin.html");
                }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}