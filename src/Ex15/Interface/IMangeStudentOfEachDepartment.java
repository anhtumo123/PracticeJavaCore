/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15.Interface;

import Ex15.Entity.RegularStudent;
import Ex15.Entity.Student;
import java.util.List;

/**
 *
 * @author ATP
 */
public interface IMangeStudentOfEachDepartment {
    List<Student> getListStudent();
    void addStudent(Student student);
    int countRegularStudent(RegularStudent student);
    void displayStudentHasHighestMark();
    void searchInServiceStudentByTrainingPlace(String trainingPlace);
    void displayStudentHasAvgHigher8();
    void displayStudentHasHighestAvg();
    int countStudentEachYear(int year);
    void sortStudent();
    void displayAllStudent();
}
