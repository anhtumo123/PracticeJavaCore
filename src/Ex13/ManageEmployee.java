/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13;

import Ex13.Interface.IMangeEmployee;
import Ex13.Entity.Intern;
import Ex13.Entity.Fresher;
import Ex13.Entity.Employee;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ATP
 */
public class ManageEmployee implements IMangeEmployee{

    private List<Employee> listEmployee;

    public ManageEmployee() {
        listEmployee = new ArrayList<>();
    }

    public List<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(List<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }
    
    @Override
    public void displayEmployee() {
        listEmployee.forEach(e -> System.out.println(e.toString()));
    }

    @Override
    public void addEmployee(Employee employee) {
        listEmployee.add(employee);
    }

    @Override
    public void editInfoEmployee(int id, String name, Date dob, String phone, String email) {
        Employee employee = listEmployee.stream().filter(e -> e.getID() == id).findFirst().orElse(null);
        employee.setFullName(name);
        employee.setBirthDay(dob);
        employee.setPhone(phone);
        employee.setEmail(email);
    }

    @Override
    public void deleteEmployee(int id) {
        List<Employee> list = listEmployee.stream().filter(e -> e.getID() == id).collect(Collectors.toList());
        if(!list.isEmpty()){
            listEmployee.remove(list.get(0));
        }
    }

    @Override
    public <T> void searchEmployee(T t) {
        if(t instanceof Fresher){
            listEmployee.stream().filter(e -> e.getClass().equals(t.getClass())).forEach(e -> e.showInfo());
        }else if(t instanceof Intern){
            listEmployee.stream().filter(e -> e.getClass().equals(t.getClass())).forEach(e -> e.showInfo());
        }else{
            listEmployee.stream().filter(e -> e.getClass().equals(t.getClass())).forEach(e -> e.showInfo());
        }
    }
    
}
