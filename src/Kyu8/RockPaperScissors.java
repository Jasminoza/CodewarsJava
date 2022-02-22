package Kyu8;

public class RockPaperScissors {
    public static void main(String[] args) {
        String p1, p2;
        p1 = "scissors";
        p2 = "paper";
        System.out.println(rps(p1, p2));
    }

    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }

        if (p1.equals("scissors")) {
            if (p2.equals("paper")) {
                return "Player 1 won!";
                }
            else return "Player 2 won!";
        }

        if (p1.equals("paper")) {
            if (p2.equals("rock")) {
                return "Player 1 won!";
            }
            else return "Player 2 won!";
        }

        if (p1.equals("rock")) {
            if (p2.equals("scissors")) {
                return "Player 1 won!";
            }
            else return "Player 2 won!";
        }

        return "Error";
    }
}
