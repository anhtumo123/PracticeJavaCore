/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6;

import java.util.List;

/**
 *
 * @author ATP
 */
public class NhaTruong implements IQuanLyHocSinh{
    private List<HocSinh> listStudent;

    public List<HocSinh> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<HocSinh> listStudent) {
        this.listStudent = listStudent;
    }

    public NhaTruong(List<HocSinh> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public void addStudent(HocSinh student) {
        listStudent.add(student);
    }

    @Override
    public void displayStudentUnder20() {
        listStudent.stream().filter(s -> s.getAge() < 20).forEach(s -> System.out.println(s));
    }

    @Override
    public int countStudent() {
        return (int) listStudent.stream().filter(s -> s.getAge() == 23 && s.getQueQuan().toUpperCase().equals("DN")).count();
    }
    
}
