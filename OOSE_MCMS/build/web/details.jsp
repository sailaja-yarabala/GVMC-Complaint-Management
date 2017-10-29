<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="javax.servlet.http.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
   
</script>
    <title>Registration</title>
    <link REL="StyleSheet" TYPE="text/css" HREF="Register_Page.css">
    </head>


<body>
    <div class="main">
        <div class="header">
            <div class="logo">
            <br/>
            <img src = "images/logo.png" alt='logo'>
            </div>
        </div>
        <%
            try
            {

                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    String constr= "jdbc:oracle:thin:@localhost:1521:XE";
                    Connection con = DriverManager.getConnection(constr,"system","system");
                    out.println("Connected");

                    String sqlString = "SELECT * FROM complaint";
                    Statement st = con.createStatement();
                    ResultSet rs=st.executeQuery(sqlString);
        %>
        <form action="Reg">
            <div class="register_form animated fadeInUp">
                <div class="box-header">
                    <h2>Complaint Details</h2>
                </div>
                
         <%   
            String name=(String)session.getAttribute("user");
            while(rs.next())
            {   
                if(rs.getString(2).equals(name));
                {  
        %>          
                <table border=0 cellpadding=10 align=center>
                    <tr>
                        <td>Name :</td>
                        <td><%out.print(rs.getString("name")); %></td>
                    </tr>
                    <tr>
                            <td>Contact No. :</td>
                            <td><%out.print(rs.getString(3)); %></td>
                    </tr>
                    <tr>
                            <td>Complaint Type :</td>
                            <td>
                                <%out.print(rs.getString(4)); %>
                            </td>
                    </tr>
                    <tr>
                            <td>Description :</td>
                            <td><%out.print(rs.getString(5)); %></td>
                    </tr>
                    <tr>
                            <td>Location :</td>
                            <td><%out.print(rs.getString(6)); %></td>
                    </tr>  
                    <tr>
                            <td>Status :</td>
                            <td><%out.print(rs.getString(7)); %></td>
                    </tr> 
                    <tr>
                            
                             <td>
                            <select name="Status">
                            <option value="Pending">Pending</option>
                            <option value="Completed">Completed</option>
                            </select>
                            </td>
                            <td>
                            <input type="button" value="Update Status" >
                            </td>
                    </tr> 
                </table>
                <%
                }
            }
                %>
            </div>
                    
                     <%
                 
                    rs.close();
                    st.close();
                    con.close();
            }catch(Exception e){e.printStackTrace();}    

        %>
        </form>
    </div>
</body>
</html>