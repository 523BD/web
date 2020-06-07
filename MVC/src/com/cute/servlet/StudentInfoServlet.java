package com.cute.servlet;

import com.cute.dao.Student;
import com.cute.utils.dbManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentInfoServlet" ,urlPatterns = "/studentInfoServlet")
public class StudentInfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String studentId = (String) request.getSession().getAttribute("studentId");
        dbManager db = new dbManager();
        Student student = db.findByStudentId(studentId);
        request.setAttribute("student",student);
        request.getRequestDispatcher("/studentInfo.jsp").forward(request,response);
    }
}
