package it.unibo.constructors;

class UseConstructors {

    public static void main(final String[] args) {
        // NB: Per verificare la correttezza dei costruttori implementati
        // stampare a video le informazioni relative agli studenti (metodo
        // printStudentInfo) e ai treni (a tal fine implementare un metodo
        // printTrainInfo nella classe Train).

        // 1) Creare lo studente Mario Rossi, matricola 1014, anno
        // immatricolazione 2013
        final Student marioRossi = new Student(1014, "Mario", "Rossi", 2013);
        marioRossi.printStudentInfo();

        // 2) Creare lo studente Luca Bianchi, matricola 1018, anno
        // immatricolazione 2010
        final Student lucaBianchi = new Student(1018, "Luca", "Bianchi", 2010);
        lucaBianchi.printStudentInfo();

        // 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
        // immatricolazione 2012
        final Student peppinoVitiello = new Student(1019, "Peppino", "Vitiello", 2012);
        peppinoVitiello.printStudentInfo();

        // 4) Creare lo studente Luca Verdi, matricola 1020, anno
        // immatricolazione 2013
        final Student lucaVerdi = new Student(1020, "Luca", "Verdi", 2013);
        lucaVerdi.printStudentInfo();

        // 5) Creare un treno con 300 posti di cui 100 in prima classe 200 in
        // seconda classe
        final Train train1 = new Train(300, 100, 200);
        train1.printTrainInfo();

        // 6) Creare un treno con 1200 posti di cui 50 in prima classe 1050 in
        // seconda classe
        final Train train2 = new Train(1200, 50, 1050);
        train2.printTrainInfo();

        // 7) Creare un treno con 500 posti, tutti di seconda classe
        final Train train3 = new Train(500, 0, 500);
        train3.printTrainInfo();

        // 8) Creare un treno con numero di posti di default
        final Train trainDefault = new Train();
        trainDefault.printTrainInfo();

        // 9) Verificare che il numero di posti
        // di default sia consistente (ossia che ci sia un numero positivo di
        // posti totali, e che la somma dei posti in prima e seconda classe dia
        // il totale dei posti sul treno).
        System.out.println("Default train seats: " + train1.getTotalSeats());
        System.out.println("Default train first class seats: " + train1.getFirstClassSeats());
        System.out.println("Default train second class seats: " + train1.getSecondClassSeats());
        System.out.println("Train1 ok? " + (train1.getTotalSeats() == train1.getFirstClassSeats() + train1.getSecondClassSeats() && train1.getTotalSeats() > 0));

        System.out.println("Default train seats: " + train2.getTotalSeats());
        System.out.println("Default train first class seats: " + train2.getFirstClassSeats());
        System.out.println("Default train second class seats: " + train2.getSecondClassSeats());
        System.out.println("Train2 ok? " + (train2.getTotalSeats() == train2.getFirstClassSeats() + train2.getSecondClassSeats() && train2.getTotalSeats() > 0));

        System.out.println("Default train seats: " + train3.getTotalSeats());
        System.out.println("Default train first class seats: " + train3.getFirstClassSeats());
        System.out.println("Default train second class seats: " + train3.getSecondClassSeats());
        System.out.println("Train3 ok? " + (train3.getTotalSeats() == train3.getFirstClassSeats() + train3.getSecondClassSeats() && train3.getTotalSeats() > 0));

        System.out.println("Default train seats: " + trainDefault.getTotalSeats());
        System.out.println("Default train first class seats: " + trainDefault.getFirstClassSeats());
        System.out.println("Default train second class seats: " + trainDefault.getSecondClassSeats());
        System.out.println("Train4 ok? " + (trainDefault.getTotalSeats() == trainDefault.getFirstClassSeats() + trainDefault.getSecondClassSeats() && trainDefault.getTotalSeats() > 0));
    }
}
