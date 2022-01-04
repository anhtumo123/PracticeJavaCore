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
public class BienLai {
    private KhachHang khachHang;
    private int soDienCu;
    private int soDienMoi;
    private int soTienTra;

    public BienLai(KhachHang khachHang, int soDienCu, int soDienMoi) {
        this.khachHang = khachHang;
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getSoDienCu() {
        return soDienCu;
    }

    public void setSoDienCu(int soDienCu) {
        this.soDienCu = soDienCu;
    }

    public int getSoDienMoi() {
        return soDienMoi;
    }

    public void setSoDienMoi(int soDienMoi) {
        this.soDienMoi = soDienMoi;
    }

    public int getSoTienTra() {
        return (soDienMoi - soDienCu)*5;
    }

    public void setSoTienTra(int soTienTra) {
        this.soTienTra = soTienTra;
    }

    @Override
    public String toString() {
        return "Thông tin KH: " + khachHang + " Số điện cũ: " + soDienCu + " Số điện mới: " + soDienMoi
                + " Số tiền phải trả: " + getSoTienTra();
    }
    
}
