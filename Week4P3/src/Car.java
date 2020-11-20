public class Car implements ConnectableInterface{

    String manufacturer;
    int numberOfDoors;

    public void connectToBluetooth(){
        System.out.println("Connect to bluetooth in progress... CAR");
    }
}
