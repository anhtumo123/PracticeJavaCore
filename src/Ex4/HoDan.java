/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ATP
 */
public class HoDan {
    private List<Nguoi> listPerson;
    private String soNha;

    public HoDan(List<Nguoi> listPerson, String soNha) {
        this.listPerson = listPerson;
        this.soNha = soNha;
    }

    public List<Nguoi> getListPerson() {
        return listPerson;
    }

    public void setListPerson(List<Nguoi> listPerson) {
        this.listPerson = listPerson;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "Số thành viên= " + listPerson.size() + " Số nhà= " + soNha;
    }
    
}
