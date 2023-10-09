package it.unibo.composition;

public class ExamRoom {
    private final int seatsCount;
    private final String desc;
    private final boolean projectorAvailable;
    private final boolean networkAvailable;

    public ExamRoom(
        final int nSeats,
        final String description,
        final boolean isProjectorAvailable,
        final boolean isNetworkAvailable
    ) {
        this.seatsCount = nSeats;
        this.desc = description;
        this.projectorAvailable = isProjectorAvailable;
        this.networkAvailable = isNetworkAvailable;
    }

    public int getSeatsCount() {
        return this.seatsCount;
    }

    public String getDescription() {
        return this.desc;
    }

    public boolean isProjectorAvailable() {
        return this.projectorAvailable;
    }

    public boolean isNetworkAvailable() {
        return this.networkAvailable;
    }

    public String toString() {
        return "ExamRoom ["
            +"seatsCount=" + this.seatsCount
            + ", description=" + this.desc
            + ", isProjectorAvailable=" + this.projectorAvailable
            + ", isNetworkAvailable=" + this.networkAvailable
            + "]\n";
    }
}
