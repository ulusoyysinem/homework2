package methodOverloading;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.sum(15,86));
		System.out.println(calculator.sum());
		System.out.println(calculator.sum(45,7,21));
	}

}
