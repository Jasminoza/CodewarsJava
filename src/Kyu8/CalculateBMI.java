package Kyu8;

/**
 * Write function bmi that calculates body mass index (bmi = weight / height^2).
 *
 * if bmi <= 18.5 return "Underweight"
 *
 * if bmi <= 25.0 return "Normal"
 *
 * if bmi <= 30.0 return "Overweight"
 *
 * if bmi > 30 return "Obese"
 */
public class CalculateBMI {
    public static void main(String[] args) {
        System.out.println(bmi(80, 1.80));
    }

    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi > 30) {
            return "Obese";
        } else if (bmi > 25) {
            return "Overweight";
        } else if (bmi > 18.5) {
            return "Normal";
        } else return "Underweight";
    }
}
