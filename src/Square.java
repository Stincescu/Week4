public class Square implements Shape {

    double side;
    Square(double side){
        this.side = side;
    }
    public double CalculatePerimeter(){
        double perimeter;
        perimeter = 4 * side;
        return perimeter;
    }
}
