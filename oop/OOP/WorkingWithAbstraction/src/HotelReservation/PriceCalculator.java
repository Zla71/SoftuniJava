package HotelReservation;

public class PriceCalculator {

    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season, Discount discount) {

        double basePrice = pricePerDay * numberOfDays * season.getMultiplier();

        double priceAfterDiscount = basePrice * discount.getPercentage();

        return basePrice - priceAfterDiscount;
    }
}
