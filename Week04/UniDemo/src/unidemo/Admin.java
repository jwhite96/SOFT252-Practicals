/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

public class Admin {
    
    public static void assignCourse(Lecturer teacher, Course course) {
        teacher.setCourse(course);
        course.setTeacher(teacher);
    }
    
    public static void assignCourse(Student student, Course course) {
        student.setCourse(course);
    }
    
    public static void getDetails(UniPeople p) {
        System.out.println("Name: " + p.getName());
        System.out.println("Course: " + p.getCourse());
        
        if (p.getCourse() != null) {
            System.out.println("Course: " + p.getCourse());
        } else {
            System.out.println("No Course Assigned");
        }
    }
}
