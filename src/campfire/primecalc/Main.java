package campfire.primecalc;

import java.util.Scanner;

public class Main {

	private final static int DEFAULT_SIZE = 4;

	public static void main(final String[] args) {

		final Scanner in = new Scanner(System.in);
		final Main main = new Main();

		// enter number (of questions)
		int numberOfQ = main.fetchNumber(in);
		int numberOfTurns = main.fetchTurns(in);

		in.close();

		for (int i = 0; i < numberOfTurns; i++) {
			final PrimeResultSet foo = new PrimeResultSet(numberOfQ, DEFAULT_SIZE);
			System.out.println(foo.toString());
			System.out.println("-------------------");
		}
	}

	private int fetchNumber(final Scanner in) {
		System.out.print("Please enter number of questions: ");
		return Integer.valueOf(in.nextLine());
	}

	private int fetchTurns(final Scanner in) {
		System.out.print("Please enter number of turns: ");
		return Integer.valueOf(in.nextLine());
	}

}
