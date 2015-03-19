package bester;

import java.util.ArrayList;

public class Cookie implements betterFinder {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    public int getNumberOfChocolateChips() {
        return numberOfChocolateChips;
    }

    @Override
    public Object betterFinder(ArrayList<Object> list) {
        Cookie bestCookie = new Cookie(0);
        for (Object object : list) {
            Cookie Cookie = (Cookie) object;
            if (Cookie.getNumberOfChocolateChips() > bestCookie.getNumberOfChocolateChips()) {
                bestCookie = Cookie;
            }
        }
        return bestCookie;

    }
}
