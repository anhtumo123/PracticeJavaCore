/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex7;

import java.util.Scanner;

/**
 *
 * @author ATP
 */
public class QuanLyCBNV {
    public static void main(String[] args) {
        IQuanLyCBNV quanLyCBNV = new CBNV();
        quanLyCBNV.addEmployee(new Nguoi("HE123", "Anh Tu", 20, "Ha Noi", 2000, 500, 0));
        quanLyCBNV.addEmployee(new Nguoi("HE564", "Hai Chau", 18, "Hai Phong", 1500, 300, 50));
        quanLyCBNV.addEmployee(new Nguoi("HE563", "Le Tu", 25, "Yen Bai", 3000, 1000, 200));
        quanLyCBNV.addEmployee(new Nguoi("HE678", "Thai Binh", 20, "Ninh Binh", 2500, 200, 600));
        quanLyCBNV.addEmployee(new Nguoi("HE111", "Hoang Anh", 19, "Ha Noi", 1000, 0, 0));
        quanLyCBNV.displayEmployee();
        System.out.print("\nLương của nhân viên: ");
        quanLyCBNV.calculateSalary();
        System.out.print("\nNhập mã nhân viên muốn xóa: ");
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        quanLyCBNV.deleteEmployeeByCode(code);
        quanLyCBNV.displayEmployee();
    }
}
