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
public class KhachHang {
    private String hoTen;
    private String soNha;
    private String maCongTo;

    public KhachHang(String hoTen, String soNha, String maCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(String maCongTo) {
        this.maCongTo = maCongTo;
    }

    @Override
    public String toString() {
        return "Họ tên KH: " + hoTen + " Số nhà: " + soNha + " Mã công tơ: " + maCongTo;
    }
    
}
