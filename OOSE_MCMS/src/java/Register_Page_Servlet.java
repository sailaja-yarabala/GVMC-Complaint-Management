import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import java.sql.*;
import java.sql.SQLException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.ServletException;


@WebServlet(name="Register_Page_Servlet",urlPatterns="/Reg")
@MultipartConfig
public class Register_Page_Servlet extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
    {
        try{
            res.setContentType("text/html;charset=UTF-8");
            PrintWriter out= res.getWriter();
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String constr= "jdbc:oracle:thin:@localhost:1521:XE";
            Connection con = DriverManager.getConnection(constr,"system","system");
            out.println("Connected");
            String name=req.getParameter("name");
            String number=req.getParameter("number");
            String problem=req.getParameter("Problem");
            String description=req.getParameter("description");
            String location=req.getParameter("location");
            
            PreparedStatement statement = con.prepareStatement("insert into complaint values(?,?,?,?,?,?,?) ");
            statement.setInt(1,1);
            statement.setString(2, name);
            statement.setString(3, number);
            statement.setString(4, problem);
            statement.setString(5, description);
            statement.setString(6, location);
            statement.setString(7,"Pending");
            
            if(statement.executeUpdate()==1){
            out.println(problem);
            out.println("<h2 align=center>Complaint Registered Successfully</h2>");
            }
            else
                out.println("Insert failed");
            
            

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}