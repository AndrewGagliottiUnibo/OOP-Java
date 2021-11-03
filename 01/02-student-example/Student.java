class Student {

    String name;
    String surname;
    int id;
    int matriculationYear;

    void build(String nome, String cognome, int id, int matricola) {
        this.name = nome;
        this.surname = cognome;
        this.id = id;
        this.matriculationYear = matricola;
    }

    void printStudentInfo() {
        System.out.println("Nome: " +this.name);
        System.out.println("Cognome: " +this.surname);
        System.out.println("Id: " + this.id);
        System.out.println("Anno Immatricolazione: " + this.matriculationYear); 
        }
}
