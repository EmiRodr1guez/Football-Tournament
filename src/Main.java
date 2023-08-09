import footballTournament.Team;
import footballTournament.Match;
import footballTournament.Player;
import footballTournament.Tournament;

public class Main {
    public static void main(String[] args) {

        Team team1 = new Team();
        team1.name = "BlueberryBros";
        team1.players = "Eighteen";

        Team team2 = new Team();
        team2.name = "StrawberryStrddlers";
        team2.players = "Eighteen";

        Player player1 = new Player();
        player1.name = "Emiliano Rodriguez";
        player1.age = 19;
        player1.position = "Right wing";
        player1.team = team1;

        Match firstGame = new Match();
        firstGame.team1 = team1;
        firstGame.team2 = team2;
        firstGame.score1 = 14;
        firstGame.score2 = 16;
        firstGame.winner = team1;

        Tournament tournament = new Tournament();
        tournament.name = "Tourney1";
        tournament.teams = "18";



    }
}