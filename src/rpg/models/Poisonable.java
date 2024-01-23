package rpg.models;

import rpg.utils.Constants;

public interface Poisonable {
    default double poison(){
        return Constants.POISON_PERCENTAGE;
    }
}
