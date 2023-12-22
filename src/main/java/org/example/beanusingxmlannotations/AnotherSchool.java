package org.example.beanusingxmlannotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class AnotherSchool {

    private String schoolName;
    private int schoolId;

    @Autowired
    private Director director;

    @Autowired
    //@Qualifier("scienceLecturer")
    private Lecturer lecturer;


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public void print(){
        System.out.println("Name of the school is " + schoolName + " and school id is " + schoolId);
        director.directorDetails();
        lecturer.teach();
    }
}