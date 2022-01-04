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
public class SoPhuc{
    private double phanThuc;
    private double phanAo;

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public SoPhuc() {
    }

    public int getPhanThuc() {
        return (int) phanThuc;
    }

    public void setPhanThuc(int phanThuc) {
        this.phanThuc = phanThuc;
    }

    public int getPhanAo() {
        return (int) phanAo;
    }

    public void setPhanAo(int phanAo) {
        this.phanAo = phanAo;
    }

    @Override
    public String toString() {
        return "Số phức: " + getPhanThuc() + " + " + getPhanAo() + "i";
    } 
}
