import footballTournament.Team;
import footballTournament.Match;
import footballTournament.Player;
import footballTournament.Tournament;

public class Main {
    public static void main(String[] args) {

        Team team1 = new Team();
        team1.name = "BlueberryBros";
        team1.players = "Eighteen";

        Player player1 = new Player();
        player1.name = "Emiliano Rodriguez";
        player1.age = 19;
        player1.position = "Right wing";
        player1.team = team1;

    }
}