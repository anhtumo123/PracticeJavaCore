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
public class TapChi extends TaiLieu{
    private String soPhatHanh;
    private String thangPhatHanh;
    
    public TapChi(String maTaiLieu, String tenNhaSanXuat, int soLuongPhatHanh, String so, String thang) {
        super(maTaiLieu, tenNhaSanXuat, soLuongPhatHanh);
        this.soPhatHanh = so;
        this.thangPhatHanh = thang;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi() {
    }

    @Override
    public String toString() {
        return super.toString() + " Số phát hàng: " + soPhatHanh + " Tháng phát hành: " + thangPhatHanh;
    }
    
}
