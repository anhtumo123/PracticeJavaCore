/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex14.Comparator;

import Ex14.Entity.GoodStudent;
import Ex14.Entity.Student;
import java.util.Comparator;

/**
 *
 * @author ATP
 */
public class SortStudentByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
    
}
