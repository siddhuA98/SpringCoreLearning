package org.example.beanusingxmlannotations;

import org.springframework.stereotype.Component;

@Component
public class ScienceLecturer implements Lecturer{
    @Override
    public void teach() {
        System.out.println("I teach Science");
    }
}
