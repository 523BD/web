package com.cute.servlet;

import com.cute.utils.dbManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdatePasswordServlet", urlPatterns = "/updatePasswordServlet")
public class UpdatePasswordServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("studentId");
        String password = request.getParameter("password");
        dbManager db = new dbManager();
        db.updatePassword(studentId,password);
        response.sendRedirect(request.getContextPath()+"/allStudentInfoServlet");
    }
}
