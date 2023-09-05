package it.unibo.oop.lab.enum2;

public enum Sport {

    /**
     * 
     */
    BASKET(5, "Basket", Place.INDOOR),
    /**
     * 
     */
    VOLLEY(6, "Volley", Place.INDOOR),
    /**
     * 
     */
    TENNIS(1, "Tennis", Place.OUTDOOR),
    /**
     * 
     */
    BIKE(1, "Bike", Place.OUTDOOR),
    /**
     * 
     */
    F1(1, "F1", Place.OUTDOOR),
    /**
     * 
     */
    MOTO_GP(1, "Moto GP", Place.OUTDOOR),
    /**
     * 
     */
    SOCCER(11, "Soccer", Place.OUTDOOR);

    private final int players;
    private final String nome;
    private final Place place;

    Sport(final int players, final String nome, final Place place) {
        this.players = players;
        this.nome = nome;
        this.place = place;
    }

    public boolean isIndividualSport() {
        return this.getPlayers() == 1;
    }

    public boolean isIndoorSport() {
        return this.getPlace().equals(Place.INDOOR);
    }

    public Place getPlace() {
        return this.place;
    }

    public int getPlayers() {
        return this.players;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return  " " + this.getNome() 
                + " " + this.getPlayers()
                + " " + this.getPlace();
    }
}
