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
    <title>Complaint Details</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link REL="StyleSheet" TYPE="text/css" HREF="complaint_details.css">
</head>
       <div class="main">
        <div class="header">
            <div class="logo">
            <br/>
            <img src = "images/logo.png" alt='logo'>
            </div>
        </div>
        <br/>
        <br/>
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
        <form>
            <div class="register_form" >
                <table id="customers" align=center>
       
                  <tr>
                    <th>NAME</th>
                    <th>COMPLAINT  TYPE</th>
                    <th>DESCRIPTION</th>
                  </tr>
        <%   

                    while(rs.next())
                    {   
        %>
                  <tr>
                    <td><a href="details.jsp"><%out.print(rs.getString("name")); %></a> </td>
                    <td><%out.print(rs.getString("types")); %></td>
                    <td><%out.print(rs.getString("des")); %></td>
                  </tr>
                  <%
                    String name=rs.getString(2);
                    session.setAttribute("user",name);
                                }
                            %>
                </table>
            </div>
        <%
                    
                   
                    rs.close();
                    st.close();
                    con.close();
            }catch(Exception e){e.printStackTrace();}    

        %>
        </form>
    </div>
</html>
