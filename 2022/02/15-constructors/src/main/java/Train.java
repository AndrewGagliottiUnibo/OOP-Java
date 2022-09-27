package src.main.java;

class Train {

    int seats;
    int firstClassSeats;
    int secondClassSeats;
    int firstClassReservedSeats;
    int secondClassReservedSeats;

    static final int DEFAULT_N_FC_SEATS = 50;
    static final int DEFAULT_N_SC_SEATS = 100;
    static final int DEFAULT_TOT_SEATS = 150;

    /**
     * Constructor.
     * 
     * @param totSeats
     * @param firstClassSeats
     * @param secondClassSeats
     * @param firstClassReservedSeats
     * @param secondClassReservedSeats
     */
    public Train(final int totSeats, final int firstClassSeats, final int secondClassSeats,
            final int firstClassReservedSeats, final int secondClassReservedSeats) {
        if (totSeats == firstClassSeats + secondClassSeats) {
            this.seats = totSeats;
            this.firstClassSeats = firstClassSeats;
            this.secondClassSeats = secondClassSeats;
            this.firstClassReservedSeats = firstClassReservedSeats;
            this.secondClassReservedSeats = secondClassReservedSeats;
        } else {
            System.out.println("Oggetto non creato. Codice totSeats: <" + totSeats);
            new Train();
        }
    }

    /**
     * Constructor with seats definitions.
     * 
     * @param firstClassSeats
     * @param secondClassSeats
     */
    public Train(final int firstClassSeats, final int secondClassSeats) {
        this(DEFAULT_TOT_SEATS, firstClassSeats, secondClassSeats, 0, 0);
    }

    /**
     * Empty constructor.
     * Modified version in which calls the other constructor with new parameters.
     */
    public Train() {
        this(DEFAULT_TOT_SEATS, DEFAULT_N_FC_SEATS, DEFAULT_N_SC_SEATS, 0, 0);
    }

    void deleteAllReservations() {
        this.firstClassReservedSeats = 0;
        this.secondClassReservedSeats = 0;
    }

    double getFirstClassOccupancyRatio() {
        return this.firstClassReservedSeats * 100d / this.firstClassSeats;
    }

    int getFirstClassSeats() {
        return this.firstClassSeats;
    }

    int getSecondClassSeats() {
        return this.secondClassSeats;
    }

    double getOccupancyRatio() {
        return (this.firstClassReservedSeats + this.secondClassReservedSeats) * 100d / this.seats;
    }

    double getSecondClassOccupancyRatio() {
        return this.secondClassReservedSeats * 100 / this.secondClassSeats;
    }

    int getTotalSeats() {
        return this.seats;
    }

    void printTrainInfo() {
        System.out.println("Train info:");
        System.out.println("-nTotSeats: " + this.seats);
        System.out.println("-nFCSeats: " + this.firstClassSeats);
        System.out.println("-nSCSeats: " + this.secondClassSeats);
        System.out.println("-nFCReservedSeats: " + this.firstClassReservedSeats);
        System.out.println("-nSCReservedSeats: " + this.secondClassReservedSeats + "\n");
    }

    void reserveFirstClassSeats(final int nSeats) {
        this.firstClassReservedSeats += nSeats;
    }

    void reserveSecondClassSeats(final int nSeats) {
        this.secondClassReservedSeats += nSeats;
    }
}
