/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13.Entity;

import java.util.Date;

/**
 *
 * @author ATP
 */
public class Certificate {
    private int certificatedID;
    private String certificateName;
    private int certificateRank;
    private Date certificatedDate;

    public int getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(int certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public int getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(int certificateRank) {
        this.certificateRank = certificateRank;
    }

    public Date getCertificatedDate() {
        return certificatedDate;
    }

    public void setCertificatedDate(Date certificatedDate) {
        this.certificatedDate = certificatedDate;
    }

    public Certificate(int certificatedID, String certificateName, int certificateRank, Date certificatedDate) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
    }

    @Override
    public String toString() {
        return " CertificatedID: " + certificatedID + ", CertificateName: " + certificateName + 
                ", CertificateRank: " + certificateRank + ", CertificatedDate: " + certificatedDate;
    }
    
}
