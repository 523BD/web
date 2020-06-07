package com.cute.dao;

import java.io.Serializable;

/**
 * @Description TODO
 * @ClassName Student
 * @Author: baobao
 * @Date: Created in 17:20 2020/4/11
 */
public class Student implements Serializable {
    private String studentId;
    private String name;
    private String password;
    private String gender;
    private String birthday;
    private String nativePlace;
    private String address;
    private String email;
    private Integer role;

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
