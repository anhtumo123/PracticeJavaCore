/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15.Entity;

import Ex15.Entity.Student;
import Ex15.Entity.AcademicTranscript;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ATP
 */
public class RegularStudent extends Student{
      
    public RegularStudent(String studentCode, String name, Date dob, int admissionYear, float mark, 
            List<AcademicTranscript> listAcademicTranscript) {
        super(studentCode, name, dob, admissionYear, mark, listAcademicTranscript);
    }   

    public RegularStudent() {
        
    }
    
}
