package sectiona.week1;


public interface Shape {

    double area();

    public double perimeter();

    String getColor();

    static int maximumArea(Shape shape1, Shape shape2){
        int flag;

        if(shape1.area() > shape2.area()){
            flag = 1;
        }else if(shape1.area() == shape2.area()){
            flag = 0;
        }else{
            flag = 2;
        }

        return flag;
    }

}
