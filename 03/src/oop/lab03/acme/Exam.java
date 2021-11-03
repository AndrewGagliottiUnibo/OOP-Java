package oop.lab03.acme;

import java.util.Arrays;

public class Exam {
    
    private final int id;
    private final int maxStudents;
    private int registeredStudents;
    private final String courseName;
    private final Professor professor;
    private final ExamRoom room; 
    private Student[] students;
    
    //costruttore
    public Exam(final int id, final int maxStudents, final String courseName, 
           final Professor professor, final ExamRoom room) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[0];
    }

    //getter
    public int getId() {
        return this.id;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public int getRegisteredStudents() {
        return this.registeredStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public ExamRoom getRoom() {
        return this.room;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students, students.length);
    }
    
    //metodi da implementare
    public void registerStudent(final Student student) {
        if(this.getRegisteredStudents() < this.getMaxStudents()) {
            this.students = Arrays.copyOf(students, students.length + 1);
            this.registeredStudents = this.getRegisteredStudents() + 1;
            this.students[this.getRegisteredStudents() - 1] = student;
        }
        else {
            System.out.println("Aula piena");
        }
    }
    
    public String toString() {
        return "Exam [id=" + this.id
                + ", nMaxStudents=" + this.maxStudents
                + ", nRegisteredStudents=" + this.registeredStudents
                + ", courseName=" + this.courseName
                + ", students=" + Arrays.toString(this.students)
                + ", professor=" + this.professor
                + ", room=" + this.room.toString() + "]";
    }
}
