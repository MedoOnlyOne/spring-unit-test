package com.example;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // inject mockito to junit
public class StudentServiceTest {
    @Mock // create mock class
    private StudentRepository studentRepository;
    @InjectMocks // inject mock class to the service class
    private StudentService studentService;

    @Test
    public void getStudentById() {
        // define mock behaviour
        when(studentRepository.findStudentById(1)).thenReturn(new Student(1, "Mohamed"));
        when(studentRepository.findStudentById(2)).thenReturn(new Student(2, "Medo"));

        // create test
        assertEquals("Mohamed", studentService.findStudentById(1).getName(), "Student name is Mohamed");
        assertEquals("Medo", studentService.findStudentById(2).getName(), "Student name is Medo");

        // verify calls to mock class methods (Verification types: times, never, atLeast, atMost)
        // DEFAULT times(1)
        verify(studentRepository, times(2)).findStudentById(anyInt());
        verify(studentRepository, never()).saveStudent(any());
        verify(studentRepository, atLeast(1)).findStudentById(anyInt());
        verify(studentRepository, atMost(2)).findStudentById(anyInt());
    }
}
