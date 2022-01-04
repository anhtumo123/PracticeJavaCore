/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8;

/**
 *
 * @author ATP
 */
public interface IQuanLyThuVien {
    void addRegisterToBorrowBook(TheMuon theMuon);
    void deleteByCode(String code);
    void displayInfoOfCard();
}
