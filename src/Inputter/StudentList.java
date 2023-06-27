/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inputter;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Van Si
 */
public class StudentList extends ArrayList <Student>  {

    public StudentList() {
        super();
    }
    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getCode().equals(code))
                return this.get(i);
            
        }
        return null;
    }
    private Boolean isCodeDupplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code)!=null;
    }
    public void addStudent() {
   String newCode, newName;
   int newMark;
   boolean codeDupplicated = false ;
        do {          
            newCode=Inputter.Inputer.inputPatter("st.code S000", "[sS][\\d]{3}");
            newCode=newCode.trim().toUpperCase();
            codeDupplicated=isCodeDupplicated(newCode);
            if(codeDupplicated)
                System.out.println("Code is Dupplicated");
          
            
        } while (codeDupplicated==true);
        newName=Inputter.Inputer.inputnonBlankStr("Name of new Student");
        newName=newName.toUpperCase();
        newMark=Inputter.Inputer.inputInt("Mark: ", 0, 10);
        Student st = new Student(newCode, newName, newMark);
        this.add(st);
        System.out.println("Student" +newCode+" has been added ");
}
    public void SearchStudent() {
        if(this.isEmpty())
            System.out.println("Empty list .NO updated can be performed!");
        else {
            String sCode=Inputter.Inputer.inputStr("input Student code for search ");
            Student st = this.search(sCode);
            if(st==null) 
                System.out.println("Student " +sCode+"doesnt existed ");
            else
                System.out.println("Found" +st);
            
        
    }
}
    public void updateStudent() {
        if(this.isEmpty()){
            System.out.println("Empty list, no update can be performed");
    }else {
            String uCode=Inputter.Inputer.inputStr("Input code of updated Student: ");
            Student st = this.search(uCode);
            if(st==null)
                System.out.println("Student " +uCode +" doesnt existed");
            else 
                System.out.println("Found " +st);
}
    }
    public void removeStudent() {
        if(this.isEmpty()) 
            System.out.println("Empty list. NO remove can be performed");
        else {
            String rCode = Inputter.Inputer.inputStr("InnputCode of remove Student");
            Student st = this.search(rCode);
            if (st == null) {
                System.out.println("Student " + rCode+ " doesnt existed");
                
            }else 
                this.remove(st);
            System.out.println("Student " +rCode +"has been removed");
            
        }
    }
    public void printAll() {
        if(this.isEmpty()){
            System.out.println("EMpty List");
    }else {
            System.out.println("Student list:");
            for (Student st : this) {
                System.out.println(st);
                
            }
            System.out.println("Total" +this.size()+" Student(s).");
}
        
}
}

