class Student {

    private String name;
    private String surname;
    private int id;
    private int matriculationYear;
    
    
    // È buona pratica mettere i campi in testa alla classe
    void build(final String name, final String surname, final int id, final int matriculationYear) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.matriculationYear = matriculationYear;
    }

    void printStudentInfo() {
        System.out.println(this.name + " " + this.surname + " " + this.id + " " + this.matriculationYear);
    }
}
