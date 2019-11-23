/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * 
 */

public class Lecturer extends UniPeople implements ITeach{

    //Constructor
    public Lecturer(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    //Lecturer methods
    @Override
    public void teach() {
        System.out.println(this.course + " is teaching " + this.course.getCourseCode() + " in room " + this.course.getRoom());
    }

    @Override
    public void setCoursework(String CW) {
        this.course.setCourseWork(CW);
    }   
    
  
}
