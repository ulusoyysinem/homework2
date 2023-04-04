package homework2;

public class Functions {

	public static void main(String[] args) {
		// function call
		findNumber();
	}
	
	// Functions name -> camelCase
	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9 };
		int wanted = 6;
		boolean isFind = false;

		for (int number : numbers) {
			if (number == wanted) {
				isFind = true;
				break;
			}
		}

		if (isFind) {
			//printMessage(wanted);
			printMessage("Found the number: " + wanted); // concatenation of two strings
		} else {
			printMessage("Not found the number: " + wanted);
		}
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}

}
