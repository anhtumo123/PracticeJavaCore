/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

/**
 *
 * @author ATP
 */
public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private String soCMT;

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String soCMT) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCMT = soCMT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    @Override
    public String toString() {
        return "Họ tên= " + hoTen + " Tuổi= " + tuoi + " Nghề nghiệp= " + ngheNghiep + "  Số CMT= " + soCMT + "\n";
    }
    
    
}
