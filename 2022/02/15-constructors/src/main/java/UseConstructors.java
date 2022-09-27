package src.main.java;

class UseConstructors {

    public static void main(final String[] args) {
        // NB: Per verificare la correttezza dei costruttori implementati
        // stampare a video le informazioni relative agli studenti (metodo
        // printStudentInfo) e ai treni (a tal fine implementare un metodo
        // printTrainInfo nella classe Train).

        // 1) Creare lo studente Mario Rossi, matricola 1014, anno
        // immatricolazione 2013
        Student student1 = new Student(1014, "Mario", "Rossi", 2013);
        student1.printStudentInfo();

        // 2) Creare lo studente Luca Bianchi, matricola 1018, anno
        // immatricolazione 2010
        Student student2 = new Student(1018, "Luca", "Bianchi", 2010);
        student2.printStudentInfo();

        // 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
        // immatricolazione 2012
        Student student3 = new Student(1019, "Peppino", "Vitiello", 2012);
        student3.printStudentInfo();

        // 4) Creare lo studente Luca Verdi, matricola 1020, anno
        // immatricolazione 2013
        Student student4 = new Student(1020, "Luca", "Verdi", 2013);
        student4.printStudentInfo();

        // 5) Creare un treno con 300 posti di cui 100 in prima classe 200 in
        // seconda classe
        Train train1 = new Train(300, 100, 200, 0, 0);
        train1.printTrainInfo();

        // 6) Creare un treno con 1200 posti di cui 50 in prima classe 1050 in
        // seconda classe
        Train train2 = new Train(1200, 50, 1050, 0, 0);
        train2.printTrainInfo();

        // 7) Creare un treno con 500 posti, tutti di seconda classe
        Train train3 = new Train(500, 0, 500, 0, 0);
        train3.printTrainInfo();

        // 8) Creare un treno con numero di posti di default
        Train train4 = new Train();
        train4.printTrainInfo();

        // 9) Verificare che il numero di posti
        // di default sia consistente (ossia che ci sia un numero positivo di
        // posti totali, e che la somma dei posti in prima e seconda classe dia
        // il totale dei posti sul treno).
        if (train4.getTotalSeats() == (train4.getSecondClassSeats() + train4.getFirstClassSeats())) {
            System.out.println("Train 4 is fine.\n");
        }
    }
}
