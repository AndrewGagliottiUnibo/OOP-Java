package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private final int id;
    private final String courseName;
    private int maxStudents;
    private int registeredStudents;
    private Professor professor;
    private ExamRoom room;
    Student[] students;

    public Exam(final int id, final String courseName, final int maxStudents,
            final Professor professor, final ExamRoom room) {
        this.id = id;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.registeredStudents = 0;
        this.professor = professor;
        this.room = room;
        this.students = new Student[this.maxStudents];
    }

    public void registerStudent(final Student student) {
        if (this.registeredStudents < this.maxStudents) {
            this.students = Arrays.copyOf(this.students, this.students.length + 1);
            this.students[registeredStudents] = student;
            this.registeredStudents++;
        } else {
            System.out.println("No\n");
        }
    }

    @Override
    public String toString() {
        return "Exam [id=" + this.id + ", courseName=" + this.courseName
                + ", maxStudents=" + this.maxStudents
                + ", registeredStudents=" + this.registeredStudents
                + ", professor=" + this.professor + ", room=" + this.room
                + ", students=" + Arrays.toString(this.students) + "]\n";
    }
}
