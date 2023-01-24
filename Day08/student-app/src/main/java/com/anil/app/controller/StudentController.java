package com.anil.app.controller;

import com.anil.app.Student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @GetMapping("/get/schools")
    public List<Student>getStudents(){
        List listStudents = new ArrayList();
        Student school1 = new Student("anil","school1","4th","team leader1");
        Student school2 = new Student("anu","school1","5th","team leader2");
        Student school3 = new Student("don","school1","6th","team leader3");
        Student school4 = new Student("ram","school1","7th","team leader3");

        List<Student> listSchools;
        listStudents.add(school1);
        listStudents.add(school2);
        listStudents.add(school3);
        listStudents.add(school4);
        return listStudents;
    }

    @PostMapping("/post/schools")
    public Map mapStudents(){
        Map studentsMap = new HashMap();
        Student school1 = new Student("anil","school1","4th","team leader1");
        Student school2 = new Student("anu","school1","5th","team leader2");
        Student school3 = new Student("don","school1","6th","team leader3");
        Student school4 = new Student("ram","school1","7th","team leader3");


        studentsMap.put(school1.getName(),school1);
        studentsMap.put(school2.getName(),school2);
        studentsMap.put(school3.getName(),school3);
        studentsMap.put(school4.getName(),school4);
        return studentsMap;
    }

}

