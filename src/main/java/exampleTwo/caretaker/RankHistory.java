package exampleTwo.caretaker;

import exampleTwo.originator_memento.Player;

import java.util.Stack;

public class RankHistory {
    private Stack<Player.RankMemento> rankHistory = new Stack<>();

    public void saveRank(Player player){
        rankHistory.push(player.saveRank());
    }

    public void revertRank(Player player){
        if (!rankHistory.isEmpty()){
            player.revertRank(rankHistory.pop());
        }else{
            System.out.println("Nothing left to Undo");
        }
    }
}
