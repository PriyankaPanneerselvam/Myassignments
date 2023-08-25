package week3.day4;

public class CharArray {

	public static void main(String[] args) {
		
		String input = "Priyanka";
		int count = 0;
		char[]inputArray = input.toCharArray();
		
		for (int i=0; i< inputArray.length; i++) {
		if(inputArray[i]=='e') {
			count++;
		}

	}
		System.out.println("occurance of character '' in the input string: " + count);

}
}
