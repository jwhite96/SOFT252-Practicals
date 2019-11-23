/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/*
*
* Concrete class for course aspects
*/

public class Course {
    
    //Variable Declaration
    private String courseCode;
    private Lecturer teacher;
    private String courseWork;
    private String room;

    //Constructor
    public Course(String room, String code) {
        this.room = room;
        this.courseCode = code;
    }
    
    //Getters & Setters
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getTeacher() {
        return teacher;
    }

    public void setTeacher(Lecturer teacher) {
        this.teacher = teacher;
    }

    public String getCourseWork() {
        return courseWork;
    }

    public void setCourseWork(String courseWork) {
        this.courseWork = courseWork;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    
    
    
}
