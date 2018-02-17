import java.util.Random;

public class SkunkApp {

	public static void main(String[] args) {

		String again; // To control the loop

		// Create a Random object to generate random numbers.
		Random rand = new Random();

		// rolling the dice.
		{
			System.out.println("Rolling");
			int die1 = rand.nextInt(6) + 1;
			int die2 = rand.nextInt(6) + 1;
			System.out.println("dice 1");
			System.out.println(die1);
			System.out.println("dice 2");
			System.out.println(die2);

		}
	}
}