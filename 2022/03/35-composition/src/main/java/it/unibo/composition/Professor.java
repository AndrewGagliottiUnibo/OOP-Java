package it.unibo.composition;

import java.util.Arrays;

public class Professor implements User {

    private static final String DOT = ".";

    private final String name;
    private final String surname;
    private final int id;
    private final String password;
    private String[] courses;

    public Professor(final int id, final String name, final String surname, final String password, final String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = Arrays.copyOf(courses, courses.length);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getId() {
        return this.id;
    }

    // New methods here
    public void replaceCourse(final String course, final int position) {
        if(position < this.courses.length) {
            this.courses[position] = course;
        } else {
            System.out.println("No");
        }
    }

    public void replaceAllCourses(final String[] newCourses) {
        this.courses = null;
        this.courses = Arrays.copyOf(newCourses, newCourses.length);
    }

    // Inherited methods.
    @Override
    public String getUsername() {
        return this.name + Professor.DOT + this.surname;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Professor ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + "] " + "[Courses: " + Arrays.toString(courses) + "]";
    }
}
