package Arrays;

public class ObjectArrays {
	
	public ObjectArrays() {
		Person[] people  = new Person[20];
		populate(people);
		for(Person p: people) {
			System.out.println(p);
		}
	}

	private void populate(Person[] people) {
		for(int i = 0; i< people.length; i++) {
			String firstName = randomeNameFrom(Person.FIRST_START, Person.FIRST_MIDDLE, Person.FIRST_END);
			String lastName = randomeNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END);
			Borough b = randomBorough();
		}
	}

	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random()*Borough.NY_BOROUGHS.length)];
	}

	private String randomeNameFrom(String[] a , String[] b , String[] c) {
		return get(a)+get(b)+get(c);
	}

	private String get(String[] a) {
		return a[(int)(Math.random()*a.length)];
	}
	
}
