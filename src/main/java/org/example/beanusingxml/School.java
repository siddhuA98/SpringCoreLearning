package org.example.beanusingxml;

public class School {

    private String schoolName;
    private int schoolId;

    private Principal principal;

    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

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
        principal.principalDetails();
        teacher.Teach();
    }
}
