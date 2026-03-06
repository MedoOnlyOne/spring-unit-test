package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StudentServiceTest {
    @Test
    public void testFindStudent() {
        StudentService studentService = new StudentService();

        assertNull(studentService.findStudentById(10), "The student should be null");
        assertNotNull(studentService.findStudentById(1), "The student should not be null");
    }
}
