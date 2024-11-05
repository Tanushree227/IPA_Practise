// Create a class Player with below attributes:
// playerId: int
// playerName: String
// runs: int
// playerType: String
// matchType: String
// The above attributes should be private, write getters, setters and parameterized constructor as required.
// Create a class Soultion with main method.
// Implement two static methods - findPlayerWithLowestRuns and findPlayerByMatchType in Solution class.
// findPlayerWithLowestRuns method:
// This method will take array of Player objects and a string value as input parameters.
// The method will return the least runs of the Player from array of Player objects for the given player type.
// If no player with the above condition are present in array of Player objects, then the method should return 0.

// findPlayerByMatchType method:
// This method will take array of Player objects and String value as input parameters and return the array of Player objects belonging to the match type passed as input parameter in descending order of playerId.
// If no player with the above condition are present in the array of player objects then the method should return null.
// Note: No two players will have the same playerId and runs. All the searches should be case-insensitive.
// The above mentioned static methods should be called from the main method.
// For findPlayerWithLowestRuns method - The main method should print the returned runs as it is if the returned value is greater than 0 or it should print "No such player".

import java.util.ArrayList;
import java.util.Scanner;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    // Parameterized constructor
    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    // Getters
    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    // Setters
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

public class IPA_MockProblem2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Player[] players = new Player[4];
            
            // Reading four Player objects
            for (int i = 0; i < 4; i++) {
                int playerId = Integer.parseInt(scanner.nextLine());
                String playerName = scanner.nextLine();
                int runs = Integer.parseInt(scanner.nextLine());
                String playerType = scanner.nextLine();
                String matchType = scanner.nextLine();
                players[i] = new Player(playerId, playerName, runs, playerType, matchType);
            }
            
            // Reading input for player type and match type
            String playerTypeInput = scanner.nextLine();
            String matchTypeInput = scanner.nextLine();
            
            // Calling the methods and displaying output
            int lowestRuns = findPlayerWithLowestRuns(players, playerTypeInput);
            if (lowestRuns > 0) {
                System.out.println(lowestRuns);
            } else {
                System.out.println("No such player");
            }
            
            Player[] matchedPlayers = findPlayerByMatchType(players, matchTypeInput);
            if (matchedPlayers != null) {
                for (Player player : matchedPlayers) {
                    System.out.println(player.getPlayerId());
                }
            } else {
                System.out.println("No such player");
            }
        }
    }

    // Method to find the player with the lowest runs for a given player type
    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int lowestRuns = Integer.MAX_VALUE;
        boolean found = false;

        for (Player player : players) {
            if (player.getPlayerType().equalsIgnoreCase(playerType)) {
                found = true;
                if (player.getRuns() < lowestRuns) {
                    lowestRuns = player.getRuns();
                }
            }
        }

        return found ? lowestRuns : 0;
    }

    // Method to find players by match type and sort by playerId in descending order
    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {
        ArrayList<Player> matchedPlayers = new ArrayList<>();

        for (Player player : players) {
            if (player.getMatchType().equalsIgnoreCase(matchType)) {
                matchedPlayers.add(player);
            }
        }

        if (matchedPlayers.isEmpty()) {
            return null;
        }

        // Sort players by playerId in descending order
        matchedPlayers.sort((p1, p2) -> Integer.compare(p2.getPlayerId(), p1.getPlayerId()));

        return matchedPlayers.toArray(new Player[0]);
    }
}
