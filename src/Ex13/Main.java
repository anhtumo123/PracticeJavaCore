/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13;

import Ex13.Interface.IMangeEmployee;
import Ex13.Interface.IManageCertificate;
import Ex13.Entity.Intern;
import Ex13.Entity.Fresher;
import Ex13.Entity.Experience;
import Ex13.Entity.Employee;
import Ex13.Entity.Certificate;
import Ex13.CustomException.BirthDayException;
import Ex13.CustomException.InputException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 *
 * @author ATP
 */
public class Main {
    
    List<Integer> listID = new ArrayList<>();
    
    public int checkID(){
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while (check == 1) {
            try {
                int temp = 0;
                System.out.print("Enter employee ID: ");
                int input = Integer.parseInt(sc.nextLine());
                temp = (int) listID.stream().filter(e -> e == input).count();
                if (temp == 0) {
                    if (input > 0) {
                        check = 0;
                        listID.add(input);
                        return input;
                    }
                }
            } catch (Exception e) {
                System.out.println("ID must a number");
            }
        }
        return 0;
    }
    
    public String checkInput(String regex){
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while (check == 1) {
            try {
                System.out.print("Enter info employee (name, phone, email): ");
                String input = sc.nextLine();
                if(input.matches(regex)){
                    check = 0;
                    return input;
                }
                throw new InputException("Please enter right format");
            } catch (InputException e) {
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
                System.out.print("Enter birthdate or certificate date or graduation date of employee: ");
                String input = sc.nextLine();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                dateFormat.setLenient(false);
                Date date = dateFormat.parse(input);
                if(date.getTime() > new Date().getTime()){
                    throw new BirthDayException("Birthdate cannot  greater than current date");                   
                }   
                return date;
            } catch (BirthDayException | ParseException e) {      
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
    
    void management(){
        IMangeEmployee mangeEmployee = new ManageEmployee();
        IManageCertificate manageCertificate = new Employee();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===============");
            System.out.println("1. Add new employee");
            System.out.println("2. Edit info of employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Display employee");
            System.out.println("5. Exit program");
            System.out.print("Enter your choose: ");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    manageCertificate.removeAllListCertificate();
                    int ID = checkID();
                    String name = checkInput("^\\w+$");
                    Date birthDay = checkDate();
                    String phone = checkInput("^\\d+");
                    String email = checkInput("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
                    System.out.print("Enter number of certificate: ");
                    int numberOfCertificate = Integer.parseInt(sc.nextLine());
                    for(int i = 1; i <= numberOfCertificate; i++){
                        System.out.println("Enter certificate " + i +": ");
                        System.out.print("Enter certificate id: ");
                        int certificateID = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter certificate name: ");
                        String certificateName = sc.nextLine();
                        System.out.print("Enter certificate rank: ");
                        int certificateRank = Integer.parseInt(sc.nextLine());
                        Date certificateDate = checkDate();
                        manageCertificate.addCertificate(new Certificate(certificateID, certificateName, certificateRank, certificateDate));
                    }
                    System.out.println("\n0. Experience");
                    System.out.println("1. Fresher");
                    System.out.println("2. Intern");
                    System.out.print("Enter employee type: ");
                    int employeeType = Integer.parseInt(sc.nextLine());
                    switch (employeeType) {
                        case 0:                            
                            System.out.print("Enter experience in year: ");
                            int expInYear = Integer.parseInt(sc.nextLine());
                            System.out.print("Enter pro skill: ");
                            String proSkill = sc.nextLine();
                            mangeEmployee.addEmployee(new Experience(ID, name, birthDay, phone, email, employeeType, 
                                    manageCertificate.getListCertificate(), expInYear, proSkill));
                            break;
                        case 1:
                            Date graduationDate = checkDate();
                            System.out.print("Enter graduation rank: ");
                            String graduationRank = sc.nextLine();
                            System.out.print("Enter education: ");
                            String education = sc.nextLine();
                            mangeEmployee.addEmployee(new Fresher(ID, name, birthDay, phone, email, employeeType,
                                    manageCertificate.getListCertificate(), graduationDate, graduationRank, education));
                            break;
                        case 2:
                            System.out.print("Enter major: ");
                            String major = sc.nextLine();
                            System.out.print("Enter semester: ");
                            int semester = Integer.parseInt(sc.nextLine());
                            System.out.print("Enter university: ");
                            String university = sc.nextLine();
                            mangeEmployee.addEmployee(new Intern(ID, name, birthDay, phone, email, employeeType, 
                                    manageCertificate.getListCertificate(), major, semester, university));
                            break;
                        default:
                            System.out.println("Please choose type of employee above");
                    }
                    break;
                case "2":
                    System.out.print("Enter id of employee to edit: ");
                    int idToEdit = Integer.parseInt(sc.nextLine());
                    String newName = checkInput("^\\w+$");
                    Date newBirthDay = checkDate();
                    String newPhone = checkInput("^\\d+");
                    String newEmail = checkInput("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
                    mangeEmployee.editInfoEmployee(idToEdit, newName, newBirthDay, newPhone, newEmail);
                    break;
                case "3":
                    System.out.print("Enter id of employee to delete: ");
                    int idToDelete = Integer.parseInt(sc.nextLine());                    
                    mangeEmployee.deleteEmployee(idToDelete);
                    listID = listID.stream().filter(i -> i != idToDelete).collect(Collectors.toList());
                    break;
                case "4":
                    System.out.println("\nA. Experience");
                    System.out.println("B. Fresher");
                    System.out.println("C. Intern");
                    System.out.print("Enter employee type to display: ");
                    String employeeTypeToDisplay = sc.nextLine().toUpperCase();
                    switch(employeeTypeToDisplay){
                        case "A":
                            mangeEmployee.searchEmployee(new Experience());
                            break;
                        case "B":
                            mangeEmployee.searchEmployee(new Fresher());
                            break;
                        case "C":
                            mangeEmployee.searchEmployee(new Intern());
                            break;
                    }
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose function from 1 to 4");
            }
        }
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.management();   
    }
}
