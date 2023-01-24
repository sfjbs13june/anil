package com.anil.app.Student;

public class Student {
    String name;

    String std;

    String schoolName;

    String role;

    public Student(String name, String std, String schoolName, String role) {
        this.name = name;
        this.std = std;
        this.schoolName = schoolName;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
