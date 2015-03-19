package bester;

import java.util.ArrayList;

public class Rectangle implements betterFinder{
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    @Override
    public Object betterFinder(ArrayList<Object> list) {
        Rectangle bestRectangle = new Rectangle(0,0);
        for(Object object : list) {
            Rectangle rectangle = (Rectangle) object;
            if (rectangle.area() > bestRectangle.area()){
                bestRectangle = rectangle;
            }
        }
        return bestRectangle;
    }
}
