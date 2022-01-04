/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author ATP
 */
public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaSanXuat;
    private int soLuongPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String tenNhaSanXuat, int soLuongPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaSanXuat = tenNhaSanXuat;
        this.soLuongPhatHanh = soLuongPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public int getSoLuongPhatHanh() {
        return soLuongPhatHanh;
    }

    public void setSoLuongPhatHanh(int soLuongPhatHanh) {
        this.soLuongPhatHanh = soLuongPhatHanh;
    }

    @Override
    public String toString() {
        return "Mã tài liệu: " + maTaiLieu + " Tên NSX: " + tenNhaSanXuat + " SL phát hành: " + soLuongPhatHanh;
    }
    
    
}
