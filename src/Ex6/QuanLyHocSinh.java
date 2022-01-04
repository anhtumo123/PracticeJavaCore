/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ATP
 */
public class QuanLyHocSinh {
    
    public static void main(String[] args) {
        List<HocSinh> listStudent = new ArrayList<>();
        IQuanLyHocSinh student = new NhaTruong(listStudent);
        student.addStudent(new HocSinh("Anh Tu", 22, "HN", "2B"));
        student.addStudent(new HocSinh("Minh Thang", 18, "DN", "3G"));
        student.addStudent(new HocSinh("Thuc Anh", 20, "TB", "2B"));
        student.addStudent(new HocSinh("Ha Trang", 23, "DN", "5C"));
        student.addStudent(new HocSinh("Hai Long", 19, "DN", "5C"));
        System.out.println("Hiển thị học sinh dưới 20 tuổi: ");
        student.displayStudentUnder20();
        System.out.print("\nHiển thị số lượng học sinh 23 tuổi và quê ở Đà Nẵng: ");
        System.out.println(student.countStudent());
    }
}
