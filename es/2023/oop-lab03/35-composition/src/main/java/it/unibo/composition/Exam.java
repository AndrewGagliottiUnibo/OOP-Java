package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    
    private int id;
    private int nMaxStudents;
    private int registeredStudents;
    private String courseName;
    private User professor;
    ExamRoom room;
    Student[] students;

    public Exam(final int id, final int nMaxStudents, final String courseName, 
                final User professor, final ExamRoom room) {
        this.id = id;
        this.nMaxStudents = nMaxStudents;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[nMaxStudents];
    }

    public void registerStudent(Student student) {
        if (registeredStudents < nMaxStudents) {
            registeredStudents++;
            students[registeredStudents - 1] = student;
        }
    }

    public void getRegisteredStudents() {
       Arrays.toString(students); 
    }

    @Override
    public String toString() {
        return "Exam [courseName=" + courseName + ", id=" + id + ", nMaxStudents=" + nMaxStudents
                + ", professor=" + professor.getUsername() + ", registeredStudents=" + registeredStudents + ", room=" + room
                + ", students=" + Arrays.toString(students) + "]\n";
    }
}
