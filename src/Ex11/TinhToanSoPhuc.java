/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex11;

/**
 *
 * @author ATP
 */
public class TinhToanSoPhuc {
    public static void main(String[] args) {
        ISoPhuc soPhuc = new QuanLySoPhuc();
        soPhuc.addComplexNumber(new SoPhuc(1, 2));
        soPhuc.addComplexNumber(new SoPhuc(4, 3));
        System.out.println("Hiển thị số phức:");
        soPhuc.displayComplexNumber();
        System.out.print("\nTổng 2 số phức: ");
        System.out.println(soPhuc.sumComplexNumber());
        System.out.print("\nTích 2 số phức: ");
        System.out.println(soPhuc.multipleComplexNumber());
    }
}
