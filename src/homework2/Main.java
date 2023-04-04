package homework2;

public class Main {

	public static void main(String[] args) {
		// for CustomerManager.java

		// Classes are reference types.
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();

		// (In stack)CM2 reference number = CM reference number
		// (In heap) They are point the same place
		customerManager2 = customerManager;
		// (In heap) The unused space that is no longer referenced
		// is deleted by the garbage collector.

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// Value Type
		// When you create a value type, everything happening inside the stack.
		// No need heap.
		int numb1 = 10;
		int numb2 = 20;
		numb2 = numb1;
		numb1 = 30;
		System.out.println(numb2);

		// Arrays are reference types
		// BE CAREFUL!
		int[] numbers = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		numbers2 = numbers;
		numbers[0] = 10;
		System.out.println(numbers2[0]);
		
		System.out.println("-----------------");
		
		CustomerManager cManager;
		CustomerManager cManager2 = new CustomerManager();
		
		cManager = cManager2;
		
		cManager.Add();
		cManager.Remove();
		cManager.Update();
	}

}
