public class Main {

    public static void main(String []args){
        ConnectableInterface[] obiecte = new ConnectableInterface[5];
        Car masina = new Car();
        Phone telefon = new Phone();
        Refrigerator frigider = new Refrigerator();
        Student student = new Student();

        obiecte[0] = masina;
        obiecte[1] = telefon;
        obiecte[2] = frigider;
        //obiecte[3] = student; // Have no idea

    }
}
