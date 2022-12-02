package sectiona.week1;

public class Triangle implements Shape{
    private String color;
    private double sideLengthAB;
    private double sideLengthBC;
    private double sideLengthAC;
    private double x;
    private double y;

    public Triangle(String color, double sideLengthAB, double sideLengthBC, double sideLengthAC, double x, double y){
        this.color = color;
        this.sideLengthAB = sideLengthAB;
        this.sideLengthBC = sideLengthBC;
        this.sideLengthAC = sideLengthAC;
        this.x = x;
        this.y = y;
    }

    public double area(){
        return 0.0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String getColor() {
        return null;
    }

}
