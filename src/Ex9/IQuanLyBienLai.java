/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex9;

/**
 *
 * @author ATP
 */
public interface IQuanLyBienLai {
    void addNewFamily(KhachHang khachHang, int soDienMoi, int soDienCu);
    void editInfoFamily(KhachHang khachHang);
    void deleteFamily(String soNha);
    void displayInfoBill();
}
