package oop.lab03.acme;

public class ExamRoom {
    private final int nSeats;
    private final String description;
    private final boolean projectorAvailable;
    private final boolean networkAvailable;

    public ExamRoom(final int nSeats, final String description, final boolean isProjectorAvailable, final boolean isNetworkAvailable) {
        this.nSeats = nSeats;
        this.description = description;
        this.projectorAvailable = isProjectorAvailable;
        this.networkAvailable = isNetworkAvailable;
    }

    public int getSeatsCount() {
        return this.nSeats;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isProjectorAvailable() {
        return this.projectorAvailable;
    }

    public boolean isNetworkAvailable() {
        return this.networkAvailable;
    }

    public String toString() {
        return "ExamRoom [nSeats=" + this.nSeats + ", description=" + this.description + ", isProjectorAvailable="
                + this.projectorAvailable + ", isNetworkAvailable=" + this.networkAvailable + "]";
    }
}
