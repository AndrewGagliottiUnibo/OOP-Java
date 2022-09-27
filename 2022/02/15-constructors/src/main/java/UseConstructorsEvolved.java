package src.main.java;

class UseConstructorsEvolved {

    public static void main(final String[] args) {
        // 1) Creare un treno con numero di posti di default, come nel caso
        // precedente (serve a verificare la nuova implementazione di Train()).
        Train trainDefault = new Train();
        trainDefault.printTrainInfo();

        // 2) Creare i seguenti treni usando il costruttore Train(int nFCSeats, int
        // nSCSeats)
        // - nFCSeats = 20; nSCSeats= 200;
        // - nFCSeats = 35; nSCSeats= 165;
        Train train1 = new Train(20, 200);
        train1.printTrainInfo();
        Train train2 = new Train(35, 165);
        train2.printTrainInfo();
    }
}
