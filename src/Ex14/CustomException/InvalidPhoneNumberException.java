/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex14.CustomException;

/**
 *
 * @author ATP
 */
public class InvalidPhoneNumberException extends Exception{
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
