package inheretence;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.age = 54;
		employee.firstName = "Lale";
		
		System.out.println(customer.age);
		System.out.println(employee.firstName);
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		employeeManager.Add();
		employeeManager.BestEmployee();
		customerManager.List();
	}

}