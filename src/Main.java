public class Main {

public static void main(String[] args) {

    Circle cerc1 = new Circle(2);
    System.out.format("Perimetrul cercului este: %.2f \n", cerc1.CalculatePerimeter());

    Square patrat1 = new Square(4);
    System.out.println("Perimetrul patratului este: " + patrat1.CalculatePerimeter());

    Rectangle dreptunghi1 = new Rectangle(2, 4);
    System.out.println("Perimetrul dreptunhiului este: " + dreptunghi1.CalculatePerimeter());

    Triangle triunghi1 = new Triangle(2,3,4);
    System.out.println("Perimetrul triunghiului este: " + triunghi1.CalculatePerimeter());
}
}
