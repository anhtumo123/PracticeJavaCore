/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex9;

import java.util.Scanner;

/**
 *
 * @author ATP
 */
public class Main {
    public static void main(String[] args) {
        IQuanLyBienLai quanLyBienLai = new QuanLyBienLai();
        Scanner sc = new Scanner(System.in);
        quanLyBienLai.addNewFamily(new KhachHang("Anh Tu", "11 Thanh Nhan", "100"), 100, 50);
        quanLyBienLai.addNewFamily(new KhachHang("Le Tuyen", "103 Doi Can", "200"), 312, 150);
        quanLyBienLai.addNewFamily(new KhachHang("Thien Vu", "3 Quan Thanh", "150"), 245, 139);
        quanLyBienLai.addNewFamily(new KhachHang("Tran Thi Thu Ha ", "50 Tran Hung Dao", "90"), 98, 10);
        quanLyBienLai.addNewFamily(new KhachHang("Nguyen Duy Long", "208 Kim Nguu", "178"), 170, 100);
        System.out.println("Thông tin biên lai: ");
        quanLyBienLai.displayInfoBill();
        System.out.println("\nChỉnh sửa thông tin khách hàng có địa chỉ 208 Kim Nguu");
        quanLyBienLai.editInfoFamily(new KhachHang("Tran Van Kien", "208 Kim Nguu", "180"));
        System.out.println("Thông tin biên lai: ");
        quanLyBienLai.displayInfoBill();
        System.out.print("\nNhập địa chỉ của khách hàng muốn xóa: ");
        String address = sc.nextLine();
        quanLyBienLai.deleteFamily(address);
        System.out.println("Thông tin biên lai: ");
        quanLyBienLai.displayInfoBill();
    }
}
