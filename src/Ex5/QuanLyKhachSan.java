/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;

import java.util.Scanner;

/**
 *
 * @author ATP
 */
public class QuanLyKhachSan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLyKhachSan quanLyKhachSan = new KhachSan();
        quanLyKhachSan.addNewCustomer(new Nguoi("Anh Tu", 20, "123123", 20, new PhongA()));
        quanLyKhachSan.addNewCustomer(new Nguoi("Le Thuy", 22, "32144", 17, new PhongA()));
        quanLyKhachSan.addNewCustomer(new Nguoi("Hong Phong", 40, "5654", 12, new PhongB()));
        quanLyKhachSan.addNewCustomer(new Nguoi("Hong Hanh", 30, "100", 5, new PhongC()));
        quanLyKhachSan.addNewCustomer(new Nguoi("Duy Anh", 29, "99", 10, new PhongB()));
        quanLyKhachSan.displayCustomers();
        System.out.print("\nNhập số CMT của khách hàng muốn xóa: ");
        String identityNumber = sc.nextLine();
        quanLyKhachSan.deleteCustomerByIdentityNumber(identityNumber);
        quanLyKhachSan.displayCustomers();
        System.out.println("\nTiền phòng của các khách hàng");
        quanLyKhachSan.calculateRoomRent();
    }
}
