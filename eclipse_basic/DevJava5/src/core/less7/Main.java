package core.less7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ivan");
		list.add("Petro");
		list.add(1, "Mykola");
		System.out.println(list);
		System.out.println(list.contains("Ivan"));
		System.out.println(list.containsAll(list));
//or	list.forEach((String elem)->System.out.println(elem));
		list.forEach(System.out::println);
	System.out.println();
		for (String string : list) {
			System.out.println(string);
		}
	System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	System.out.println();
		list.lastIndexOf(list);
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.set(0, "Ivan"));
		System.out.println(list);
		list.add("Mykola");
		System.out.println(list);
		LinkedList<String> list3 = new LinkedList<>();
		
	}

}
