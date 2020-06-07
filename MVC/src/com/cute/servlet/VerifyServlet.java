package com.cute.servlet;

import com.cute.dao.Student;
import com.cute.utils.dbManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "VerifyServlet",urlPatterns = "/verifyServlet")
public class VerifyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String studentId = request.getParameter("studentId");
        String password = request.getParameter("password");
        dbManager db = new dbManager();
        Student student = db.findByStudentId(studentId);
        if(student == null){
            request.setAttribute("error","此用户不存在！");
            request.getRequestDispatcher("/error.jsp").forward(request,response);
        }else if(!password.equals(student.getPassword())){
            request.setAttribute("error","密码或者学号输入错误！");
            request.getRequestDispatcher("/error.jsp").forward(request,response);
        }else if(student.getRole() == -1){
            request.setAttribute("error","账号尚未审核！");
            request.getRequestDispatcher("/error.jsp").forward(request,response);
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("studentId",studentId);
            session.setAttribute("role",student.getRole());
            response.sendRedirect("menu.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
