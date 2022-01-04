/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15.Comparator;

import Ex15.Entity.Student;
import java.util.Comparator;

/**
 *
 * @author ATP
 */
public class CompareStudentByType implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getClass().toString().compareTo(o2.getClass().toString());
    }

    
}
