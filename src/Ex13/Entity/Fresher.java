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
public class Fresher extends Employee{
    private Date graduationDate;
    private String graduationRank;
    private String education;
    
    public Fresher(int ID, String fullName, Date birthDay, String phone, String email, 
            int employeeType, List<Certificate> listCertificate, Date graduationDate, String graduationRank, String education) {
        super(ID, fullName, birthDay, phone, email, employeeType, listCertificate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education =  education;
    }

    public Fresher() {
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() + ", Graduation Date: " + graduationDate + ", Graduation rank: " + graduationRank 
                + ", Education: " + education; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
     
}
