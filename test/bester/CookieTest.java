package bester;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by linliu on 3/19/15.
 */
public class CookieTest {
    @Test
    public void shouldRetuenBetterCookie() throws Exception {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Cookie(2));
        list.add(new Cookie(0));
        list.add(new Cookie(1));

        Object object = new Cookie(2).betterFinder(list);
        Cookie cookie = (Cookie) object;
        assertEquals(cookie.getNumberOfChocolateChips(), 2);
    }
}
