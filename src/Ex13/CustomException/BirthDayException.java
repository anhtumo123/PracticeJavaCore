/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13.CustomException;

/**
 *
 * @author ATP
 */
public class BirthDayException extends Exception{
    public BirthDayException(String message){
        super(message);
    }
}
