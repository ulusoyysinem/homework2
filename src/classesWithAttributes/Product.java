package classesWithAttributes;

//Attribute -> özellik
//A class must not contain both attributes and methods

public class Product {
	
	//Constructor without parameters
	public Product() {
		
	}
	
	// Constructor with parameters
	public Product(int id, String name,String description, double price, int stockAmount) {
		System.out.println("Constructor!");
		this._id = id;
		this._name = name;
		this._description = description;
		this._price = price;
		this._stockAmount = stockAmount;
		this._productCode = this._name.substring(0,1) + _id;
		
	}
	
	
	// attribute | field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _productCode;

	// get -> read
	// set -> create
	
	//getter
	public int getId() {
		return _id;
	}
	//setter
	public void setId(int id) {
		// this -> id of this class
		// this.id = id;
		_id = id; // best practice
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String description) {
		_description = description;
	}
	public double getPrice() {
		return _price;
	}
	public void setPrice(double price) {
		_price = price;
	}
	public int getStockAmount() {
		return _stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}
	public String getProductCode() {
		return this._name.substring(0,1) + _id;
	}
	
	

}
