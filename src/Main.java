import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	System.out.println("Welcome to the Calculator!");

	Random random = new Random();
	int first = random.nextInt(100);
	int second = random.nextInt(100);

	System.out.println("Your first number is: " + first);
    System.out.println("Your second number is: " + second);

    System.out.println("Please choose an operation: +/*/-");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    String add = "+";
    String subtract = "-";
    String multiply = "*";
    int answer = 0;


        if (input.equals(add)) {
            answer = first + second;
    }
        else if (input.equals(multiply)) {
            answer = first * second;
    }
        else if (input.equals(subtract)) {
            answer = first - second;
    }

        System.out.println("The answer is: " + answer);
    }
}

