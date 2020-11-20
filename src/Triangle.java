public class Triangle implements Shape{
    double side1;
    double side2;
    double base;

    Triangle(double side1, double side2, double base){
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }
    public double CalculatePerimeter(){

        double perimeter;
        perimeter = side1 + side2 + base;
        return perimeter;

    }
}
