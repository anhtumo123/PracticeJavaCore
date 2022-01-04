/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex14;

import Ex14.CustomException.InvalidDOBException;
import Ex14.CustomException.InvalidInputException;
import Ex14.Entity.GoodStudent;
import Ex14.Entity.NormalStudent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ATP
 */
public class Main {
    
    public String checkInput(String regex){
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while (check == 1) {
            try {
                System.out.print("Enter info student (name, phone): ");
                String input = sc.nextLine();
                if(input.matches(regex)){
                    check = 0;
                    return input;
                }
                throw new InvalidInputException("Please enter right format");
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
    
    public Date checkDate(){
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while (check == 1) {
            try {
                System.out.print("Enter birthdate of student: ");
                String input = sc.nextLine();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                dateFormat.setLenient(false);
                Date date = dateFormat.parse(input);
                if(date.getTime() > new Date().getTime()){
                    throw new InvalidDOBException("Birthdate cannot  greater than current date");                   
                }   
                return date;
            } catch (InvalidDOBException e) {      
                System.out.println(e.getMessage());
            } catch (ParseException ex){
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }
    
    //checkInput("^[a-zA-Z\\ ]{1,50}$")
    //checkInput("^(090|098|091|031|035|038)\\d{7}$")
    //checkDate()
    
    public void management(){
        IMangeEnrollmentStudent mangeEnrollmentStudent = new ManageEnrollmentStudent();
        mangeEnrollmentStudent.addStudent(new GoodStudent("Tu", new Date(1999, 11, 22), "Nam", "0911231231", 
                "Ha Noi University", "Good", (float) 8.0, "English Certificate"));
        mangeEnrollmentStudent.addStudent(new NormalStudent("Long", new Date(2000, 2, 3), "Nam", 
                "0981435678", "Ha Noi University", "Good", 800, (int) 7.5));
        mangeEnrollmentStudent.addStudent(new GoodStudent("My", new Date(2001, 10, 10), "Nu", 
                "0906574561", "Ha Noi University", "Good", (float) 8.5, "English Certificate"));
        mangeEnrollmentStudent.addStudent(new NormalStudent("Trang", new Date(1999, 12, 12), "Nu", 
                "0317866787", "Ha Noi University", "Good", 800, (int) 8.5));
        mangeEnrollmentStudent.addStudent(new GoodStudent("Hai", new Date(2004, 2, 20), "Nam", 
                "0357819080", "Ha Noi University", "Good", (float) 7.0, "English Certificate"));
        System.out.println("Display all student: ");
        mangeEnrollmentStudent.displayStudent();
        System.out.println("\nDisplay 2 students were recruited: ");
        mangeEnrollmentStudent.selectCandidate(2);
        System.out.println("\nDisplay 3 students were recruited: ");
        mangeEnrollmentStudent.selectCandidate(3);
        System.out.println("\nDisplay 4 students were recruited: ");
        mangeEnrollmentStudent.selectCandidate(4);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.management();
    }
}
