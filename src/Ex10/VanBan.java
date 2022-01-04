/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex10;

import java.util.stream.Stream;

/**
 *
 * @author ATP
 */
public class VanBan implements IXuLyVanBan {

    private String chuoiKiTu;

    public VanBan(String chuoiKiTu) {
        this.chuoiKiTu = chuoiKiTu;
    }

    public VanBan() {
    }

    public String getChuoiKiTu() {
        return chuoiKiTu;
    }

    public void setChuoiKiTu(String chuoiKiTu) {
        this.chuoiKiTu = chuoiKiTu;
    }

    @Override
    public int countStringLength(String str) {
        return str.length();
    }

    @Override
    public int countCharA(String str) {
        return (int) str.toLowerCase().chars().filter(s -> s == 'a').count();
    }

    @Override
    public String checkString(String str) {
        String regex = "^[^ ]([^ ]( ?))*[^ ]$";
        if (str.matches(regex)) {
            return str;
        }
        return "Bạn cần nhập theo đúng định dạng";
    }
}
