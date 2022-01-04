/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex14;

import Ex14.Comparator.SortStudentByEntryTestScore;
import Ex14.Comparator.SortStudentByGPA;
import Ex14.Comparator.SortStudentByName;
import Ex14.Comparator.SortStudentByNameReverse;
import Ex14.Comparator.SortStudentByPhoneNumber;
import Ex14.Comparator.SortStudentByTOEICScore;
import Ex14.Entity.GoodStudent;
import Ex14.Entity.NormalStudent;
import Ex14.Entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ATP
 */
public class ManageEnrollmentStudent implements IMangeEnrollmentStudent{
    private List<Student> listStudent;

    public ManageEnrollmentStudent() {
        listStudent = new ArrayList<>();
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public void displayStudent() {
        listStudent.stream().sorted(new SortStudentByNameReverse().thenComparing(new SortStudentByPhoneNumber())).
                forEach(s -> System.out.println(s.toString()));
    }

    @Override
    public void addStudent(Student student) {
        listStudent.add(student);
    }

    @Override
    public void selectCandidate(int numberOfRecruitment) {
        if(listStudent.stream().filter(s -> s instanceof GoodStudent).count() > numberOfRecruitment){
            listStudent.stream().filter(s -> s instanceof GoodStudent)
                    .sorted(new SortStudentByGPA().thenComparing(new SortStudentByName()))
                    .limit(numberOfRecruitment).forEach(s -> System.out.println(s.toString()));
        }else if(listStudent.stream().filter(s -> s instanceof GoodStudent).count() == numberOfRecruitment){
            listStudent.stream().filter(s -> s instanceof GoodStudent).forEach(s -> System.out.println(s.toString()));
        }else{
            List<Student> list = new ArrayList<>();
            list = listStudent.stream().filter(s -> s instanceof GoodStudent).collect(Collectors.toList());
            listStudent = listStudent.stream().filter(s -> s instanceof NormalStudent)
                    .sorted(new SortStudentByEntryTestScore().thenComparing(new SortStudentByTOEICScore())
                    .thenComparing(new SortStudentByName())).limit(numberOfRecruitment - list.size()).collect(Collectors.toList());
            list.addAll(listStudent);
            list.forEach(s -> System.out.println(s.toString()));
        }
    }
    
}
