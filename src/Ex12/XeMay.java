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
public class XeMay extends Xe{
    private String congSuat;
    
    public XeMay(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauXe, String congSuat) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congSuat = congSuat;
    }
    
    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() + " Công suất: " + congSuat;
    }
    
}
