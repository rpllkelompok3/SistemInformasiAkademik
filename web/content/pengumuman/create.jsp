<%-- 
    Document   : home
    Created on : Apr 8, 2013, 2:17:15 PM
    Author     : Michael
--%>

<%@page import="java.util.List"%>
<%@page import="com.rpll.model.Department"%>
<%@page import="com.rpll.util.HibernateUtil"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pengumuman - Sistem Informasi Akademik</title>
        <link rel="stylesheet" type="text/css" href="../../resources/style/home.css"/>
        <link rel="stylesheet" type="text/css" href="../../resources/style/home2.css"/>
        <link rel="stylesheet" type="text/css" href="../../resources/style/fixedMenu_style2.css"/>

        <script src="../../resources/js/jquery-1.7.2.min.js"></script>
        <script src="../../resources/js/jquery.fixedMenu.js"></script>
        <script>
            $('document').ready(function() {
                $('.menu').fixedMenu();
            });
        </script>
    </head>

    <body>
        <jsp:include page="../header.jsp"/>
        
        <div id="content">
            <jsp:include page="../sidemenu.jsp"/>
            <jsp:include page="privilage.jsp"/>
            <h2 style="text-align: center; margin-left: 20px; padding-top: 10px;">Input Pengumuman</h2>
            <form name='f' action="../../Pengumuman?mode=1" method='POST'>
                <div id="content-left" style="margin-left: 300px; width: 400px;">
                    <fieldset>
                        <table>
                            <tr>
                                <td> <label for="username">Date Post : </label></td>
                                <td><input type="text" name="datePost" style="height: 20px; width: 200px"></td>
                            </tr>
                            <tr>
                                <td> <label for="username">Content : </label></td>
                                <td><textarea name="content" style="height: 150px; width: 200px"> </textarea></td>
                            </tr>
                            <tr>
                                <td> <label for="username">Department : </label></td>
                                <td><select name="department" style="height: 20px; width: 200px">
                                        <option value="0">--Pilih Dept--</option>
                                        <%
                                            Session sess = HibernateUtil.getSessionFactory().openSession();
                                            List<Department> listDept = sess.createQuery("From Department").list();
                                            for(Department o : listDept) {
                                            %>
                                            <option value="<%= o.getDepartmentId() %>"><%= o.getDepartmentName() %></option>
                                            <%
                                            }
                                                %>
                                    </select></td>
                            </tr>
                            
                            <tr>
                                <td></td>
                                <td><input type="submit" value="Simpan" style="height: 30px; width: 200px;"/></td>
                            </tr>
                            
                        <br/>
                        </table>
                    </fieldset>
                </div>
            </form>
        </div>

    </div>
</div>

<jsp:include page="../footer.jsp"/>

</body>
</html>
