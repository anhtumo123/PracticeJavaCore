/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex12;

/**
 *
 * @author ATP
 */
public class Oto extends Xe{
    
    private int soChoNgoi;
    private String kieuDongCo;
    
    public Oto(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public String toString() {
        return super.toString() + " Số chỗ ngồi: " + soChoNgoi + " Kiểu động cơ: " + kieuDongCo; //To change body of generated methods, choose Tools | Templates.
    }
    
}
