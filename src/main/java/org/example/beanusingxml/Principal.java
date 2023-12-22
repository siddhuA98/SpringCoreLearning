package org.example.beanusingxml;

public class Principal {

    private String name;
    private int experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void principalDetails(){
        System.out.println("I am the principal of this school, My name is " + name + " and I have an experience of " + experience + " years" );
    }
}
