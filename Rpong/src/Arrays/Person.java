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
	private Hobby hobby;
	private Person[] friends;
	
	public Person(String first, String last, Borough home) {
		this.firstName  = first;
		this.lastName = last;
		this.home = home;
		this.hobby = Hobby.randomHobby();
		friends = new Person[3];
	}
	
	public void mingle(Person[] people) {
		for(Person p: people) {
			if(p != this) {
				p = betterFriend(p, friends[0]);
				addFriendToFirstPlace(p);
			}
		}
	}
	
	private Person betterFriend(Person p, Person q) {
		if(p == null) {
			return q;
		}
		if(q == null) {
			return p;
		}
		if(p.getClass() == this.getClass()) {
			return p;
		}
		if(q.getClass() == this.getClass()) {
			return q;
		}
		if(p.getClass() == q.getClass() && p.getClass() == this.getClass()) {
			if(p.hobby == this.hobby) {
				return p;
			}
			else if(q.hobby == this.hobby) {
				return q;
			}
		}
		return p;
	}

	public void printFriends() {
		System.out.println("My name is " +firstName+" "+lastName+" and these are my friends: ");
		for(Person f: friends) {
			if(f!= null) {
				System.out.println(f);
			}
		}
	}
	
	public void addFriendToFirstPlace(Person p) {
		for(int i = friends.length - 1; i > 0 ; i--) {
			friends[i] = friends[1-1];
		}
		friends[0] = p;

	}
	
	
	public String toString() {
		return "My name is "+firstName+" "+lastName+" and I live in "+home+". I like "+hobby;
	}
}

