package Kyu8;

/**
 * Our football team finished the championship.
 * The result of each match look like "x:y".
 * Results of all matches are recorded in the collection.
 * <p>
 * For example: ["3:1", "2:2", "0:1", ...]
 * <p>
 * Write a function that takes such collection and counts
 * the points of our team in the championship. Rules for
 * counting points for each match:
 * <p>
 * if x > y: 3 points
 * if x < y: 0 point
 * if x = y: 1 point
 * Notes:
 * <p>
 * there are 10 matches in the championship
 * 0 <= x <= 4
 * 0 <= y <= 4
 */

public class TotalAmountOfPoints {
    public static void main(String[] args) {
        String[] games = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};
        System.out.println(points(games)); // 30
        String[] games2 = {"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"};
        System.out.println(points(games2)); // 10
        String[] games3 = {"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"};
        System.out.println(points(games3)); // 0
    }

    public static int points(String[] games) {
        int scores = 0;
        for (String game : games) {
            int x = Integer.parseInt(game.charAt(0) + "");
            int y = Integer.parseInt(game.charAt(2) + "");
            if (x > y) {
                scores += 3;
            }
            if (x == y) {
                scores += 1;
            }
        }
        return scores;
    }
}
