package Kyu8;

/**
 * After a hard quarter in the office you decide to get some rest on a vacation.
 * So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
 * <p>
 * You will need a rental car in order for you to get around in your vacation.
 * The manager of the car rental makes you some good offers.
 * <p>
 * Every day you rent the car costs $40. If you rent the car for 7 or more days,
 * you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
 * <p>
 * Write a code that gives out the total amount for different days(d).
 */

public class TransportationOnVacation {
    public static void main(String[] args) {
        int days = 1;
        System.out.println(rentalCarCost(days) == 40);
        days = 2;
        System.out.println(rentalCarCost(days) == 80);
        days = 3;
        System.out.println(rentalCarCost(days) == 100);
        days = 4;
        System.out.println(rentalCarCost(days) == 140);
        days = 5;
        System.out.println(rentalCarCost(days) == 180);
        days = 6;
        System.out.println(rentalCarCost(days) == 220);
        days = 7;
        System.out.println(rentalCarCost(days) == 230);
        days = 8;
        System.out.println(rentalCarCost(days) == 270);
        days = 9;
        System.out.println(rentalCarCost(days) == 310);
        days = 10;
        System.out.println(rentalCarCost(days) == 350);
    }

    public static int rentalCarCost(int d) {
        int rent = 40;
        int discount = (d >= 7 ? 50 : ((d >= 3) ? 20 : 0));
        return d * rent - discount;
    }
}
