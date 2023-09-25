public class Train {

    // Fields
    private int nTotSeats;
    private int nFirstClassSeats;
    private int nSecondClassSeats;
    private int nFirstClassReservedSeats;
    private int nSecondClassReservedSeats;

    // Constructor
    void build(final int nTotSeats, final int nFirstClassSeats, final int nSecondClassSeats) {
        this.nTotSeats = nTotSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }

    // Methods
    void reserveFirstClassSeats(final int nSeats) {
        if(this.nFirstClassSeats >= this.nFirstClassReservedSeats + nSeats) {
            this.nFirstClassReservedSeats += nSeats;
        }
    }

    void reserveSecondClassSeats(final int nSeats) {
        if(this.nSecondClassSeats >= this.nSecondClassReservedSeats + nSeats) {
            this.nSecondClassReservedSeats += nSeats;
        }
    }

    double getTotOccupancyRatio() {
        return this.occupacyRatio(this.nFirstClassReservedSeats + this.nSecondClassReservedSeats, this.nTotSeats);
    }

    double getFirstClassOccupancyRatio() {
        return this.occupacyRatio(this.nFirstClassReservedSeats, this.nFirstClassSeats);
    }

    double getSecondClassOccupancyRatio() {
        return this.occupacyRatio(this.nSecondClassReservedSeats, this.nSecondClassSeats);
    }

    double occupacyRatio(final int num, final int den) {
        return (double) num / den * 100.0;
    }

    void deleteAllReservations() {
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
}