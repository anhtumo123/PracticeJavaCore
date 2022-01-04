/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13.Entity;

import Ex13.Entity.Employee;
import Ex13.Entity.Certificate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ATP
 */
public class Intern extends Employee{
    private String major;
    private int semester;
    private String universityName;
    
    public Intern(int ID, String fullName, Date birthDay, String phone, String email, int employeeType, 
            List<Certificate> listCertificate, String major, int semester, String universityName) {
        super(ID, fullName, birthDay, phone, email, employeeType, listCertificate);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern() {
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", Semester: " + semester + ", UniversityName: " + universityName;
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
