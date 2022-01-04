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
public class XeTai extends Xe{
    private String trongTai;
    
    public XeTai(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauXe, String trongTai) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() + " Trọng tải: " + trongTai; //To change body of generated methods, choose Tools | Templates.
    }
    
}
