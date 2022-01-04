/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8;

import java.util.Scanner;

/**
 *
 * @author ATP
 */
public class QuanLyThuVien {
    public static void main(String[] args) {
        IQuanLyThuVien quanLyThuVien = new ThuVien();
        Scanner sc = new Scanner(System.in);
        quanLyThuVien.addRegisterToBorrowBook(new TheMuon("12345", 04032021, 05032021, "BK123", new SinhVien("Anh Tu", 19, "SE1306")));
        quanLyThuVien.addRegisterToBorrowBook(new TheMuon("43166", 11212021, 12312021, "MZ431", new SinhVien("Le Thong", 20, "MKT1420")));
        quanLyThuVien.addRegisterToBorrowBook(new TheMuon("76611", 02012021, 07042021, "NB911", new SinhVien("Anh Quan", 21, "IA1515")));
        quanLyThuVien.addRegisterToBorrowBook(new TheMuon("43414", 11142021, 12142021, "NB201", new SinhVien("Hai Tuyen", 22, "CN1610")));
        quanLyThuVien.addRegisterToBorrowBook(new TheMuon("89231", 01022021, 03012021, "BK901", new SinhVien("Binh Long", 20, "JP1402")));
        System.out.println("Thông tin mượn sách: ");
        quanLyThuVien.displayInfoOfCard();
        System.out.print("\nNhập mã phiếu mượn muốn xóa: ");
        String code = sc.nextLine();
        quanLyThuVien.deleteByCode(code);
        quanLyThuVien.displayInfoOfCard();
    }
}
