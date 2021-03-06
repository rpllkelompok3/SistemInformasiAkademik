/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpll.controller;

import com.rpll.model.Matkul;
import com.rpll.model.Department;
import com.rpll.model.MatkulType;
import com.rpll.model.University;
import com.rpll.util.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;

/**
 *
 * @author Beatrix
 */
@WebServlet(name = "Matkul", urlPatterns = {"/Matkul"})
public class MatkulServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int mode = Integer.parseInt(request.getParameter("mode"));
            
            if(mode==1 || mode==2){
                int matkulID = Integer.parseInt(request.getParameter("matkulID"));
                String matkulName = request.getParameter("matkulName");
                int matkulType = Integer.parseInt(request.getParameter("matkulType"));
                
                Session sess = HibernateUtil.getSessionFactory().openSession();
                List<MatkulType> listMatkul = sess.createQuery("from MatkulType where matkulType="+matkulType).list();
                MatkulType matkulTipe = listMatkul.get(0);
                
                Matkul matkul = new Matkul();
                matkul.setMatkulId(matkulID);
                matkul.setMatkulType(matkulTipe);
                matkul.setMatkulName(matkulName);
                
                
                Session sess2 = HibernateUtil.getSessionFactory().openSession();
                if(mode==1){ //buat yg create
                    sess2.beginTransaction();
                    sess2.save(matkul);
                    sess2.getTransaction().commit();
                    sess2.close();
                }
                else { //buat yg update
                    sess2.beginTransaction();
                    sess2.update(matkul);
                    sess2.getTransaction().commit();
                    sess2.close();
                }
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PengumumanServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
