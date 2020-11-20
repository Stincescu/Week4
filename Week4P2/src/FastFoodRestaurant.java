public class FastFoodRestaurant extends Restaurant{
    float fixedPriceMenu = 30;
    static int numberOfGuests = 0;
    static float income = 0;

    public void AccommodateGuest(){
        numberOfGuests = numberOfGuests + 1;
        income = income + fixedPriceMenu;
    }
    public double CalculateTaxes(){
        double taxes;
        taxes = 0.2 * income;
        return taxes;
    }
}
