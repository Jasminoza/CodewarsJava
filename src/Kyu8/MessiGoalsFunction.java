package Kyu8;

/**
 * Messi is a soccer player with goals in three leagues:
 * <p>
 * LaLiga
 * Copa del Rey
 * Champions
 * Complete the function to return his total number of goals in all three leagues.
 * <p>
 * Note: the input will always be valid.
 * <p>
 * For example:
 * * 5, 10, 2  -->  17
 */

public class MessiGoalsFunction {
    public static void main(String[] args) {
        int laLigaGoals, copaDelReyGoals, championsLeagueGoals;
        laLigaGoals = 0;
        copaDelReyGoals = 0;
        championsLeagueGoals = 0;
        System.out.println(goals(laLigaGoals, copaDelReyGoals, championsLeagueGoals)); //0
        laLigaGoals = 43;
        copaDelReyGoals = 10;
        championsLeagueGoals = 5;
        System.out.println(goals(laLigaGoals, copaDelReyGoals, championsLeagueGoals)); //58
    }

    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
}
