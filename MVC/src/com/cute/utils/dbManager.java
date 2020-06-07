package com.cute.utils;


import com.cute.dao.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class dbManager {
    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String uri= "jdbc:mysql://39.105.71.94:3306/ClassMgr?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT&allowPublicKeyRetrieval=true";
            String user="root";
            String passWord="123456";
            connection= DriverManager.getConnection(uri,user,passWord);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public int add(Student student){
        int row = 0;
        Connection connection = getConnection();

        String sqlStr = "INSERT INTO StuInfo VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);
            preparedStatement.setString(1,student.getStudentId());
            preparedStatement.setString(2,student.getName());
            preparedStatement.setString(3,student.getPassword());
            preparedStatement.setString(4,student.getGender());
            preparedStatement.setString(5,student.getBirthday());
            preparedStatement.setString(6,student.getNativePlace());
            preparedStatement.setString(7,student.getAddress());
            preparedStatement.setString(8,student.getEmail());
            preparedStatement.setInt(9, -1);
            row = preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }

    public int update(Student student){
        int row  = 0;
        Connection connection = getConnection();
        String sqlStr = "UPDATE StuInfo SET password= ? , gender=? , birthday=?, nativePlace=?, address=?, email=?  WHERE studentId=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);
            preparedStatement.setString(1,student.getPassword());
            preparedStatement.setString(2,student.getGender());
            preparedStatement.setString(3,student.getBirthday());
            preparedStatement.setString(4,student.getNativePlace());
            preparedStatement.setString(5,student.getAddress());
            preparedStatement.setString(6,student.getEmail());
            preparedStatement.setString(7,student.getStudentId());
            row = preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return row;
    }

    public Student findByStudentId(String studentId){
        Connection connection = getConnection();
        Student student = new Student();
        String sqlStr = "SELECT * FROM StuInfo WHERE StudentId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);
            preparedStatement.setString(1,studentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                student.setStudentId(resultSet.getString("studentId"));
                student.setName(resultSet.getString("name"));
                student.setPassword(resultSet.getString("password"));
                student.setGender(resultSet.getString("gender"));
                student.setBirthday(resultSet.getString("birthday"));
                student.setNativePlace(resultSet.getString("nativePlace"));
                student.setAddress(resultSet.getString("address"));
                student.setEmail(resultSet.getString("email"));
                student.setRole(resultSet.getInt("role"));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
    public List<Student> findAll(){
        Connection connection = getConnection();
        List<Student> students = new ArrayList<>();
        String sqlStr = "SELECT * FROM StuInfo";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlStr);
            while(resultSet.next()){
                Student student = new Student();
                student.setStudentId(resultSet.getString("studentId"));
                student.setName(resultSet.getString("name"));
                student.setPassword(resultSet.getString("password"));
                student.setGender(resultSet.getString("gender"));
                student.setBirthday(resultSet.getString("birthday"));
                student.setNativePlace(resultSet.getString("nativePlace"));
                student.setAddress(resultSet.getString("address"));
                student.setEmail(resultSet.getString("email"));
                student.setRole(resultSet.getInt("role"));
                students.add(student);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    public int updatePassword(String studentId ,String password){
        int row  = 0;
        Connection connection = getConnection();
        String sqlStr = "UPDATE StuInfo SET password= ? WHERE studentId=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);
            preparedStatement.setString(1,password);
            preparedStatement.setString(2,studentId);
            row = preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return row;
    }
    public int agree(String studentId){
        int row  = 0;
        Connection connection = getConnection();
        String sqlStr = "UPDATE StuInfo SET role= 0 WHERE studentId=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);
            preparedStatement.setString(1,studentId);
            row = preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }
}
