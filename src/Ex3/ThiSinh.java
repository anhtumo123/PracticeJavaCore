/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

/**
 *
 * @author ATP
 */
public class ThiSinh {
    private String SBD;
    private String hoTen;
    private String diaChi;
    private String mucUuTien;

    public ThiSinh(String SBD, String hoTen, String diaChi, String mucUuTien) {
        this.SBD = SBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(String mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    @Override
    public String toString() {
        return "SBD= " + SBD + " Họ Tên=" + hoTen + " Địa chỉ= " + diaChi + " Mức ưu tiên=" + mucUuTien;
    }
    
    
}
