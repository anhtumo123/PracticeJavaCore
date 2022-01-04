/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15.Entity;

import Ex15.Comparator.CompareAvg;
import Ex15.Comparator.CompareStudentByAdmissionYear;
import Ex15.Comparator.CompareStudentByAvg;
import Ex15.Comparator.CompareStudentByType;
import Ex15.Interface.IMangeStudentOfEachDepartment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ATP
 */
public class Department implements IMangeStudentOfEachDepartment {

    private String name;
    private List<Student> listStudent;

    public Department() {
        listStudent = new ArrayList<>();
    }

    public Department(String name, List<Student> listStudent) {
        this.name = name;
        this.listStudent = listStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public String toString() {
        return "Department name: " + name + ", listStudent: " + listStudent;
    }

    @Override
    public int countRegularStudent(RegularStudent student) {
        return (int) listStudent.stream().filter(s -> s.getClass().equals(student.getClass())).count();
    }

    @Override
    public void displayStudentHasHighestMark() {
        double highestMark = listStudent.stream().mapToDouble(s -> s.getMark()).max().getAsDouble();
        listStudent.stream().filter(s -> s.getMark() == highestMark).forEach(s -> System.out.println(s.toString()));
    }

    @Override
    public void searchInServiceStudentByTrainingPlace(String trainingPlace) {
        listStudent.stream().filter(s -> {
            if (s instanceof InServiceStudent) {
                return ((InServiceStudent) s).getTrainingPlace().equals(trainingPlace);
            }
            return false;
        }).forEach(s -> System.out.println(s.toString()));
    }

    @Override
    public void displayStudentHasAvgHigher8() {
        for (Student student : listStudent) {
            if(student.getListAcademicTranscript().get(student.getListAcademicTranscript().size() - 1).getAvgGrade() > 8.0){
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void displayStudentHasHighestAvg() {
        //listStudent.stream().sorted(new CompareStudentByAvg()).limit(1).forEach(s -> System.out.println(s.toString()));
        
        List<Student> list = listStudent.stream().sorted(new CompareStudentByAvg()).limit(1).collect(Collectors.toList());
        int maxAvg = list.get(0).getListAcademicTranscript().stream().max(new CompareAvg()).get().getAvgGrade();
        listStudent.stream().filter((Student stu) -> {
            return stu.getListAcademicTranscript().stream().max(new CompareAvg()).get().getAvgGrade() == maxAvg;
        }).forEach(s -> System.out.println(s.toString()));
    }

    @Override
    public int countStudentEachYear(int year) {
        return (int) listStudent.stream().filter(s -> s.getAdmissionYear() == year).count();
    }

    @Override
    public void addStudent(Student student) {
        listStudent.add(student);
    }

    @Override
    public void sortStudent() {
        listStudent.stream().sorted(new CompareStudentByType().thenComparing(new CompareStudentByAdmissionYear())).forEach(s -> System.out.println(s.toString()));
    }

    @Override
    public void displayAllStudent() {
        listStudent.forEach(s -> System.out.println(s.toString()));
    }
}
