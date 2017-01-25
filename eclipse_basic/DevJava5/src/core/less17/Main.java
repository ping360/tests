package core.less17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;

import core.less14.Person;

public class Main {
	
	static Person p = new Person("Ivan", 18);

	public static void main(String[] args) {

		print((int i) -> true);
		print((i) -> i % 2 == 0);
		print(i -> i % 3 == 0);
		print(Main::test);
		printSomeFromPerson(Person::getName);
		List<Person> list = new ArrayList<>();
		
		int sum = list.stream()
		 .map(Person::getPets)
		 .filter(l -> l.size()>=3)
		 .flatMap(List::stream)
		 .map(Person.Pet::getName)
		 .unordered()               //ignore sort list, threat go faster 
		 .distinct()                //kill dublicates
		 .filter(s -> s.length()>=10)
		 .flatMapToInt(String::chars)
		 .reduce(0, (acc, elem) -> acc+elem);
//		.reduce(0, Integer::sum);   or this like
//sum == sum2		
		int sum2 = 0;
		for(Person person : list){
			if(person.getPets().size()>=3){
				for(Person.Pet pet : person.getPets()){
					if(pet.getName().length()>=10){
						for(char ch : pet.getName().toCharArray()){
							sum2+=ch;
						}
					}
				}
			}
		}
	}

	static boolean test(int i){
		//some code
		return i % 4 == 0;
	}
	
	static void print(IntPredicate filter) {
		for (int i = 1; i <= 10; i++) {
			if (filter.test(i))
				System.out.println(i);
		}
		System.out.println();
	}

	static <R> void printSomeFromPerson(Function<Person, R> function){
		System.out.println(function.apply(p));
	}
}
