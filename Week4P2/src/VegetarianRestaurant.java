public class VegetarianRestaurant extends Restaurant{
    float fixedPriceMenu = 50;
    static int numberOfGuests = 0;
    static float income = 0;

    public void AccommodateGuest(){
        numberOfGuests = numberOfGuests + 1;
        income = income + fixedPriceMenu;
    }
    public double CalculateTaxes(){
        double taxes;
        double discount;
        taxes = 0.2 * income;
        discount = 0.3 * taxes;
        taxes = taxes - discount;
        return taxes;
    }
}
