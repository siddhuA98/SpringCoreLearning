package org.example.beanusingxmlannotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathLecturer implements Lecturer{
    @Override
    public void teach() {
        System.out.println("I teach Math");
    }
}
