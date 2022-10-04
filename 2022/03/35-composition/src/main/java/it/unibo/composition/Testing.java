package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // Courses
        String[] course1 = { "Sociologia", "Vita da Strada" };
        String[] course2 = { "OOP", "SO" };

        // 1)Creare 3 studenti a piacere
        User student1 = new Student(1000, "Pluto", "Pluty", "ff", 2022);
        User student2 = new Student(1001, "Pippo", "Pippy", "gg", 2022);
        User student3 = new Student(1002, "Paperino", "Papere", "hh", 2022);

        // 2)Creare 2 docenti a piacere
        User professor1 = new Professor(1, "Giovanni", "Storti", "subaru", course1);
        User professor2 = new Professor(2, "Piero", "Angela", "sq", course2);

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom room1 = new ExamRoom(100, "Sociologia", false, false);
        ExamRoom room2 = new ExamRoom(80, "OOP", true, false);

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam exam1 = new Exam(1, "Sociologia", 10, (Professor) professor1, room1);
        Exam exam2 = new Exam(2, "OOP", 2, (Professor) professor2, room2);

        // 5) Iscrivere tutti e 3 gli studenti agli esami
        exam1.registerStudent((Student) student1);
        exam1.registerStudent((Student) student2);
        exam1.registerStudent((Student) student3);
        exam2.registerStudent((Student) student1);
        exam2.registerStudent((Student) student2);
        exam2.registerStudent((Student) student3);

        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(exam1.toString());
        System.out.println(exam2.toString());
    }
}
