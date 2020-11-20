public class Refrigerator implements ConnectableInterface {

    String manufacturer;
    int coolingTemperature;

    public void connectToBluetooth(){

        System.out.println("Connect to bluetooth in progress... REFRIGERATOR");
    }
}
