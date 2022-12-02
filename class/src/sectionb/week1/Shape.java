package sectionb.week1;

public interface Shape {

    double PI = Math.PI;

    double area();

    double perimeter();

    String getColor();

    static int maximumArea(Shape shape1, Shape shape2){
        return shape1.area() >= shape2.area() ? 1 : 2;
    }


}
