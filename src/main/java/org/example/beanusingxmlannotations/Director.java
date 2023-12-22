package org.example.beanusingxmlannotations;

import org.springframework.stereotype.Component;

@Component
public class Director {

    public void directorDetails(){
        System.out.println("I am the director of this School");
    }

}
