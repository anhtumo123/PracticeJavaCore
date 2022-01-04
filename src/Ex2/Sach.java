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
public class Sach extends TaiLieu{
    private String tenTaiLieu;
    private int soTrang;

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public Sach() {
    }
  
    public Sach(String maTaiLieu, String tenNhaSanXuat, int soLuongPhatHanh, String ten, int trang) {
        super(maTaiLieu, tenNhaSanXuat, soLuongPhatHanh);
        this.tenTaiLieu = ten;
        this.soTrang = trang;
    }

    @Override
    public String toString() {
        return super.toString() + " Tên tài liệu: " + tenTaiLieu + " Số trang: " + soTrang;
    }
    
}
