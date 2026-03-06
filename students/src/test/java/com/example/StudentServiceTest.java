package com.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {
    @Test
    public void testFindStudent() {
        StudentService studentService = new StudentService();

        assertAll("Test Find Students By IDs",
                ()-> assertEquals("Mohamed", studentService.findStudentById(1).getName()),
                ()-> assertEquals("Ahmed", studentService.findStudentById(2).getName()),
                ()-> assertEquals("Medo", studentService.findStudentById(3).getName())
                );

        assertNull(studentService.findStudentById(10), "The student should be null");
        assertNotNull(studentService.findStudentById(1), "The student should not be null");

    }

    @Test
    public void testTimeOut() {
        StudentService studentService = new StudentService();

        assertTimeout(Duration.ofMillis(500), () -> studentService.findStudentByIdDelay(), "Run Time should be in 500 ms range");
    }
}
