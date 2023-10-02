package it.unibo.constructors;

class UseConstructorsEvolved {

    public static void main(final String[] args) {
        // 1) Creare un treno con numero di posti di default, come nel caso
        // precedente (serve a verificare la nuova implementazione di Train()).
        final Train train1 = new Train();
        train1.printTrainInfo();

        // 2) Creare i seguenti treni usando il costruttore Train(int nFCSeats, int
        // nSCSeats)
        // - nFCSeats = 20; nSCSeats= 200;
        // - nFCSeats = 35; nSCSeats= 165;
        final Train train2 = new Train(20, 200);
        train2.printTrainInfo();

        final Train train3 = new Train(35, 165);
        train3.printTrainInfo();
    }
}
