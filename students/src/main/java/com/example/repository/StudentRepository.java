package com.example.repository;

import com.example.model.Student;

import java.util.List;

public class StudentRepository {
    private List<Student> students;

    public void saveStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudentById(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}
