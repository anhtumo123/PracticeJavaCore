/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ATP
 */
public class ThuVien implements IQuanLyThuVien{
    private List<TheMuon> listTheMuons;

    public ThuVien() {
        listTheMuons = new ArrayList<>();
    }

    public List<TheMuon> getListTheMuons() {
        return listTheMuons;
    }

    public void setListTheMuons(List<TheMuon> listTheMuons) {
        this.listTheMuons = listTheMuons;
    }

    @Override
    public void addRegisterToBorrowBook(TheMuon theMuon) {
        listTheMuons.add(theMuon);
    }

    @Override
    public void deleteByCode(String code) {
        for(TheMuon t : listTheMuons){
            if(t.getMaPhieuMuon().equals(code)){
                listTheMuons.remove(t);
                break;
            }
        }
    }

    @Override
    public void displayInfoOfCard() {
        listTheMuons.forEach(b -> System.out.println(b.toString()));
    }
    
}
