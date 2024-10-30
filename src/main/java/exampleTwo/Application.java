package exampleTwo;

import exampleTwo.caretaker.RankHistory;
import exampleTwo.components.HealthState;
import exampleTwo.components.Rank;
import exampleTwo.originator_memento.Player;

public class Application {
    public static void main(String[] args) {
        RankHistory rankHistory = new RankHistory();
        Player player1 = new Player();

        //test cases to check adding
        player1.addRank(new Rank(82, HealthState.HEALTHY));
        player1.addRank(new Rank(90, HealthState.UNHEALTHY));

        //saving current state
        rankHistory.saveRank(player1);
        System.out.println(player1);

        player1.addRank(new Rank(50, HealthState.UNHEALTHY));

        rankHistory.saveRank(player1);
        System.out.println(player1);

        player1.addRank(new Rank(55, HealthState.UNHEALTHY));

        rankHistory.saveRank(player1);
        System.out.println(player1);

        System.out.println("------------------Start Reverting------------------");

        rankHistory.revertRank(player1);
        System.out.println(player1);

        rankHistory.revertRank(player1);
        System.out.println(player1);

        rankHistory.revertRank(player1);
        System.out.println(player1);

        rankHistory.revertRank(player1);
        System.out.println(player1);
    }
}
