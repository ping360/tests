package core.less1;

public class Main {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Hello";
		String s2 = new String("hello");
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.charAt(0));
		System.out.println(s.chars().sum());
		s.chars().forEach(Main::print);
		System.out.println(s.codePointAt(0));
		System.out.println(s.compareTo(s1));
		System.out.println(s.concat(s)); 	//Don`t use it! Use +
		System.out.println(s.contains("ll"));
		System.out.println(s.endsWith(".jpg"));
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("l", s.indexOf("l")+1));
		System.out.println("  ".trim().isEmpty()); 	//trim take off spaces
		System.out.println(s.lastIndexOf(s));
		System.out.println(s.matches("^[A-Za-z|0-9]+$"));
		System.out.println("A regular expression, regex or regexp (sometimes called a rational expression) is, "
				+ "in theoretical computer science and formal language theory, a sequence of characters that define a search pattern. "
				+ "Usually this pattern is then used by string searching algorithms for find or find and replace operations on strings.".replaceAll("\\w+", "1234")); // \\w+ all words
		
		String [] array = "A regular expression, regex or regexp (sometimes called a rational expression) is,in theoretical computer science and formal language theory, a sequence of characters that define a search pattern.Usually this pattern is then used by string searching algorithms for find or find and replace operations on strings.".split("[\\ \\. \\' \\, \\:]+");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]); //every word is new String
		}
		
		System.out.println(s.startsWith("el", 1));
		
		System.out.println(delete("Hello I am hero", "e"));
		int u = 0;
	
	}
	

	static String delete (String str, String deleted) {
		 while (str.contains(deleted)) {
			int index = str.indexOf(deleted);
			String first = str.substring(0, index);
			String second = str.substring(index+1); // +deleted.length() more then 1 
			str = first + second;
			
		}
		return str;
	}
	
	static void print(int a){
		System.out.println((char)a+" "+a);
	}

}
