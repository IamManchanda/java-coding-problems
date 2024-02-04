import java.util.*;

/**
 * Tournament Winner
 * https://www.algoexpert.io/questions/tournament-winner
 * 
 * Approach: Hash Map
 * - Time complexity: O(n)
 * - Space complexity: O(k)
 * where, n is the number of competitions
 * and, k is the number of unique teams participating in the competition
 */

public class Solution {
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentBestTeam = "";
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put(currentBestTeam, 0);

        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> competition = competitions.get(i);
            int result = results.get(i);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            String winningTeam = (result == 1) ? homeTeam : awayTeam;

            updateScores(winningTeam, 3, scores);

            if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
                currentBestTeam = winningTeam;
            }
        }

        return currentBestTeam;
    }

    private void updateScores(
            String team, int points, HashMap<String, Integer> scores) {
        if (!scores.containsKey(team)) {
            scores.put(team, 0);
        }

        scores.put(team, scores.get(team) + points);
    }
}

/*
 * Entered `competitions`:
 * [[HTML, C#], [C#, Python], [Python, HTML]]
 * 
 * Entered `results`:
 * [0, 0, 1]
 * 
 * Result:
 * Python
 */
