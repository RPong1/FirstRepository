package Arrays;

public class Person {
	
	public static final String[]  FIRST_START = {"A","B","C","F","P","T"};
	public static final String[]  FIRST_MIDDLE = {"l","en","hris","ete","om"};
	public static final String[]  FIRST_END = {"vin"," ","topher","r","my"};
	
	public static final String[] LAST_START = {"Dav","Ch","L","J","Y","Br"};
	public static final String[] LAST_MIDDLE = {"id","e","i","am","oung","ow"};
	public static final String[] LAST_END = {"son"," ","n","es","s","ison"};
	
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person(String first, String last, Borough home) {
		this.firstName  = first;
		this.lastName = last;
		this.home = home;
	}
	
	public String toString() {
		return "My name is "+firstName+" "+lastName+" and I live in "+home+".";
	}
}

