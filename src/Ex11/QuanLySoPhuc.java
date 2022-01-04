/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ATP
 */
public class QuanLySoPhuc implements ISoPhuc{
    private List<SoPhuc> listSoPhucs;

    public QuanLySoPhuc() {
        listSoPhucs = new ArrayList<>();
    }

    public List<SoPhuc> getListSoPhucs() {
        return listSoPhucs;
    }

    public void setListSoPhucs(List<SoPhuc> listSoPhucs) {
        this.listSoPhucs = listSoPhucs;
    }
    @Override
    public void displayComplexNumber() {
        listSoPhucs.forEach(s -> System.out.println(s.toString()));
    }

    @Override
    public SoPhuc sumComplexNumber() {
        SoPhuc soPhuc = new SoPhuc();
        soPhuc.setPhanThuc(listSoPhucs.get(0).getPhanThuc() + listSoPhucs.get(1).getPhanThuc());
        soPhuc.setPhanAo(listSoPhucs.get(0).getPhanAo() + listSoPhucs.get(1).getPhanAo());
        return soPhuc;
    }

    @Override
    public SoPhuc multipleComplexNumber() {
        SoPhuc soPhuc = new SoPhuc();
        soPhuc.setPhanThuc(listSoPhucs.get(0).getPhanThuc()*listSoPhucs.get(1).getPhanThuc() - listSoPhucs.get(0).getPhanAo()*listSoPhucs.get(1).getPhanAo());
        soPhuc.setPhanAo(listSoPhucs.get(0).getPhanThuc()*listSoPhucs.get(1).getPhanAo() + listSoPhucs.get(0).getPhanAo()*listSoPhucs.get(1).getPhanThuc());
        return soPhuc;
    }

    @Override
    public void addComplexNumber(SoPhuc soPhuc) {
        listSoPhucs.add(soPhuc);
    }
}
