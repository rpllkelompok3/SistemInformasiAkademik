<%-- 
    Document   : home
    Created on : Apr 8, 2013, 2:17:15 PM
    Author     : Michael
--%>

<%@page import="org.hibernate.Query"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.rpll.util.HibernateUtil"%>
<%@page import="com.rpll.model.University"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Badan Hukum - Sistem Informasi Akademik</title>
        <link rel="stylesheet" type="text/css" href="../../resources/style/home.css"/>
        <link rel="stylesheet" type="text/css" href="../../resources/style/home2.css"/>
        <link rel="stylesheet" type="text/css" href="../../resources/style/style.css"/>
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
            <jsp:include page="../sidemenu.jsp" />
            <h2 style="text-align: center; margin-left: 20px;">List Badan Hukum</h2>
            <jsp:include page="filter.jsp" />
            <jsp:include page="privilage.jsp" />

            <table style="margin-left: 50px; width: 900px; margin-top: 10px;" border="1">
                <thead style="background-color: black; color: white;border: 1px dotted black">
                <th>Univ ID</th>
                <th>Nama</th>
                <th>Alamat</th>
                <th>Telp</th>
                <th>Email</th>
                <th>Homepage</th>
                <th>Found Date</th>
                <th>No Akreditasi</th>
                <th>Terakreditasi</th>
                <th>Rektor</th>
                <th>Opsi</th>
                </thead>
                <%
                    int noHlm;
                    List<University> listUniv;
                    Session sess2 = HibernateUtil.getSessionFactory().openSession();
                    if (request.getParameter("page") == null) {
                        Query q = sess2.createQuery("from University");
                        q.setMaxResults(15);
                        listUniv = q.list();
                        noHlm = 1;
                    } else {
                        int hlm = Integer.parseInt(request.getParameter("page"));
                        int startId = ((hlm - 1) * 15) + 10000;
                        noHlm = hlm;
                        Query q = sess2.createQuery("from University where univId>" + startId);
                        q.setMaxResults(15);
                        listUniv = q.list();
                    }


                    if (request.getParameter("filter") != null) {
                        int filterBy = Integer.parseInt(request.getParameter("filter"));
                        String keyword = request.getParameter("keyword");

                        if (filterBy == 1) {
                            Session sess = HibernateUtil.getSessionFactory().openSession();
                            listUniv = sess.createQuery("from University where univId=" + keyword).list();
                        } else {
                            if (filterBy == 2) {
                                Session sess = HibernateUtil.getSessionFactory().openSession();
                                listUniv = sess.createQuery("from University where univName='" + keyword + "'").list();
                            } else {
                                if (filterBy == 3) {
                                    Session sess = HibernateUtil.getSessionFactory().openSession();
                                    listUniv = sess.createQuery("from University where noAkreditasi=" + keyword).list();
                                } else {
                                    Session sess = HibernateUtil.getSessionFactory().openSession();
                                    listUniv = sess.createQuery("from University").list();
                                }
                            }
                        }
                    } else {
                        Session sess = HibernateUtil.getSessionFactory().openSession();
                        listUniv = sess.createQuery("from University").list();
                    }
                    for (University o : listUniv) {
                %>
                <tr>
                    <td><%= o.getUnivId()%></td>
                    <td><%= o.getUnivName()%></td>
                    <td><%= o.getUnivAddress()%></td>
                    <td><%= o.getUnivTelp()%></td>
                    <td><%= o.getUnivEmail()%></td>
                    <td><%= o.getUnivHomepage()%></td>
                    <td><%= o.getFoundDate()%></td>
                    <td><%= o.getNoAkreditasi()%></td>
                    <td><%= o.getAkreditasi()%></td>
                    <td><%= o.getRector()%></td>
                    <td><a href="update.jsp?univId=<%= o.getUnivId()%>">Update</a></td>
                </tr>
                <%
                    }
                %>
            </table>
            <%
                if (request.getParameter("filterBy") == null) {
                    Session session3 = HibernateUtil.getSessionFactory().openSession();
                    List<University> listData = session3.createQuery("from University").list();
                    int totalData = listData.size();
                    String total = "Jumlah Data Sebanyak " + totalData;
            %>
            <p style="text-align: left; margin-left: 50px;"><b><%= total %></b></p>
            <% %>
            <p style="text-align: left; margin-left: 50px;">Page : </p>
            <%
                    int jmlHlm = totalData / 15;
                    for (int i = 1; i <= (jmlHlm + 1); i++) {
                        if (i == noHlm) {
                            out.println("<p style='text-align:left;margin-left: 50px;'><b>" + i + "| </b></p>");
                        } else {
                            out.println("<b><a href='list.jsp?page=" + i + "'>" + i + "| </a></b>");
                        }
                    }
                }

            %>
        </div>

        <div id="footer" style="background-color: black; height: 70px; width: 1000px; margin: auto; text-align: center;">
            <p style=" color: white; padding-top: 20px;">Copyright 2013 RPLL Kelompok 3</p>
        </div>

    </body>
</html>
