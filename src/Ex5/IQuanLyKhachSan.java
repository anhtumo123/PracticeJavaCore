/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;

/**
 *
 * @author ATP
 */
public interface IQuanLyKhachSan {
    void addNewCustomer(Nguoi nguoi);
    void deleteCustomerByIdentityNumber(String identityNumber);
    void calculateRoomRent();
    void displayCustomers();
}
