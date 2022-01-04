/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15.Interface;

import Ex15.Entity.AcademicTranscript;
import java.util.List;

/**
 *
 * @author ATP
 */
public interface IManageAcademicTranscript {
    void addAcademicTranscript(AcademicTranscript academicTranscript);
    List<AcademicTranscript> getListAcademicTranscript();
}
