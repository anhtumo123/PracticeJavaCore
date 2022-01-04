/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex14;

import Ex14.Entity.Student;

/**
 *
 * @author ATP
 */
public interface IMangeEnrollmentStudent {
    void addStudent(Student student);
    void displayStudent();
    void selectCandidate(int numberOfRecruitment);
}
