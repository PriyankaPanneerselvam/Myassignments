package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.println("Printing first 10 numbers");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		for ( int count = 3, range = 10, sum = 0; count<= range; count++ ) {
			sum = firstNumber + secondNumber;
			System.out.println(sum);
			firstNumber = secondNumber;
			secondNumber = sum;
		}
	}

}
