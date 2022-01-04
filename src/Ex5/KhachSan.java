/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ATP
 */
public class KhachSan implements IQuanLyKhachSan{
    private List<Nguoi> listNguoi;

    public List<Nguoi> getListNguoi() {
        return listNguoi;
    }

    public void setListNguoi(List<Nguoi> listNguoi) {
        this.listNguoi = listNguoi;
    }
    
    public KhachSan() {
        listNguoi = new ArrayList<>();
    }
    
    @Override
    public void addNewCustomer(Nguoi nguoi) {
        listNguoi.add(nguoi);
    }

    @Override
    public void deleteCustomerByIdentityNumber(String identityNumber) {
        for(Nguoi n : listNguoi){
            if(n.getSoCMT().equals(identityNumber)){
                listNguoi.remove(n);
                break;
            }
        }    
        //listNguoi.forEach(c -> listNguoi.remove(c.getSoCMT().equals(identityNumber)));
    }

    @Override
    public void calculateRoomRent() {
        listNguoi.forEach(c -> System.out.println(c.getHoTen() +": " + c.getSoNgayThue()*Integer.parseInt(c.getLoaiPhongThue().getGiaPhong())));
    }

    @Override
    public void displayCustomers() {
        listNguoi.forEach(c -> System.out.println(c.toString()));
    }
}
