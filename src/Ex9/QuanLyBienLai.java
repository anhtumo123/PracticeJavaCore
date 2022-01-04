/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author ATP
 */
public class QuanLyBienLai implements IQuanLyBienLai{
    private List<BienLai> listBill;

    public QuanLyBienLai() {
        listBill = new ArrayList<>();
    }

    public List<BienLai> getListBill() {
        return listBill;
    }

    public void setListBill(List<BienLai> listBill) {
        this.listBill = listBill;
    }

    @Override
    public void addNewFamily(KhachHang khachHang, int soMoi, int soCu) {
        BienLai bienLai = new BienLai(khachHang, soCu, soMoi);
        listBill.add(bienLai);
    }

    //Edit By address
    @Override
    public void editInfoFamily(KhachHang khachHang) {
        List<BienLai> list = listBill.stream().filter(b -> b.getKhachHang().getSoNha().equals(khachHang.getSoNha())).collect(Collectors.toList());
        if(!list.isEmpty()){
            list.get(0).setKhachHang(khachHang);
        }
    }

    //Delete By address
    @Override
    public void deleteFamily(String soNha) {
        List<BienLai> list = listBill.stream().filter(b -> b.getKhachHang().getSoNha().equals(soNha)).collect(Collectors.toList());
        if(!list.isEmpty()){
            listBill.remove(list.get(0));
        }
    }

    @Override
    public void displayInfoBill() {
        listBill.forEach(b -> System.out.println(b.toString()));
    }
    
}
