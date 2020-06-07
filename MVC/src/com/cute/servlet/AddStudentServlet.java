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

@WebServlet(name = "AddStudentServlet" ,urlPatterns = "/addStudentServlet")
//@WebServlet("/addStudentServlet") 这句就直接配置了访问路径，就是省略了urlPatterns = "/addStudentServlet"
public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dbManager db = new dbManager();
        request.setCharacterEncoding("UTF-8");
        try {
            Student student = BeanUtil.fillBean(request, Student.class);
            db.add(student);
            request.setAttribute("success","注册成功！等待管理员审核！");
            request.getRequestDispatcher("/success.jsp").forward(request,response);
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
