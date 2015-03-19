package bester;

import java.util.ArrayList;

public class Cookie implements betterFinder{

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public Object betterFinder(ArrayList<Object> list) {
        return null;
    }
}
