/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ATP
 */
public class HocSinh{
    private String hoTen;
    private int age;
    private String queQuan;
    private String lop;

    public HocSinh(String hoTen, int age, String queQuan, String lop) {
        this.hoTen = hoTen;
        this.age = age;
        this.queQuan = queQuan;
        this.lop = lop;
    }

    public HocSinh() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Họ tên= " + hoTen + " Tuổi= " + age + " Quê quán= " + queQuan + " Lớp= " + lop;
    }
    
}
