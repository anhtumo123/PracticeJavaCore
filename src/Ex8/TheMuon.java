/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8;

/**
 *
 * @author ATP
 */
public class TheMuon {
    private String maPhieuMuon;
    private int ngayMuon;
    private int ngayTra;
    private String soHieuSach;
    private SinhVien sinhVien;

    public TheMuon(String maPhieuMuon, int ngayMuon, int ngayTra, String soHieuSach, SinhVien sinhVien) {
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
    }

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(int ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    @Override
    public String toString() {
        return "Mã phiếu= " + maPhieuMuon + " Ngày mượn= " + ngayMuon + " Ngày trả= " + ngayTra +
                " Số hiệu= " + soHieuSach + " Thông tin sinh viên: " + sinhVien.toString();
    }
    
}
