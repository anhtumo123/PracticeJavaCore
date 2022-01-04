/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15.Entity;

/**
 *
 * @author ATP
 */
public class AcademicTranscript {
    private String nameSemester;
    private int avgGrade;

    public AcademicTranscript(String nameSemester, int avgGrade) {
        this.nameSemester = nameSemester;
        this.avgGrade = avgGrade;
    }

    public String getNameSemester() {
        return nameSemester;
    }

    public void setNameSemester(String nameSemester) {
        this.nameSemester = nameSemester;
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "NameSemester: " + nameSemester + ", avgGrade: " + avgGrade;
    }
    
}
