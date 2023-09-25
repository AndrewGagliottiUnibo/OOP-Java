class TestStudent {

    public static void main(String[] args) {

        // Studenti
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        
        // Costruzione
        student1.build("Alex", "Balducci", 1015, 2019);
        student2.build("Angel", "Bianchi", 1016, 2018);
        student3.build("Andrea", "Braccci", 1017, 2017);

        // Stampa
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}
