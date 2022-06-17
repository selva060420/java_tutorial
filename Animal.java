package example;

public class Animal implements actions{
	int id; 
	String name;
	
	public Animal(int id, String name) {
		//parameterized constructor
		this.id = id;
		this.name = name;
	}
	public Animal() {
		//empty constructor
	}
	public int getId() {
		//function
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void eats() {
		System.out.println("i eat different");
	}
	@Override
	public void sleeps() {
		System.out.println("i sleep different");
	}
	@Override
	public void walks() {
		System.out.println("i walk different");
	}
}
