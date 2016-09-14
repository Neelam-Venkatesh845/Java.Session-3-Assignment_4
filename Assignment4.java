import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Maths Maths = new Maths();

		double answer = 0;
		double inputA, inputB;
		char operator;
		boolean done = false;
			System.out.println("enter inputA");
			inputA = input.nextDouble();
			System.out.println("enter operator");
			operator = input.next().charAt(0);
			System.out.println("enetr inputB");
			inputB = input.nextDouble();

			switch (operator) {
			case '+':
				answer = Maths.add(inputA, inputB);
				break;
			case '-':
				answer = Maths.subtract(inputA, inputB);
				break;
			case '*':
				answer = Maths.multiply(inputA, inputB);
				break;
			case '/':
				answer = Maths.divide(inputA, inputB);
				break;
			case '^':
				answer = Maths.power(inputA, inputB);
				break;
			}

			System.out.println(answer);
		}

}
