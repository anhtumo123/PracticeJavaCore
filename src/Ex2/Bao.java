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
public class Bao extends TaiLieu{
    private String ngayPhatHanh; 

    public Bao(String maTaiLieu, String tenNhaSanXuat, int soLuongPhatHanh, String ngay) {
        super(maTaiLieu, tenNhaSanXuat, soLuongPhatHanh);
        this.ngayPhatHanh = ngay;
    }  

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
    }

    @Override
    public String toString() {
        return super.toString() + " Ngày phát hành: " + ngayPhatHanh;
    }
}
