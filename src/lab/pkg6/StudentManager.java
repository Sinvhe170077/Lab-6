/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

import Inputter.Menu;
import Inputter.StudentList;

/**
 *
 * @author Nguyen Van Si
 */
public class StudentManager {
    public static void main(String[] args) {
        String []options={"Add new Student","Search a Student","Update name and mark","Remove a Student","List all","Quit" };
        int choice=0;
        StudentList list =new StudentList();
        do {            
            System.out.println("\nStudent managing program");
            choice=Menu.getChoice(options);
            switch(choice) {
                case 1 : list.addStudent();break;
                case 2:list.updateStudent();break;
                case 3: list.updateStudent();break;
                case 4 : list.removeStudent();break;
                case 5: list.printAll();break;
                default:System.out.println("BYE");
        } }while (choice>0 && choice <6);
    }
}
    


