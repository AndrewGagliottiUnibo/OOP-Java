package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {

        final SportSocialNetworkUserImpl<User> kbacon = new SportSocialNetworkUserImpl<>("Kevin", "Bacon", "kbacon", 56);
        final SportSocialNetworkUserImpl<User> dwashington = new SportSocialNetworkUserImpl<>("Denzel", "Washington", "dwashington", 59);
        final SportSocialNetworkUserImpl<User> pieroF = new SportSocialNetworkUserImpl<>("Piero", "Fiolini", "pieroF", 24);

        /*
         * kbacon sports and test
         */
        kbacon.addSport(Sport.TENNIS);
        kbacon.addSport(Sport.F1);
        kbacon.addSport(Sport.BIKE);
        System.out.println("kbacon sports: " + kbacon.getSports());
        System.out.println("kbacon loves Basket: " + kbacon.hasSport(Sport.BASKET));
        System.out.println("kbacon loves Volley: " + kbacon.hasSport(Sport.VOLLEY));
        System.out.println("kbacon loves F1: " + kbacon.hasSport(Sport.F1));
        System.out.println("kbacon loves Moto GP: " + kbacon.hasSport(Sport.MOTO_GP));

        /*
         * dwashinhgton sports and test
         */
        dwashington.addSport(Sport.BIKE);
        dwashington.addSport(Sport.SOCCER);
        dwashington.addSport(Sport.MOTO_GP);
        System.out.println("dwashington sports: " + dwashington.getSports());
        System.out.println("dwashington loves Basket: " + dwashington.hasSport(Sport.BASKET));
        System.out.println("dwashington loves Soccer: " + dwashington.hasSport(Sport.SOCCER));
        System.out.println("dwashington loves Tennis: " + dwashington.hasSport(Sport.TENNIS));
        System.out.println("dwashington loves Biking: " + dwashington.hasSport(Sport.BIKE));

        /*
         * pieroF sports and test
         */
        pieroF.addSport(Sport.BASKET);
        pieroF.addSport(Sport.TENNIS);
        pieroF.addSport(Sport.VOLLEY);
        pieroF.addSport(Sport.F1);
        System.out.println("pieroF sports: " + pieroF.getSports());
        System.out.println("pieroF loves Basket: " + pieroF.hasSport(Sport.BASKET));
        System.out.println("pieroF loves Volley: " + pieroF.hasSport(Sport.VOLLEY));
        System.out.println("pieroF loves F1: " + pieroF.hasSport(Sport.F1));
        System.out.println("pieroF loves Biking: " + pieroF.hasSport(Sport.BIKE));
    }
}
