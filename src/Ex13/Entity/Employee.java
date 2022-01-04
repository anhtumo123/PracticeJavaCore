/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13.Entity;

import Ex13.Entity.Certificate;
import Ex13.Interface.IManageCertificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ATP
 */
public class Employee implements IManageCertificate{
    private int ID;
    private String fullName;
    private Date birthDay;
    private String phone;
    private String email;
    private int employeeType;
    private int employeeCount;
    private List<Certificate> listCertificate;

    public Employee() {
        listCertificate = new ArrayList<>();
    }

    public Employee(int ID, String fullName, Date birthDay, String phone, String email, int employeeType, List<Certificate> listCertificate) {
        this.ID = ID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        this.listCertificate = listCertificate;
        employeeCount++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void setListCertificate(List<Certificate> listCertificate) {
        this.listCertificate = listCertificate;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", fullName: " + fullName + ", birthDay: " + birthDay + ", phone: " + phone +
                ", email: " + email + ", employeeType: " + employeeType + ", listCertificate: " + listCertificate;
    }
    
    public void showInfo(){
        System.out.println(this.toString());
    }

    @Override
    public void addCertificate(Certificate certificate) {
        listCertificate.add(certificate);
    }
    
    @Override
    public List<Certificate> getListCertificate() {
        return listCertificate;
    }

    @Override
    public void displayCertificate() {
        listCertificate.forEach(c -> System.out.println(c.toString()));
    }

    @Override
    public void removeAllListCertificate() {
        listCertificate = new ArrayList<>();
    }
}
