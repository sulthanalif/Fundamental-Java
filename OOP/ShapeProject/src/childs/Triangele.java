package childs;

import parents.Shape;

public class Triangele extends Shape {
    private double base, height;

    public Triangele() {

    }

    public Triangele(String color, double base, double height) {
        setColor(color);
        this.base = base;
        this.height = height;
    }

    //overrited dan implementasi method abstrak getArea
    @Override
    public double getArea() {
        double area = 0.5 * base * height;
        return area;
    } 
}
