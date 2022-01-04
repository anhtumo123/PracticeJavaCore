/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ATP
 */
public class CBNV implements IQuanLyCBNV{
    private List<Nguoi> listNguoi;

    public CBNV() {
        listNguoi = new ArrayList<>();
    }

    public List<Nguoi> getListNguoi() {
        return listNguoi;
    }

    public void setListNguoi(List<Nguoi> listNguoi) {
        this.listNguoi = listNguoi;
    }

    @Override
    public void addEmployee(Nguoi nguoi) {
        listNguoi.add(nguoi);
    }

    @Override
    public void deleteEmployeeByCode(String code) {
        for(Nguoi n : listNguoi){
            if(n.getMaSo().equals(code)){
                listNguoi.remove(n);
                break;
            }
        }   
    }

    @Override
    public void calculateSalary() {
        listNguoi.forEach(e -> System.out.println(e.getHoTen() + ": " + (e.getLuongCung() + e.getLuongThuong() - e.getTienPhat())));
    }

    @Override
    public void displayEmployee() {
        listNguoi.forEach(c -> System.out.println(c.toString()));
    }
    
}
