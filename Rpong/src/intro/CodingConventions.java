package intro;

//class is a file describing a new data type
public class CodingConventions {
	
	//fields
	private String name;
	private String description;
	
	/*
	this is a special method, a "constructor"
	notice it doesn't have a return type
	that is because the thing it returns is an instance of the class therefore 
	the name of the constructor must always match the name of the class
	*/
	public CodingConventions(String name, int index) {
		//In Java, fields are instantiated in a constructor
		//there is a local variable called 'name' and a field called 'name'
		//the field persists, but the local variable data is destroyed at the end of his method
		// distinguish the field by using the reserved word "this"
		this.name = name;
		//static reference begins w. a class name
		description = IntroMain.DESCRIPTIONS[index];
		
	}

	public void doStuff() {
		//static method call
		System.out.println(name+description); //use a space between your operations.
		System.out.println("The square root of 12 is " + Math.sqrt(12));
		
	}
	
}
//this is a test
