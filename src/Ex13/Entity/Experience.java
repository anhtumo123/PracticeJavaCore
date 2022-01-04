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
public class Experience extends Employee{
    private int expInYear;
    private String proSkill;
    
    public Experience(int ID, String fullName, Date birthDay, String phone, String email, int employeeType,
            List<Certificate> listCertificate, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, employeeType, listCertificate);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience() {
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + ", Experience in year: " + expInYear + ", Pro skill: " + proSkill; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
    
}
