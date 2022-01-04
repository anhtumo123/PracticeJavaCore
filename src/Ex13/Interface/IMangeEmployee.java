/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13.Interface;

import Ex13.Entity.Employee;
import java.util.Date;

/**
 *
 * @author ATP
 */
public interface IMangeEmployee {
    void displayEmployee();
    void addEmployee(Employee employee);
    void editInfoEmployee(int id, String name, Date dob, String phone, String email);
    void deleteEmployee(int id);
    <T> void searchEmployee(T t);
}
