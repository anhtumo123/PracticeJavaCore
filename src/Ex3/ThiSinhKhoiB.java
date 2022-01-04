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
public class ThiSinhKhoiB extends ThiSinh{
    private final String monToan = "Toán";
    private final String monSinh = "Sinh";
    private final String monHoa = "Hóa";

    public ThiSinhKhoiB(String SBD, String hoTen, String diaChi, String mucUuTien) {
        super(SBD, hoTen, diaChi, mucUuTien);
    }

    public String getMonToan() {
        return monToan;
    }

    public String getMonSinh() {
        return monSinh;
    }

    public String getMonHoa() {
        return monHoa;
    }

    @Override
    public String toString() {
        return super.toString()+ " Môn thi: " + monToan + ", " + monHoa + ", " + monSinh;
    }

}
