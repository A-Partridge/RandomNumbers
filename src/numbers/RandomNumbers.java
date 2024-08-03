package numbers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 500; i++) {
			numbers.add((int) (Math.random() * 1000));
		}

		Collections.sort(numbers);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the rank of the smallest number you want to find:");
		int n = scanner.nextInt();

		if (n > 0 && n <= numbers.size()) {
			System.out.println("The number that ranks " + n + " in the sorted list is: " + numbers.get(n - 1));
		} else {
			System.out.println("Invalid input. Please enter a number between 1 and 500.");
		}

		scanner.close();

	}

}
