package oop.lab03.acme;

public final class Testing {

    private Testing() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare 3 studenti a piacere 2) Creare 2 docenti a piacere 3)
         * Creare due aulee di esame, una con 100 posti una con 80 posti 4)
         * Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
         * 5) Iscrivere tutti e 3 gli studenti agli esami 6) Stampare in stdout
         * la rapresentazione in stringa dei due esami
         */
        Student student1 = new Student(1, "Pippo", "Baudo", "solecuore", 2017);
        Student student2 = new Student(2, "Cristian", "DeSica", "nataleInIndia", -1904);
        Student student3 = new Student(3, "Massimo", "Boldi", "nataleSulNilo", 1998);
        
        Professor professor1 = new Professor(10, "Robert", "DeNiro", "storiadellaarte", new String[] {"AEG", "ASD", "PIA"});
        Professor professor2 = new Professor(20, "John", "Franky", "asdrubale", new String[] {"OOP", "SO", "PIA"});
        
        ExamRoom aula1 = new ExamRoom(100, "classe grande e bella", true, true);
        ExamRoom aula2 = new ExamRoom(50, "classe piccola e bella", true, true);
        
        Exam esame1 = new Exam(500, 10, professor1.getCourses()[0], professor1, aula1);
        Exam esame2 = new Exam(600, 10, professor2.getCourses()[0], professor2, aula2);
        
        esame1.registerStudent(student1);
        esame1.registerStudent(student2);
        esame1.registerStudent(student3);
        esame2.registerStudent(student1);
        esame2.registerStudent(student2);
        esame2.registerStudent(student3);
        
        System.out.println(esame1.toString());
        System.out.println(esame2.toString());
    }
}
