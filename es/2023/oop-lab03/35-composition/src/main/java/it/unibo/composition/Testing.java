package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        User student1 = new Student(12, "Andrea", "Rossi", "dwwev", 2019);
        User student2 = new Student(33, "Carlo", "Verdi", "ethntn", 2018);
        User student3 = new Student(4, "Pippo", "Pluto", "ethtyng", 2023);

        // 2)Creare 2 docenti a piacere
        User professor1 = new Professor(1, "Mario", "Rossi", "gdbnftgnfgn", new String[] { "Analisi 1", "Analisi 2" });
        User professor2 = new Professor(2, "Luigi", "Verdi", "gdhnrnhf", new String[] { "Etica 1", "Etica 2" });

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom room1 = new ExamRoom(100, "Aula 1", true, false);
        ExamRoom room2 = new ExamRoom(80, "Aula 2", false, true);

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam exam1 = new Exam(1, 10, "Analisi 1", professor1, room1);
        Exam exam2 = new Exam(2, 2, "Etica 1", professor2, room2);

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
