/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ATP
 */
public class QuanLyPTGT {

    List<Xe> listXe = new ArrayList<>();

    public int checkID() {
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while (check == 1) {
            try {
                int temp = 0;
                System.out.print("Nhập ID của xe: ");
                int input = Integer.parseInt(sc.nextLine());
                temp = (int) listXe.stream().filter(v -> v.getId() == input).count();
                if (temp == 0) {
                    if (input > 0) {
                        check = 0;
                        return input;
                    }
                }
            } catch (Exception e) {
                System.out.println("ID phải là số");
            }
        }
        return 0;
    }

    public int checkInput() {
        Scanner sc = new Scanner(System.in);
        int output = 0, check = 1;
        while (check == 1) {
            System.out.print("Nhập thông tin xe (năm sx, giá bán, số chỗ ngồi, ID để xóa): ");
            String input = sc.nextLine();
            try {
                output = Integer.parseInt(input);
                if (output < 0) {
                    System.out.println("Thông tin là số dương");
                } else {
                    check = 0;
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số");
            }
        }
        return output;
    }

    void managerment() {
        IQuanLyPTGT quanLyPTGT = new Xe();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===============");
            System.out.println("1. Thêm mới xe");
            System.out.println("2. Xoá xe theo mã");
            System.out.println("3. Hiện thị thông tin về xe");
            System.out.println("4. Tìm kiếm xe theo hãng sản xuất và màu");
            System.out.println("5. Thoát khỏi chương trình");
            System.out.print("Vui lòng chọn chức năng: ");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    int ID = checkID();
                    System.out.print("Nhập hãng sản xuất: ");
                    String manufacture = sc.nextLine();
                    int yearOfManufacture = checkInput();
                    int cost = checkInput();
                    System.out.print("Nhập màu xe: ");
                    String color = sc.nextLine();
                    System.out.println("\nA. Ô tô");
                    System.out.println("B. Xe máy");
                    System.out.println("C. Xe tải");
                    System.out.print("Chọn loại xe muốn thêm: ");
                    String select = sc.nextLine().toUpperCase();
                    switch (select) {
                        case "A":
                            int numberOfSeats = checkInput();
                            System.out.print("Nhập kiểu động cơ: ");
                            String engineType = sc.nextLine();
                            quanLyPTGT.addVehicle(listXe, new Oto(ID, manufacture, yearOfManufacture, cost, color, numberOfSeats, engineType));
                            break;
                        case "B":
                            System.out.print("Nhập công suất xe: ");
                            String wattage = sc.nextLine();
                            quanLyPTGT.addVehicle(listXe, new XeMay(ID, manufacture, yearOfManufacture, cost, color, wattage));
                            break;
                        case "C":
                            System.out.print("Nhập trọng tải của xe: ");
                            String tonnage = sc.nextLine();
                            quanLyPTGT.addVehicle(listXe, new XeTai(ID, manufacture, yearOfManufacture, cost, color, tonnage));
                            break;
                        default:
                            System.out.println("Vui lòng chọn các loại xe trên");
                    }
                    break;
                case "2":
                    if (!listXe.isEmpty()) {
                        int idToDelete = checkInput();
                        quanLyPTGT.deleteByID(listXe, idToDelete);
                    }
                    break;
                case "3":
                    quanLyPTGT.displayVehicle(listXe);
                    break;
                case "4":
                    if (!listXe.isEmpty()) {
                        System.out.print("Nhập hãng sản xuất để tìm kiếm: ");
                        String manufactureToSearch = sc.nextLine();
                        System.out.print("Nhập màu xe để tìm kiếm: ");
                        String colorToSearch = sc.nextLine();
                        quanLyPTGT.searchByManufactureAndColor(listXe, manufactureToSearch, colorToSearch);
                    }
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại chức năng từ 1 - 4");
            }
        }
    }

    public static void main(String[] args) {
        QuanLyPTGT quanLyPTGT = new QuanLyPTGT();
        quanLyPTGT.managerment();
    }
}
