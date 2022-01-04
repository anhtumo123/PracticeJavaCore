/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15.Entity;

import Ex15.Entity.AcademicTranscript;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ATP
 */
public class InServiceStudent extends Student{
    private String trainingPlace;

    public InServiceStudent(String studentCode, String name, Date dob, int admissionYear, float mark, 
            List<AcademicTranscript> listAcademicTranscript, String trainingPlace) {
        super(studentCode, name, dob, admissionYear, mark, listAcademicTranscript);
        this.trainingPlace = trainingPlace;
    }

    public InServiceStudent() {
    }
    
    public String getTrainingPlace() {
        return trainingPlace;
    }

    public void setTrainingPlace(String trainingPlace) {
        this.trainingPlace = trainingPlace;
    }

    @Override
    public String toString() {
        return super.toString() + ", TrainingPlace: " + trainingPlace; //To change body of generated methods, choose Tools | Templates.
    }
}
