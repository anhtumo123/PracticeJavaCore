/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex12;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ATP
 */
public class Xe implements IQuanLyPTGT{
    private int id;
    private String hangSanXuat;
    private int namSanXuat;
    private int giaBan;
    private String mauXe;

    public Xe(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauXe) {
        this.id = id;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public Xe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Hãng SX: " + hangSanXuat + " Năm SX: " + namSanXuat + " Giá bán: " + giaBan + " Màu: " + mauXe;
    }
    
    @Override
    public void addVehicle(List<Xe> listXe, Xe xe) {
        listXe.add(xe);
    }

    @Override
    public void displayVehicle(List<Xe> listXe) {
        listXe.forEach(v -> System.out.println(v.toString()));
    }

    @Override
    public void searchByManufactureAndColor(List<Xe> listXe, String manufacture, String color) {
        listXe.stream().filter(v -> v.getHangSanXuat().equals(manufacture) && v.getMauXe().equals(color)).forEach(v -> System.out.println(v.toString()));
    }

    @Override
    public void deleteByID(List<Xe> listXe, int ID) {
        List<Xe> list = listXe.stream().filter(v -> v.getId()==ID).collect(Collectors.toList());
        if(list.size() != 0){
            listXe.remove(list.get(0));
        }
    }
}
