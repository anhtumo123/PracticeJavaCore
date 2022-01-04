/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

/**
 *
 * @author ATP
 */
public class ThiSinhKhoiC extends ThiSinh{
    private final String monVan = "Văn";
    private final String monSu = "Sử";
    private final String monDia = "Địa";
    
    public ThiSinhKhoiC(String SBD, String hoTen, String diaChi, String mucUuTien) {
        super(SBD, hoTen, diaChi, mucUuTien);
    }

    public String getMonVan() {
        return monVan;
    }

    public String getMonSu() {
        return monSu;
    }

    public String getMonDia() {
        return monDia;
    }

    @Override
    public String toString() {
        return super.toString() + " Môn thi: " + monVan + ", " + monSu + ", " + monDia;
    }
    
    
}
