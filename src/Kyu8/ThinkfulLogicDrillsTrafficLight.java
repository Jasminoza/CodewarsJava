package Kyu8;

/**
 * You're writing code to control your town's traffic lights.
 * You need a function to handle each change from green,
 * to yellow, to red, and then to green again.
 * <p>
 * Complete the function that takes a string as an argument
 * representing the current state of the light and returns
 * a string representing the state the light should change to.
 * <p>
 * For example, update_light('green') should return 'yellow'.
 */
public class ThinkfulLogicDrillsTrafficLight {
    public static void main(String[] args) {
        String current = "yellow";
        System.out.println(updateLight(current)); // red
    }

    public static String updateLight(String current) throws IllegalArgumentException {
        return switch (current) {
            case "green" -> "yellow";
            case "yellow" -> "red";
            case "red" -> "green";
            default -> throw new IllegalArgumentException();
        };
    }
}
