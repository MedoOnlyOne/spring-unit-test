package com.example;

import java.time.Duration;

public class StudentService {
    public Student findStudentById(int id) {
        if(id == 1)
            return new Student(1, "Mohamed");
        else if(id == 2)
            return new Student(1, "Ahmed");
        else if(id == 3)
            return new Student(1, "Medo");
        return null;
    }
    public Student findStudentByIdDelay() throws InterruptedException {
        Thread.sleep(Duration.ofMillis(300));
        return new Student(1, "Mohamed");
    }
}
