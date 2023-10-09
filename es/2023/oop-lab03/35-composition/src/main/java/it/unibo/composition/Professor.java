package it.unibo.composition;

public class Professor implements User {

    private static final String DOT = ".";

    private int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;

    public Professor(final int id, final String name, final String surname, 
                        final String password, final String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public void replaceCourse(String course, int index) {
        this.courses[index] = course;
    }

    public void replaceAllCourses(String[] courses) {
        this.courses = courses;
    }

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

    public String toString() {
        return "Professor ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + ", courses=" + this.courses
            + "]\n";
    }
    
}
