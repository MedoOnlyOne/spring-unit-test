package com.example;

import com.example.service.StaticStudentService;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class StaticStudentServiceTest {
    @Test
    public void testFindStudent() {
        StaticStudentService staticStudentService = new StaticStudentService();

        assertAll("Test Find Students By IDs",
                ()-> assertEquals("Mohamed", staticStudentService.findStudentById(1).getName()),
                ()-> assertEquals("Ahmed", staticStudentService.findStudentById(2).getName()),
                ()-> assertEquals("Medo", staticStudentService.findStudentById(3).getName())
                );

        assertNull(staticStudentService.findStudentById(10), "The student should be null");
        assertNotNull(staticStudentService.findStudentById(1), "The student should not be null");

    }

    @Test
    public void testTimeOut() {
        StaticStudentService staticStudentService = new StaticStudentService();

        assertTimeout(Duration.ofMillis(500), () -> staticStudentService.findStudentByIdDelay(), "Run Time should be in 500 ms range");
    }
}
