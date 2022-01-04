/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ATP
 */
public class QuanLyKhuPho {
    
    public int checkInput() {
        Scanner sc = new Scanner(System.in);
        int output = 0, check = 1;
        while (check == 1) {
            System.out.print("Nhập SL hộ dân hoặc thành viên trong gia đình: ");
            String input = sc.nextLine();
            try {
                output = Integer.parseInt(input);
                if (output <= 0) {
                    System.out.println("Số lượng nhập là số dương");
                } else {
                    check = 0;
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số");
            }
        }
        return output;
    }

    public KhuPho addInfoAboutTown() {       
        Scanner sc = new Scanner(System.in);
        int numberOfFamily = checkInput();
        List<HoDan> listHoDan = new ArrayList<>();        
        for (int i = 0; i < numberOfFamily; i++) {
            List<Nguoi> listNguoi = new ArrayList<>();
            System.out.print("Nhập số nhà: ");
            String apartmentNumber = sc.nextLine();
            int numberOfPerson = checkInput();
            for(int j = 0; j < numberOfPerson; j++){
                System.out.print("Nhập họ tên: ");
                String name = sc.nextLine();
                System.out.print("Nhập tuổi: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Nhập nghề nghiệp: ");
                String career = sc.nextLine();
                System.out.print("Nhập số CMT: ");
                String identityNumber = sc.nextLine();
                Nguoi person = new Nguoi(name, age, career, identityNumber);
                listNguoi.add(person);               
            }
            HoDan family = new HoDan(listNguoi, apartmentNumber);
            listHoDan.add(family);
        }       
        KhuPho town = new KhuPho(listHoDan);
        displayInfo(town);
        return town;
    }
    
    public void displayInfo(KhuPho town){
        for(HoDan hoDan : town.getListHoDan()){
            System.out.println(hoDan.getSoNha());
            for(Nguoi nguoi : hoDan.getListPerson()){
                System.out.println(nguoi.toString());
            }           
        }
    }

    public static void main(String[] args) {
        QuanLyKhuPho quanLyKhuPho = new QuanLyKhuPho();
        quanLyKhuPho.addInfoAboutTown();
    }
}
