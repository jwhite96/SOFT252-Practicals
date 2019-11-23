/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

package unidemo;

public class Student extends UniPeople {
    
    //Constructor
    public Student (String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
    
    //attend class function
    public void attendClass() {
        System.out.println(this.name + "is attending" + this.course.getCourseCode() + "in room" + this.course.getRoom());
    }
    
    //do coursework function
    public void doCoursework() {
        if(this.course.getCourseWork() != null){
            System.out.println(this.name + "is doing coursework" + this.course.getCourseWork());
        } else {
            System.out.println("No coursework set");
        }
    }
}
