/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15.Comparator;

import Ex15.Entity.AcademicTranscript;
import java.util.Comparator;

/**
 *
 * @author ATP
 */
public class CompareAvg implements Comparator<AcademicTranscript>{

    @Override
    public int compare(AcademicTranscript o1, AcademicTranscript o2) {
        return o1.getAvgGrade() - o2.getAvgGrade();
    }
    
}
