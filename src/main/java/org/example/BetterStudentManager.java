package org.example;

// In a separate (adjacent) file, create a Student class with two public members:
// - A String member called name
// - A double member called grade

import java.util.ArrayList;
import java.util.List;

public class BetterStudentManager {
    public List<Student> students = new ArrayList<>();
    String newline = System.lineSeparator();

    public void addStudent(String name, double grade) {
        // This method should add a new student to the list of students
        Student newStudent = new Student();
        newStudent.name = name;
        newStudent.grade = grade;
        students.add(newStudent);
    }

    public void removeStudent(String name) {
        // This method should remove the student with the given name from the list of students
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                students.remove(i);
                break;
            }
        }
    }

    public String getStudentList() {
        // This method should return a string with each student's name and grade
        // separated by a space, with each student separated by a newline character ('\n')
        // E.g.
        // John 90.9
        // Jane 88.3
        //
        // You will need to use a String or StringBuilder to build the result by
        // looping through the list of students
        //
        // Replace the following line with your implementation
        String studentList = "";
        for (Student student : students) {
            studentList += student.name + " " + student.grade +newline;
//            String info = (newline + student.name + " " + student.grade);
//            studentList.concat(info);
        }
        return studentList;
    }
}
