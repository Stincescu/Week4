public class Rectangle implements Shape {
    double shortSide;
    double longSide;

    Rectangle(double shortSide, double longSide){
        this.shortSide = shortSide;
        this.longSide = longSide;
    }
    public double CalculatePerimeter(){
        double perimeter;
        perimeter = 2 * (shortSide + longSide);
        return perimeter;
    }
}
