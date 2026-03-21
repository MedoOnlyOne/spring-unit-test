package com.example.service;

import com.example.model.Student;
import com.example.repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student student) {
        studentRepository.saveStudent(student);
    }

    public Student findStudentById(int id) {
        return studentRepository.findStudentById(id);
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteStudentById(id);
    }
}
