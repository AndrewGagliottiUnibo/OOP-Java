package it.unibo.oop.lab.enum2;

import java.util.ArrayList;
import java.util.List;

public enum Place {
    /**
     * Sports divided by place to play them.
     */
    INDOOR, OUTDOOR;

    /**
     * @return lists of sports divided by the place to play them
     */
    public List<Sport> getSports() {
        final List<Sport> list = new ArrayList<>();
        for (final Sport sport : Sport.values()) {
            if (sport.getPlace() == this) {
                list.add(sport);
            }
        }
        return list;
    }
}
