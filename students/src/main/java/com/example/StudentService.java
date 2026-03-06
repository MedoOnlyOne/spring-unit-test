package com.example;

public class StudentService {
    public Student findStudentById(int id) {
        if(id == 1)
            return new Student(1, "Medo");
        return null;
    }
}
