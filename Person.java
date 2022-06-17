package example;

class Person extends newaction {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		//parameterized constructor
		this.id = id;
		this.name = name;
	}
	public Person() {
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
	private String typeOfPerson(String name) {
		if(name.equals("selva")) {
			return "lusu";
		}
		else {
			return "normal";
		}
	}
	
	@Override
	public void eating() {
		System.out.println("i eat with hand and i eat both veg and non-veg");
	}
	@Override
	public void sleeping() {
		System.out.println("i sleep 8 hrs");
	}
	@Override
	public void walking() {
		System.out.println("i walk with two legs upstraight");
	}
}
