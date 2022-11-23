/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xzero
 */
public class Game {

    private String nameOfHomeTeam;
    private String nameOfOppositeTeam;
    private int scoreOfHomeTeam;
    private int scoreOfOppositeTeam;

    public Game(String nameOfHomeTeam, String nameOfOppositeTeam, int scoreOfHomeTeam, int scoreOfOppositeTeam) {
        this.nameOfHomeTeam = nameOfHomeTeam;
        this.nameOfOppositeTeam = nameOfOppositeTeam;
        this.scoreOfHomeTeam = scoreOfHomeTeam;
        this.scoreOfOppositeTeam = scoreOfOppositeTeam;
    }
    
    public String getNameOfHomeTeam() {
        return this.nameOfHomeTeam;
    }
    
    public String getNameOfOppositeTeam(){
        return this.nameOfOppositeTeam;
    }

    public boolean hasWinningTheGame(String searcheTeam) {
        if ((searcheTeam.equals(this.nameOfHomeTeam) && scoreOfHomeTeam > scoreOfOppositeTeam)
                ||(searcheTeam.equals(this.nameOfOppositeTeam) && scoreOfOppositeTeam > scoreOfHomeTeam)) {
            return true;
        }
        return false;
    }
}
