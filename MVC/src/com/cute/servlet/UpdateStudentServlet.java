package com.cute.servlet;

import com.cute.dao.Student;
import com.cute.utils.BeanUtil;
import com.cute.utils.dbManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateStudentServlet" ,urlPatterns = "/updateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        dbManager db = new dbManager();
        try {
            Student student = BeanUtil.fillBean(request,Student.class);
            db.update(student);
            response.sendRedirect(request.getContextPath()+"/studentInfoServlet");
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
