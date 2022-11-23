
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("File: ");
        String file = scan.nextLine();
        System.out.println();

        ArrayList<Game> games = readGamesFromFile(file);

        System.out.print("Team: ");
        String searcheTeam = scan.nextLine();
        
        ArrayList<Game> gamesOfTeam = new ArrayList<>();
        
        for (Game game : games) {
            if(searcheTeam.equals(game.getNameOfHomeTeam()) || searcheTeam.equals(game.getNameOfOppositeTeam()))
                gamesOfTeam.add(game);
        }

        int numberOfGames = gamesOfTeam.size();
        int numberOfWins = 0;
        int numberOfLosses = 0;
        
        for (Game game : gamesOfTeam) {
            if(game.hasWinningTheGame(searcheTeam))
                numberOfWins++;
        }
        
        numberOfLosses = numberOfGames - numberOfWins;

        printScoresOfTeam(numberOfGames, numberOfWins, numberOfLosses);
    }

    public static void printScoresOfTeam(int numberOfGames, int numberOfWins, int numberOfLosses) {
        System.out.println("Games: " + numberOfGames);
        System.out.println("Wins: " + numberOfWins);
        System.out.println("Losses: " + numberOfLosses);
    }

    public static ArrayList<Game> readGamesFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] team = line.split(",");

                String nameOfHomeTeam = team[0];
                String nameOfVisitingTeam = team[1];

                int scoreOfHomeTeam = Integer.valueOf(team[2]);
                int scoreOfVisitingTeam = Integer.valueOf(team[3]);

                games.add(new Game(nameOfHomeTeam, nameOfVisitingTeam, scoreOfHomeTeam, scoreOfVisitingTeam));
            }
        } catch (Exception e) {
            System.out.println("Reading " + file + " failed.");
        }

        return games;
    }
}
