package com.seis635;

public class Player {
	 
	private final String name;
    private int totalScore;
private int chips;

    Player(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
int getTotalChips() {
	return chips;
}
void setTotalChips(int chipscore){
    chips = chipscore;}
    
    
    int getTotalScore(){
        return totalScore;
    }

    void setTotalScore(int score){
        totalScore += score;
    }

}


