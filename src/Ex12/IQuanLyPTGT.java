/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex12;

import java.util.List;

/**
 *
 * @author ATP
 */
public interface IQuanLyPTGT {
    void addVehicle(List<Xe> listXe, Xe xe);
    void displayVehicle(List<Xe> listXe);
    void searchByManufactureAndColor(List<Xe> listXe, String manufacture, String color);
    void deleteByID(List<Xe> listXe, int ID);
}
