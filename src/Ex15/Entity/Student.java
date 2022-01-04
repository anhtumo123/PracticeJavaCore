/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15.Entity;

import Ex15.Entity.AcademicTranscript;
import Ex15.Interface.IManageAcademicTranscript;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ATP
 */
public class Student implements IManageAcademicTranscript{
    private String studentCode;
    private String name;
    private Date dob;
    private int admissionYear;
    private float mark;
    private List<AcademicTranscript> listAcademicTranscript;

    public Student() {
        listAcademicTranscript = new ArrayList<>();
    }

    public Student(String studentCode, String name, Date dob, int admissionYear, float mark, List<AcademicTranscript> listAcademicTranscript) {
        this.studentCode = studentCode;
        this.name = name;
        this.dob = dob;
        this.admissionYear = admissionYear;
        this.mark = mark;
        this.listAcademicTranscript = listAcademicTranscript;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public List<AcademicTranscript> getListAcademicTranscript() {
        return listAcademicTranscript;
    }

    public void setListAcademicTranscript(List<AcademicTranscript> listAcademicTranscript) {
        this.listAcademicTranscript = listAcademicTranscript;
    }

    @Override
    public String toString() {
        return "StudentCode: " + studentCode + ", name: " + name + ", dob: " + dob + ", admissionYear: " + admissionYear +
                ", mark: " + mark + ", AcademicTranscript:" + listAcademicTranscript;
    }

    @Override
    public void addAcademicTranscript(AcademicTranscript academicTranscript) {
        listAcademicTranscript.add(academicTranscript);
    }
    
}
