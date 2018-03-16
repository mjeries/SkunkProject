package com.seis635;

public class chips {
	 int bank = 50;
	 int firstDiceRoll = dice.rollDice();
     int secondDiceRoll = dice.rollDice();
  if (firstDiceRoll == 1 && secondDiceRoll  == 1) {
     bank -= (4);
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
