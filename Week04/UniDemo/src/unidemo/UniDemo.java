/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

public class UniDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lecturer Mark = new Lecturer(1234, "Mark Dixon ");
        
        Student James = new Student(" James White ", 10590453);
        
        Course Security = new Course(" SMB101 ", " SOFT252 ");
        
        //Print student details
        Admin.getDetails(James);
        
        //Assign course to lecturer
        Admin.assignCourse(Mark, Security);
        
        //Assign course to student
        Admin.assignCourse(James, Security);
        
        //Student attends
        James.attendClass();
            
        //Lecturer teaches
        Mark.teach();
        
        //Student coursework attempt
        James.doCoursework();
        
        //Lecturer sets coursework
        Mark.setCoursework(" CW1: Java Programming ");
        
        //Student coursework reattempt
        James.doCoursework();
                     
        //Print lecturer details
        Admin.getDetails(Mark);
    }
}
