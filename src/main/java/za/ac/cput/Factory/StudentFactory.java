package za.ac.cput.Factory;

import za.ac.cput.Entity.Student;
import za.ac.cput.Util.GenericHelper;

public class StudentFactory {

    public static Student createStudent( String firstName,String lastName, String studentEmail, String courseID){
    String studentID = GenericHelper.generateID();
        Student student = new Student.Builder()
                                     .setStudentNumber(studentID)
                                     .setFirstName(firstName)
                                     .setLastName(lastName)
                                     .setStudentEmail(studentEmail)
                                     .setCourseID(courseID)
                                     .build();

        return student;
    }
}
