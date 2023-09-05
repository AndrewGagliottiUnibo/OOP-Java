package oop.lab03.acme;

import java.util.Arrays;

public class Professor implements User {

    private final int id;
    private final String name;
    private final String surname;
    private final String password;
    private String[] courses;
    
    //costruttore
    public Professor(final int id, final String name, final String surname, final String password, 
            final String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = Arrays.copyOf(courses, courses.length);
    }

    //getter
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String[] getCourses() {
        return Arrays.copyOf(this.courses, this.courses.length);
    }

    //metodi da implementare per la consegna
    public void replaceCourse(final String course, final int index) {
        this.courses[index] = course;
    }
    
    public void replaceAllCourses(final String[] subjects) {
        this.courses = Arrays.copyOf(subjects, subjects.length);
    }
    
    //metodi implementati
    public String toString() {
        return "Professor [name=" + this.getName()
                + ", surname=" + this.getSurname()
                + ", id=" + this.getId() 
                + "courses=" + Arrays.toString(this.getCourses()) + "]";
    }
    
    //metodi di interfaccia
    public String getUsername() {
        return this.getName() + "." + this.getSurname();
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return this.toString();
    }
}
