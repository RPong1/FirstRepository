package Arrays;

import java.util.Arrays;

public class ObjectArrays {
	
	public ObjectArrays() {
		Person[] people  = new Person[20];
		populate(people);
		for(Person p: people) {
			p.mingle(people);
			p.printFriends();
			System.out.println(" ");
		}

	}

	private void populate(Object[] people) {
		for(int i = 0; i< people.length; i++) {
			String firstName = randomeNameFrom(Person.FIRST_START, Person.FIRST_MIDDLE, Person.FIRST_END);
			String lastName = randomeNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END);
			Borough b = randomBorough();
			//BIG IDEA!!!
			//In Object[] (but not int[] or double[]) you are allowed
			//to put multiple datatypes in the array like subclasses
			if(Math.random() < 0.6) {
				//60% student// 40% person
				int grade = (int)(Math.random()*5) + 9;
				people[i] = new Student(firstName,lastName, b, grade);
			}
			else{
				people[i] = new Person(firstName, lastName, b);
			}
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
	
	public Person[] selectGroup(Person[] population, int length) {
		Person[] subgroup = new Person[length];
		subgroup[0] = selectAPerson(population);
		for(int i = 1; i < length; i++) {
			Person nextPerson = selectAPerson(population);
			while(PersonInGroup(subgroup, nextPerson)) {
				nextPerson = selectAPerson(population);
			}
			subgroup[i] = nextPerson;
		}
		return subgroup;
	}
	public static boolean PersonInGroup(Person[] subgroup, Person nextPerson) {
		for(int i = 0; i < subgroup.length;i++) {
			if(subgroup[i] == (nextPerson)) {
				return true;
			}
		}
		return false;
	}

	private Person selectAPerson(Person[] population) {
		int randomNum = (int)(Math.random()*population.length);
		return population[randomNum];
	}
	
	public double countDifferences(Person[] arr1, Person[] arr2) {
		double differences = 0;
		for(int i = 0; i < arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				differences++;
			}
		}
		return differences;
	}
	
	public void testShuffling() {
		
	}
}
