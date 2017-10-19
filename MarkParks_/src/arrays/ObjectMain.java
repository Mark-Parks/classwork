package arrays;

public class ObjectMain {

	public ObjectMain() {
		Person[] people = new Person[100];
		populate(people);
		Person[] group = selectGroup(people,100);
		for(Person p: group) {
			p.mingle(people);
			System.out.println(p);
			p.statYourFriends();
		}
	}

	private void analyzeCommonalities(Person[] people, Person[] group) {
		double averageCommonality = 0;
		double trials = 500;
		double trialCount = 0;
		for(int i = 0; i< trials; i++) {
			trialCount += countCommonalities(people,group);
			group = selectGroup(people,10000);
		}
		averageCommonality = trialCount/trials;
		System.out.println("After "+trials+" trials, shuffling "+people.length+" people, on average, "+averageCommonality+" people end up in teh same position where they started.");
	}
	
	
	private int countCommonalities(Object[] arr1, Object[] arr2) {
		int count = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i]==arr2[i]) {
				count++;
			}
		}
		return count;
	}
	
	
	
	public Person[] selectGroup(Person[] population, int length) {
		Person[] newGroup = new Person[length];
		for(int i = 0; i < length; i++) {
			Person toAdd = randomPerson(population);
			while(alreadyContains(newGroup, toAdd)) {
				toAdd = randomPerson(population);
			}
			newGroup[i] = toAdd;
		}
		return newGroup;
	}
	
	private boolean alreadyContains(Person[] population, Person p) {
		for(int i = 0; i< population.length; i++) {
			if(population[i] == p) {
				return true;
			}
		}
		return false;
	}

	private Person randomPerson(Person[] population) {
		int index = (int)(Math.random()*population.length);
		return population[index];
	}

	private void populate(Object[] people) {
		for(int i = 0; i < people.length; i++) {
			String firstName = randomNameFrom(Person.FIRST_START, Person.FIRST_MIDDLE, Person.FIRST_END);
			String lastName = randomNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END);
			Borough home = randomBorough();
			
			//in object array you can have different data types
			//unlike primitive array
			if(Math.random() < .6) {
				int money = (int)(Math.random() *20+1)*100000;
				people[i] = new Athlete(firstName,lastName,home,money);
			}else {
				people[i] = new Person(firstName,lastName,home);
			}
		}
	}

	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random() * Borough.NY_BOROUGHS.length)];
	}

	private String randomNameFrom(String[] a, String[] b, String[] c) {
		return get(a)+get(b)+get(c);
	}

	private String get(String[] a) {
		return a[(int)(Math.random() * a.length)];
	}

	public static void main(String[] args) {
		ObjectMain obj = new ObjectMain();
	}

}
