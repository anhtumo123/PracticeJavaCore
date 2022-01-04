/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ATP
 */
public class TuyenSinh {

    List<ThiSinh> listStudent = new ArrayList<>();

    public <T> void addStudent(T student, List<T> list) {
        list.add(student);
    }

    public void searchStudent() {
        Scanner sc = new Scanner(System.in);
        if (listStudent.isEmpty()) {
            return;
        }
        System.out.print("Nhập mã thí sinh cần tìm: ");
        String searchCode = sc.nextLine();
        listStudent.stream().filter(s -> s.getSBD().equals(searchCode)).forEach(s -> System.out.println(s.toString()));
    }

    public void displayStudent() {
        if (listStudent.isEmpty()) {
            return;
        }
        listStudent.forEach(e -> System.out.println(e.toString()));
    }

    public String checkStudentCode() {
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while (check == 1) {
            int temp = 0;
            System.out.print("Nhập mã thí sinh: ");
            String input = sc.nextLine();
            temp = (int) listStudent.stream().filter(d -> d.getSBD().equals(input)).count();
            if (temp == 0) {
                check = 0;
                return input;
            }
        }
        return null;
    }

    public void managerment() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===============");
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiện thị thông tin về thí sinh");
            System.out.println("3. Tìm kiếm thí sinh theo SBD");
            System.out.println("4. Thoát khỏi chương trình");
            System.out.print("Vui lòng chọn chức năng: ");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    String code = checkStudentCode();
                    System.out.print("Nhập tên thí sinh: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tên địa chỉ: ");
                    String address = sc.nextLine();
                    System.out.print("Nhập tên mức ưu tiên: ");
                    String priority = sc.nextLine();
                    System.out.println("\nA. Thí sinh khối A");
                    System.out.println("B. Thí sinh khối B");
                    System.out.println("C. Thí sinh khối C");
                    System.out.print("Chọn loại khối thí sinh thi: ");
                    String select = sc.nextLine().toUpperCase();
                    switch (select) {
                        case "A":
                            ThiSinh studentA = new ThiSinhKhoiA(code, name, address, priority);
                            addStudent(studentA, listStudent);
                            break;
                        case "B":
                            ThiSinh studentB = new ThiSinhKhoiB(code, name, address, priority);
                            addStudent(studentB, listStudent);
                            break;
                        case "C":
                            ThiSinh studentC = new ThiSinhKhoiC(code, name, address, priority);
                            addStudent(studentC, listStudent);
                            break;
                        default:
                            System.out.println("Vui lòng chọn các khối trên");
                    }
                    break;
                case "2":
                    displayStudent();
                    break;
                case "3":                  
                    searchStudent();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại chức năng từ 1 - 3");
            }
        }
    }

    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        tuyenSinh.managerment();
    }
}
