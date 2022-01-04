/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;

/**
 *
 * @author ATP
 */
public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String soCMT;
    private int soNgayThue;
    private Phong loaiPhongThue;

    public Nguoi(String hoTen, int tuoi, String soCMT, int soNgayThue, Phong loaiPhongThue) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soCMT = soCMT;
        this.soNgayThue = soNgayThue;
        this.loaiPhongThue = loaiPhongThue;
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

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public Phong getLoaiPhongThue() {
        return loaiPhongThue;
    }

    public void setLoaiPhongThue(Phong loaiPhongThue) {
        this.loaiPhongThue = loaiPhongThue;
    }

    @Override
    public String toString() {
        return "Họ tên= " + hoTen + " Tuổi= " + tuoi + " Số CMT= " + soCMT + " Số ngày thuê= " + soNgayThue 
                + " Loại phòng thuê= " + loaiPhongThue.getLoaiPhong();
    }
    
}
