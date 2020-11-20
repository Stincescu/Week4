public class Circle implements Shape {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    public double CalculatePerimeter() {

        double perimeter;

        perimeter = 2*Math.PI*radius;

        return perimeter;
    }


}
