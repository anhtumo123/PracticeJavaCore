/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex14.Entity;

import java.util.Date;

/**
 *
 * @author ATP
 */
public class GoodStudent extends Student{
    private float gpa;
    private String bestRewardName;
    
    public GoodStudent(String fullName, Date doB, String sex, String phoneNumber, 
            String universityName, String gradeLevel, float gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }
    
    public GoodStudent() {
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public String toString() {
        return super.toString() + ", GPA: " + gpa + ", RewardName: " + bestRewardName; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMyInfo() {
        this.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
