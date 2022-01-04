/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ATP
 */
public class QuanLySach {

    List<TaiLieu> listDoc = new ArrayList<>();;
    List<Integer> a = new ArrayList<>();

    public <T> void addDocument(T document, List<T> list) {
        list.add(document);
    }

    public void displayDocument() {
        if (listDoc.isEmpty()) return;
        listDoc.forEach(e -> System.out.println(e.toString()));
    }

    public void deleteDocument() {
        if (listDoc.isEmpty()) return;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã tài liệu muốn xóa: ");
        String code = sc.nextLine();
        //listDoc.forEach(d -> listDoc.remove(d.getMaTaiLieu().equals(code)));
        for(TaiLieu t : listDoc){
            if(t.getMaTaiLieu().equals(code)){
                listDoc.remove(t);
                break;
            }
        }
        //listDoc = listDoc.stream().filter(d -> !d.getMaTaiLieu().equals(code)).collect(Collectors.toList());
    }

    public <T> void searchDocument(T type) {
        if (listDoc.isEmpty()) return;        
        listDoc.stream().filter(s -> s.getClass().equals(type.getClass())).forEach(s -> System.out.println(s.toString()));
    }

    public int checkInput(int type) {
        Scanner sc = new Scanner(System.in);
        int output = 0, check = 1;
        while (check == 1) {
            System.out.print("Nhập thông tin tài liệu: ");
            String input = sc.nextLine();
            try {
                output = Integer.parseInt(input);
                if (type == 1) {
                    if (output < 0) {
                        System.out.println("Thông tin là số dương");
                    } else {
                        check = 0;
                    }
                } else {
                    if (output < 1 || output > 10) {
                        System.out.println("Bậc từ 1 - 10");
                    } else {
                        check = 0;
                    }
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số");
            }
        }
        return output;
    }

    public String checkDocCode() {
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while (check == 1) {
            int temp = 0;
            System.out.print("Nhập mã tài liệu: ");
            String input = sc.nextLine();
            temp = (int) listDoc.stream().filter(d -> d.getMaTaiLieu().equals(input)).count();
            if(temp == 0){
                check = 0;
                return input;
            }
        }
        return null;
    }

    public void managerment() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===============");
            System.out.println("1. Thêm mới tài liêu");
            System.out.println("2. Xoá tài liệu theo mã");
            System.out.println("3. Hiện thị thông tin về tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát khỏi chương trình");
            System.out.print("Vui lòng chọn chức năng: ");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    String code = checkDocCode();
                    System.out.print("Nhập tên NSX: ");
                    String name = sc.nextLine();
                    int amount = checkInput(1);
                    System.out.println("\nA. Sách");
                    System.out.println("B. Tạp chí");
                    System.out.println("C. Báo");
                    System.out.print("Chọn loại cán bộ muốn thêm: ");
                    String select = sc.nextLine().toUpperCase();
                    switch (select) {
                        case "A":
                            System.out.print("Nhập tên tác giả: ");
                            String author = sc.nextLine();
                            int numberOfPage = checkInput(1);
                            TaiLieu book = new Sach(code, name, amount, author, numberOfPage);
                            addDocument(book, listDoc);
                            break;
                        case "B":
                            System.out.print("Nhập số phát hành: ");
                            String releaseNumber = sc.nextLine();
                            System.out.print("Nhập tháng phát hành: ");
                            String releaseMonth = sc.nextLine();
                            TaiLieu megazine = new TapChi(code, name, amount, releaseNumber, releaseMonth);
                            addDocument(megazine, listDoc);
                            break;
                        case "C":
                            System.out.print("Nhập ngày phát hành: ");
                            String releaseDate = sc.nextLine();
                            TaiLieu news = new Bao(code, name, amount, releaseDate);
                            addDocument(news, listDoc);
                            break;
                        default:
                            System.out.println("Vui lòng chọn các loại tài liệu trên");
                    }
                    break;
                case "2":
                    deleteDocument();
                    break;
                case "3":
                    displayDocument();
                    break;
                case "4":
                    System.out.println("\nA. Sách");
                    System.out.println("B. Tạp chí");
                    System.out.println("C. Báo");
                    System.out.print("Chọn loại tài liệu muốn tìm kiếm: ");
                    String choose = sc.nextLine().toUpperCase();
                    switch (choose) {
                        case "A":
                            searchDocument(new Sach());
                            break;
                        case "B":
                            searchDocument(new TapChi());
                            break;
                        case "C":
                            searchDocument(new Bao());
                            break;
                        default:
                            System.out.println("Vui lòng chọn các loại cán bộ trên");
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
        QuanLySach quanLySach = new QuanLySach();
        quanLySach.managerment();
    }
}
