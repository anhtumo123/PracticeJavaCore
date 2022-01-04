/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15;

import Ex15.Interface.IManageDepartment;
import Ex15.Entity.Department;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ATP
 */
public class ManageDepartment implements IManageDepartment{

    private List<Department> listDepartment;

    public ManageDepartment() {
        listDepartment = new ArrayList<>();
    }

    public List<Department> getListDepartment() {
        return listDepartment;
    }

    public void setListDepartment(List<Department> listDepartment) {
        this.listDepartment = listDepartment;
    }
    
    @Override
    public void adDepartment(Department department) {
        listDepartment.add(department);
    }
    
}
