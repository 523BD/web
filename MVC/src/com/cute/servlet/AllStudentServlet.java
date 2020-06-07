package com.cute.servlet;

import com.cute.dao.Student;
import com.cute.utils.dbManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AllStudentServlet", urlPatterns = "/allStudentServlet")
public class AllStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        dbManager db = new dbManager();
        List<Student> students = db.findAll();
        request.setAttribute("students", students);
        request.getRequestDispatcher("/allStudent.jsp").forward(request, response);
    }
}
