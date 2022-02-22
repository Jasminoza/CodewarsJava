package Kyu8;

/**
 * Nathan loves cycling.
 * <p>
 * Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
 * <p>
 * You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
 * <p>
 * For example:
 * * time = 3 ----> litres = 1
 * * time = 6.7---> litres = 3
 * * time = 11.8--> litres = 5
 */

public class KeepHydrated {
    public static void main(String[] args) {
        double time = 3;
        System.out.println(Liters(time)); //1
        time = 6.7;
        System.out.println(Liters(time)); //3
        time = 11.8;
        System.out.println(Liters(time)); //5
    }

    public static int Liters(double time) {
        return (int) (time * 0.5);
    }
}
