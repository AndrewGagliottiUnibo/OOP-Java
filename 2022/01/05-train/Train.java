public class Train {
    private int nTotSeats;
    private int nFirstClassSeats;
    private int nSecondClassSeats;
    private int nFirstClassReservedSeats;
    private int nSecondClassReservedSeats;

    /**
     * Constructor.
     */
    public Train() {
        this.nTotSeats = 450;
        this.nFirstClassSeats = 150;
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassSeats = 300;
        this.nSecondClassReservedSeats = 0;
    }

    void reserveFirstClassSeats(final int number) {
        if (this.nFirstClassReservedSeats < this.nFirstClassSeats) {
            this.nFirstClassReservedSeats += number;
        }
    }

    void reserveSecondClassSeats(final int number) {
        if (this.nSecondClassReservedSeats < this.nSecondClassSeats) {
            this.nSecondClassReservedSeats += number;
        }
    }

    double getTotOccupancyRatio() {
        return (this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) * 100d / this.nTotSeats;
    }

    double getFirstClassOccupancyRatio() {
        return this.nFirstClassReservedSeats * 100d /  this.nFirstClassSeats;
    }

    double getSecondClassOccupancyRatio() {
        return this.nSecondClassReservedSeats * 100d / this.nSecondClassSeats;
    }

    void deleteAllReservations() {
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
}
