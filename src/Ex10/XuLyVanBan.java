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
public class XuLyVanBan {
    public static void main(String[] args) {
        String str = "Video provides a powerful way to help you prove your point. Amazing!!";
        IXuLyVanBan xuLyVanBan = new VanBan();
        System.out.print("Kiểm tra định dạng của chuỗi: ");
        System.out.println(xuLyVanBan.checkString(str));
        System.out.print("Đếm số kí tự A trong chuỗi: ");
        System.out.println(xuLyVanBan.countCharA(str));
        System.out.print("Đếm độ dài chuỗi: ");
        System.out.println(xuLyVanBan.countStringLength(str));
    }
}
