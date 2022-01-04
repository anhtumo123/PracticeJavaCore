/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex14.Entity;

import Ex14.Entity.Student;
import java.util.Date;

/**
 *
 * @author ATP
 */
public class NormalStudent extends Student{
    
    private int englishScore;
    private int entryTestScore;
    
    public NormalStudent(String fullName, Date doB, String sex, String phoneNumber, String universityName,
            String gradeLevel, int englishScore, int entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public NormalStudent() {
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(int entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public String toString() {
        return super.toString() + ", EnglishScore: " + englishScore + ", EntryTest: " + entryTestScore; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMyInfo() {
        this.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
