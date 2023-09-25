class Student {

    // È buona pratica mettere i campi in testa alla classe
    private String name;
    private String surname;
    private int id;
    private int matriculationYear;

    void build(final String name, final String surname, final int id, final int matriculationYear) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.matriculationYear = matriculationYear;
    }

    void printStudentInfo() {
        System.out.println("Name: " + this.name + 
                            ", Surname: " + this.surname + 
                            ", Id: " + this.id + 
                            ", Matriculation year: " + this.matriculationYear);

    }
}
