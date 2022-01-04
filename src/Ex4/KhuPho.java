/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

import java.util.List;

/**
 *
 * @author ATP
 */
public class KhuPho {
    private List<HoDan> listHoDan;

    public KhuPho(List<HoDan> listHoDan) {
        this.listHoDan = listHoDan;
    }

    public List<HoDan> getListHoDan() {
        return listHoDan;
    }

    public void setListHoDan(List<HoDan> listHoDan) {
        this.listHoDan = listHoDan;
    }

//    public void addFamily(HoDan hoDan){
//        this.listHoDan.add(hoDan);
//    }
    
    @Override
    public String toString() {
        return "Số lượng hộ dân trong khu phố= " + listHoDan.size();
    }
    
}
