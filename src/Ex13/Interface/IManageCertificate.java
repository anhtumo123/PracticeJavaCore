/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13.Interface;

import Ex13.Entity.Certificate;
import java.util.List;

/**
 *
 * @author ATP
 */
public interface IManageCertificate {
    void addCertificate(Certificate certificate);  
    List<Certificate> getListCertificate();
    void displayCertificate();
    void removeAllListCertificate();
}
