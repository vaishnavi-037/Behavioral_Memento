package exampleTwo.originator_memento;

import exampleTwo.components.Rank;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private ArrayList<Rank> rankList = new ArrayList<>();

    public void addRank(Rank rank){
        rankList.add(rank);
    }

    public ArrayList<Rank> getRankList() {
        //used clone() method to prevent the referring to original object
        return (ArrayList) rankList.clone();
    }

    //retuning current state to the care taker (RankHistory)
    public RankMemento saveRank(){
        return new RankMemento(getRankList());
    }

    public void revertRank(RankMemento rankMemento){
        rankList = rankMemento.getRankList();
    }

    @Override
    public String toString() {
        return "Player{" +
                "rankList=" + rankList +
                '}';
    }

    //Memento class
    public static class RankMemento{

        ArrayList<Rank> rankList;

        public RankMemento(ArrayList<Rank> rankList) {
            this.rankList = rankList;
        }

        private ArrayList<Rank> getRankList() {
            return rankList;
        }
    }
}
