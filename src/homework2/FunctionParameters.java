package homework2;

public class FunctionParameters {

	public static void main(String[] args) {
		String message = "The weather is nice today!";
		String newMessage = message.substring(0, 2); // substring is return something

		// int number = sum(); -> function with no parameters
		int number = sum(5, 7);
		String cityName = giveCityName();

		System.out.println(number);
		System.out.println(cityName);

		// Function with variable arguments
		int sum = sum2(2, 6, 4, 7, 8, 6, 12, 3);
		
		System.out.println(sum);
	}

	// Don't repeat yourself -> The purpose of using functions
	public static void addCustomer() {
		System.out.println("Added!");
	}

	public static void deleteCustomer() {
		System.out.println("Deleted!");
	}

	public static void update() {
		System.out.println("Updated!");
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;

		// return; -> end
		// return 5; -> end and send 5
	}

	// VARIABLE ARGUMENTS
	public static int sum2(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}

		return sum;
	}

	public static String giveCityName() {
		return "Ankara";
	}

}
