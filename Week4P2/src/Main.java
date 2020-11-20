public class Main {

    public static void main(String[] args){
    FastFoodRestaurant fastfood = new FastFoodRestaurant();

    fastfood.AccommodateGuest();
    fastfood.AccommodateGuest();
    fastfood.AccommodateGuest();
    System.out.println("Number of guests fastfood: " + FastFoodRestaurant.numberOfGuests);
    System.out.println("Income: " + FastFoodRestaurant.income);
    double taxeFastFood = fastfood.CalculateTaxes();
    System.out.println("Taxe FastFood: " + taxeFastFood);


    VegetarianRestaurant vegetarian = new VegetarianRestaurant();

    vegetarian.AccommodateGuest();
    vegetarian.AccommodateGuest();
    System.out.println("Number of guests vegetarian: " + VegetarianRestaurant.numberOfGuests);
    System.out.println("Income: " + VegetarianRestaurant.income);
    double taxeVegetarian = vegetarian.CalculateTaxes();
    System.out.println("Taxe vegetarian: " + taxeVegetarian);





    }
}
