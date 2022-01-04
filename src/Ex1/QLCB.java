/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author ATP
 */
public class QLCB {

    List<CanBo> listEmployee = new ArrayList<>();

    public <T> void addEmployee(T employee, List<T> list) {
        list.add(employee);
    }

    public void displayEmployee() {
        if (listEmployee.isEmpty()) return;
        listEmployee.forEach(e -> System.out.println(e.toString()));
    }

    public void searchEmployee() {
        if (listEmployee.isEmpty()) return;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên nhân viên bạn muốn tìm kiếm: ");
        String search = sc.nextLine();
        listEmployee.stream().filter(s -> s.getHoTen().equals(search)).forEach(s -> System.out.println(s.toString()));
    }

    public int checkInput(int type) {
        Scanner sc = new Scanner(System.in);
        int output = 0, c = 1;
        while (c == 1) {
            System.out.print("Nhập thông tin cán bộ: ");
            String input = sc.nextLine();
            try {
                output = Integer.parseInt(input);
                if (type == 1) {
                    if (output < 0) {
                        System.out.println("Tuổi phải là số dương");
                    } else {
                        c = 0;
                    }
                } else {
                    if (output < 1 || output > 10) {
                        System.out.println("Bậc từ 1 - 10");
                    } else {
                        c = 0;
                    }
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số");
            }
        }
        return output;
    }

    public void managerment() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===============");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiện thị thông tin về danh sách các cán bộ");
            System.out.println("4. Thoát khỏi chương trình");
            System.out.print("Vui lòng chọn chức năng: ");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.print("Nhập tên công nhân: ");
                    String name = sc.nextLine();
                    int age = checkInput(1);
                    System.out.print("Nhập giới tính công nhân: ");
                    String gender = sc.nextLine();
                    System.out.print("Nhập địa chỉ công nhân: ");
                    String address = sc.nextLine();
                    System.out.println("\nA. Công nhân");
                    System.out.println("B. Kỹ sư");
                    System.out.println("C. Nhân viên");
                    System.out.print("Chọn loại cán bộ muốn thêm: ");
                    String select = sc.nextLine().toUpperCase();
                    switch (select) {
                        case "A":
                            int degree = checkInput(2);
                            CanBo worker = new CongNhan(name, age, gender, address, degree);
                            addEmployee(worker, listEmployee);
                            break;
                        case "B":
                            System.out.print("Nhập ngành đào tạo của kỹ sư: ");
                            String major = sc.nextLine();
                            CanBo engineer = new KySu(name, age, gender, address, major);
                            addEmployee(engineer, listEmployee);
                            break;
                        case "C":
                            System.out.print("Nhập công việc của nhân việc: ");
                            String type = sc.nextLine();
                            CanBo staff = new NhanVien(name, age, gender, address, type);
                            addEmployee(staff, listEmployee);
                            break;
                        default:
                            System.out.println("Vui lòng chọn các loại cán bộ trên");
                    }
                    break;
                case "2":
                    searchEmployee();
                    break;
                case "3":
                    displayEmployee();
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
        QLCB qlcb = new QLCB();
        qlcb.managerment();
    }

}
