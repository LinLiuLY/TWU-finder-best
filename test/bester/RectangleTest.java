package bester;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void shouldReturnTheBetterRectangle() throws Exception {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Rectangle(2, 3));
        list.add(new Rectangle(0, 1));
        list.add(new Rectangle(1.5, 2.5));

        Object object = new Rectangle(2, 3).betterFinder(list);
        Rectangle rectangle = (Rectangle) object;
        assertEquals(rectangle.area(), 6.0);
    }
}
