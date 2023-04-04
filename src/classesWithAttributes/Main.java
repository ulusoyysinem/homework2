package classesWithAttributes;

//solid
//Single responsibility principle
//A class or a method only does one thing
//A class must not contain both attributes and methods

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Before get & set
		Product product = new Product();
		
		product.id = 1;
		product.name = "Iphone XR";
		product.description = "Apple Product";
		product.price = 15.900;
		product.stockAmount = 423;
		
		System.out.println(product.id);
		System.out.println(product.name);
		System.out.println(product.description);
		System.out.println(product.price);
		System.out.println(product.stockAmount);
		
		System.out.println("----------------------");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		*/
		
		// Encapsulation
		// Get and set
		Product product = new Product();
		
		product.setId(1);
		product.setName("Iphone XR");
		product.setDescription("Apple Product");
		product.setPrice(15.900);
		product.setStockAmount(423);
		
		System.out.println(product.getId());
		System.out.println(product.getProductCode());
	
		System.out.println("---------------------");
		
		// Constructors
		Product product2 = new Product(2, "Iphone 13 Pro Max", "Apple Newest Model",30.000,900);
		
		System.out.println(product2.getDescription());
		System.out.println(product2.getProductCode());
	}

}
