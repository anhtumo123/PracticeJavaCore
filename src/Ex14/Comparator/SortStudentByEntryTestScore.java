/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex14.Comparator;

import Ex14.Entity.NormalStudent;
import Ex14.Entity.Student;
import java.util.Comparator;

/**
 *
 * @author ATP
 */
public class SortStudentByEntryTestScore implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (((NormalStudent)o2).getEntryTestScore()- ((NormalStudent)o1).getEntryTestScore());
    }
    
}
