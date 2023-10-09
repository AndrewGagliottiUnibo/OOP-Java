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
        if(this.registeredStudents < this.nMaxStudents) {
            this.students[registeredStudents] = student;
            this.registeredStudents++;
        }
        else {
            System.out.println("Aula piena");
        }
    }

    public int getId() {
        return this.id;
    }

    public int getMaxStudents() {
        return this.nMaxStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getProfessor() {
        return this.professor.toString();
    }

    public ExamRoom getRoom() {
        return this.room;
    }

    public int getNumberOfStudents() {
        return this.registeredStudents;
    }

    public Student[] getRegisteredStudents() {
        return Arrays.copyOf(students, this.getNumberOfStudents());
    }

    @Override
    public String toString() {

        return "Exam [courseName = " + this.getCourseName() + ", id = " + this.getId() + ", nMaxStudents = " + this.getMaxStudents()
                + ", \nprofessor = " + this.getProfessor() + ", \nregisteredStudents = " + this.getNumberOfStudents() + ", \nroom = " + room.toString()
                + ", \nstudents = " + Arrays.toString(this.getRegisteredStudents()) + "]\n";
    }
}
