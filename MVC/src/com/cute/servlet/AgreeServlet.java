package com.cute.servlet;

import com.cute.utils.dbManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description TODO
 * @ClassName ${NAME}
 * @Author: baobao
 * @Date: Created in 0:03 2020/4/27
 */
@WebServlet(name = "AgreeServlet",urlPatterns = "/agreeServlet")
public class AgreeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("studentId");
        dbManager db = new dbManager();
        db.agree(studentId);
        response.sendRedirect(request.getContextPath()+"/allStudentInfoServlet");
    }
}
