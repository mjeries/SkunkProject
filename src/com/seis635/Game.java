package com.seis635;


import java.util.Scanner;

public class Game {

	

    private Player p1;
    private Player p2;
    private Dice dice;
    private int scoreToWin;

    void displayGameMenu() {
        System.out.println();
        System.out.println("(1) Start game");
        System.out.println("(2) Play round");
        System.out.println("(3) Who is leading now?");
        System.out.println("(4) Display game instructions");
        System.out.println("(5) Exit game");
        System.out.print("Choose an option: ");
        
    }

    void selectGameOption(int optionSelected) {
        switch (optionSelected) {
            case 1:
                this.startNewGame();
                break;
            case 2:
                this.playOneRound(p1);
                this.playOneRound(p2);
                break;
            case 3:
                this.whoIsLeading();
                break;
            case 4:
                this.displayGameInstruction();
                break;
            default:
                break;
        }
    }

    void startNewGame() {
        String p1Name;
        String p2Name;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter player one name: ");
        p1Name = sc.nextLine();
        System.out.print("Please enter player two name: ");
        p2Name = sc.nextLine();
        System.out.print("Please enter the maximum score required to win: ");
        scoreToWin = sc.nextInt();

        p1 = new Player(p1Name);
        p2 = new Player(p2Name);
        dice = new Dice();
    }

    void playOneRound(Player p) {
        int result;

        int firstDiceRoll = dice.rollDice();
        int secondDiceRoll = dice.rollDice();
     if (firstDiceRoll == 1 && secondDiceRoll  == 1) {
        result = (0);
        p.setTotalScore(result);
        System.out.printf("(GameOver player losses)",
                p.getName(), firstDiceRoll, secondDiceRoll,
                result, p.getTotalScore());
        
     } else if (firstDiceRoll == 1) {
            result = (0);
            p.setTotalScore(result);
            System.out.printf("%s rolled %d and %d, "
                    + "and scored %d points(Skunk), "
                    + "for a total of %d points",
                    p.getName(), firstDiceRoll, secondDiceRoll,
                    result, p.getTotalScore()
            );
        
        }
        else if (secondDiceRoll == 1) {
            result = (0);
            p.setTotalScore(result);
            System.out.printf("%s rolled %d and %d, "
                    + "and scored %d points(Skunk), "
                    + "for a total of %d points",
                    p.getName(), firstDiceRoll, secondDiceRoll,
                    result, p.getTotalScore());
        
        
        
            
        }
        else {
            result = (firstDiceRoll + secondDiceRoll);
            p.setTotalScore(result);
            System.out.printf("%s rolled %d and %d, "
                    + "and scored %d points, "
                    + "for a total of %d points",
                    p.getName(), firstDiceRoll, secondDiceRoll,
                    result, p.getTotalScore()
            );
        }

        System.out.println();
    }

    void whoIsLeading() {
        if (p1.getTotalScore() == p2.getTotalScore()) {
            System.out.format("Its currently a draw, "
                    + "%s has %d, %s has %d",
                    p1.getName(), p1.getTotalScore(),
                    p2.getName(), p2.getTotalScore()
            );
        } else if (p1.getTotalScore() > p2.getTotalScore()) {
            System.out.printf("%s is leading, %s has %d points, "
                    + "%s has %d points",
                    p1.getName(), p1.getName(), p1.getTotalScore(),
                    p2.getName(), p2.getTotalScore());
        } else if (p1.getTotalScore() < p2.getTotalScore()) {
            System.out.format("%s is leading, %s has %d points, "
                    + "%s has %d points.",
                    p2.getName(), p2.getName(), p2.getTotalScore(),
                    p1.getName(), p1.getTotalScore()
            );
        }
    }

    void displayGameInstruction() {
        System.out.println();
        System.out.println("All players roll two dice per turn.");
        System.out.println("If player rolls 1 thats a skunk and 0 for the round.");
        System.out.println("If player rolls a 1 on both rolls thats a snake eyes and player loses game.");
        System.out.println("For each player, result is incremented after each turn.");
        System.out.println("First player to reach or exceed the maxScore wins the game");

    }

    boolean checkIfAnyoneHasWon() {
        if (p1.getTotalScore() >= scoreToWin && p2.getTotalScore() >= scoreToWin) {
            System.out.println("Its a draw! Both players have exceeded the score limit");
            return true;
        } else if (p1.getTotalScore() >= scoreToWin && p2.getTotalScore() < scoreToWin) {
            System.out.format("%s won", p1.getName());
            return true;
        } else if (p1.getTotalScore() < scoreToWin && p2.getTotalScore() >= scoreToWin) {
            System.out.format("%s won", p2.getName());
            return true;
        } 
        return false;
    }
    
  


public static void main(String[] args) {
		
		
        System.out.println("SkunkApp Dice Game");

        Game game = new Game();

        int optionSelected;

        while (true) {
            game.displayGameMenu();
            System.out.println();
            Scanner sc = new Scanner(System.in);
            optionSelected = sc.nextInt();

            while (optionSelected > 5 || optionSelected < 0) {

                System.out.print("Option entered invalid, please enter a number from 1 to 5: ");
                optionSelected = sc.nextInt();
            }

            if (optionSelected == 5) {
                System.out.println("Exiting game");
                break;
            }

            game.selectGameOption(optionSelected);

            boolean anyoneWin = game.checkIfAnyoneHasWon();
            if (anyoneWin) {
                System.out.println();
                System.out.println("Game ended.");
                break;
                
              
            }
        }
    }




}

