<%-- 
    Document   : home
    Created on : Apr 8, 2013, 2:17:15 PM
    Author     : Michael
--%>

<%@page import="com.rpll.model.Lectures"%>
<%@page import="org.hibernate.Query"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.rpll.util.HibernateUtil"%>
<%@page import="com.rpll.model.University"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Lectures - Sistem Informasi Akademik</title>
        <link rel="stylesheet" type="text/css" href="../../resources/style/home.css"/>
        <link rel="stylesheet" type="text/css" href="../../resources/style/home2.css"/>
        <link rel="stylesheet" type="text/css" href="../../resources/style/style.css"/>
        <link rel="stylesheet" type="text/css" href="../../resources/style/mahasiswa.css"/>
        <link rel="stylesheet" type="text/css" href="../../resources/style/fixedMenu_style2.css"/>
        <link rel="stylesheet" type="text/css" href="../../resources/style/modern.css"/>

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
            <h2 style="text-align: center; margin-left: 20px;">List Dosen</h2>
            <jsp:include page="filter.jsp" />
            <jsp:include page="privilage.jsp" />
            <div class="metrouicss">
            <table class="hovered" style="margin-left: 50px; width: 900px; margin-top: 10px;">
                <thead style="background-color: black; color: white;border: 1px dotted black">
                <th>Lecture ID</th>
                <th>Nama</th>
                <th>Alamat</th>
                <th>Email</th>
                <th>Telp</th>
                <th>Opsi</th>
                </thead>
                <%
                    int noHlm;
                    List<Lectures> listLec;
                    Session sess2 = HibernateUtil.getSessionFactory().openSession();
                    if (request.getParameter("page") == null) {
                        Query q = sess2.createQuery("from Lectures");
                        q.setMaxResults(15);
                        listLec = q.list();
                        noHlm = 1;
                    } else {
                        int hlm = Integer.parseInt(request.getParameter("page"));
                        int startId = ((hlm - 1) * 15) + 10000;
                        noHlm = hlm;
                        Query q = sess2.createQuery("from Lectures where lectureId>" + startId);
                        q.setMaxResults(15);
                        listLec = q.list();
                    }


                    if (request.getParameter("filter") != null) {
                        int filterBy = Integer.parseInt(request.getParameter("filter"));
                        String keyword = request.getParameter("keyword");

                        if (filterBy == 1) {
                            Session sess = HibernateUtil.getSessionFactory().openSession();
                            listLec = sess.createQuery("from Lectures where lectureId=" + keyword).list();
                        } else {
                            if (filterBy == 2) {
                                   Session sess = HibernateUtil.getSessionFactory().openSession();
                                   listLec = sess.createQuery("from Lectures where lower(lectureName) like '%" + keyword + "%'").list();
                                  }
                        }
                    } else {
                        Session sess = HibernateUtil.getSessionFactory().openSession();
                        listLec = sess.createQuery("from Lectures").list();
                    }
                    for (Lectures o : listLec) {
                %>
                <tr>
                    <td><%= o.getLectureId()%></td>
                    <td><%= o.getLectureName()%></td>
                    <td><%= o.getLectureAddress()%></td>
                    <td><%= o.getLectureEmail()%></td>
                    <td><%= o.getLectureTelp()%></td>
                    <td><a href="update.jsp?lectureId=<%= o.getLectureId() %>">Update</a></td>
                </tr>
                <%
                    }
                %>
            </table>
            </div>
            <%
                if (request.getParameter("filterBy") == null) {
                    Session session3 = HibernateUtil.getSessionFactory().openSession();
                    List<Lectures> listData = session3.createQuery("from Lectures").list();
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
