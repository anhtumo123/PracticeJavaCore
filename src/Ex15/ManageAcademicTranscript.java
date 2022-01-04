/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15;

import Ex15.Interface.IMangeStudentOfEachDepartment;
import Ex15.Interface.IManageDepartment;
import Ex15.Interface.IManageAcademicTranscript;
import Ex15.Entity.RegularStudent;
import Ex15.Entity.Student;
import Ex15.Entity.InServiceStudent;
import Ex15.Entity.Department;
import Ex15.Entity.AcademicTranscript;
import java.util.Date;

/**
 *
 * @author ATP
 */
public class ManageAcademicTranscript {
    public void managerment(){
        IMangeStudentOfEachDepartment manageStudent = new Department();
        IManageAcademicTranscript manageAcademic = new Student();
        IManageDepartment manageDepartment = new ManageDepartment();
        
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Spr2021", 9));
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Fall2021", 7));
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Sum2021", 8));
        manageStudent.addStudent(new InServiceStudent("HE001", "Anh Tu", new Date(1999, 11, 24), 2013, 7,
                manageAcademic.getListAcademicTranscript(), "Ha Noi"));
        manageAcademic = new Student();
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Spr2021", 7));
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Fall2021", 8));
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Sum2021", 6));
        manageStudent.addStudent(new RegularStudent("HE002", "Thu Thuy", new Date(2000, 1, 30), 2014, (float) 8.5,
                manageAcademic.getListAcademicTranscript()));
        manageAcademic = new Student();
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Spr2021", 6));
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Fall2021", 7));
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Sum2021", 8));
        manageStudent.addStudent(new RegularStudent("HE004", "Hai Long", new Date(1999, 1, 1), 2009, (float) 6.5,
                manageAcademic.getListAcademicTranscript()));
        manageAcademic = new Student();
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Spr2021", 8));
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Fall2021", 8));
        manageAcademic.addAcademicTranscript(new AcademicTranscript("Sum2021", 9));
        manageStudent.addStudent(new InServiceStudent("HE003", "Ha Trang", new Date(1999, 4, 16), 2011, (float) 9.0,
                manageAcademic.getListAcademicTranscript(), "Ha Noi"));       
        
        manageDepartment.adDepartment(new Department("SE", manageStudent.getListStudent()));
        
        System.out.println("Display all student: ");
        manageStudent.displayAllStudent();
        System.out.print("\nCount regular student: ");
        System.out.println(manageStudent.countRegularStudent(new RegularStudent()));
        System.out.println("\nDisplay in-service student trained in Ha Noi: ");
        manageStudent.searchInServiceStudentByTrainingPlace("Ha Noi");
        System.out.println("\nDisplay student has avg higher 8.0 in last semester: ");
        manageStudent.displayStudentHasAvgHigher8();
        System.out.println("\nDisplay student has highest avg: ");
        manageStudent.displayStudentHasHighestAvg();
        System.out.print("\nCount student get admission in 2010: ");
        System.out.println(manageStudent.countStudentEachYear(2010));
        System.out.println("\nSort student by admission year descending: ");
        manageStudent.sortStudent();
    }
    
    public static void main(String[] args) {
        ManageAcademicTranscript manageAcademicTranscript = new ManageAcademicTranscript();
        manageAcademicTranscript.managerment();
    }
}
