import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {
	
	public static void p(String msg, int num) {
		System.out.println("Message number "+num+ " is:- "+msg);
	}
	public static void main(String[] args) {
		//hashMapTest();
		compareByTwoFields();
	}
	
	public static void compareByTwoFields() {
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp("v", "c"));
		empList.add(new Emp("b", "c"));
		empList.add(new Emp("c", "c"));
		
		empList.stream().forEach(System.out::println);
		
		
		// Functions for getting first and last names from an Employee
		//Function<Emp, String> byFname = Emp::getFname;
		//Function<Emp, String> byLname = Emp::getLname;

		// Comparator for comparing Employees by first name then last name
		Comparator<Emp> lastThenFirst = Comparator.comparing(Emp::getFname).thenComparing(Emp::getLname);
		
		//empList.stream().sorted(lastThenFirst).forEach(System.out::println);
		
		//Collections.sort(empList, (o1,o2) ->  o1.getFname().compareTo(o2.getLname()));
		Collections.sort(empList, Comparator.comparing(Emp::getFname).thenComparing(Emp::getLname));
    
		empList.forEach( System.out::println);
		//p(empList.toString(),1);
	}

    public static void hashMapTest() {
		Map<Dog, Integer> a = new HashMap<>();
		
		a.put(new Dog(1, "a"), 2);
		a.put(new Dog(1, "a"), 3);
		a.put(new Dog(1, "b"), 3);
		
		//fun(a, b);
		//String mapAsString = a.keySet().stream().map(key -> key + "=" + a.get(key)).collect(Collectors.joining(", ", "{", "}"));
		System.out.print("\n===========>> "+new Dog(1, "a").equals(new Dog(1, "a")));
		
		System.out.print("\n===========>> "+new Dog(1, "a").hashCode());
		System.out.print("\n===========>> "+new Dog(1, "a").hashCode());
		System.out.print("\n===========>> "+new Dog(1, "b").hashCode());
		
		System.out.print("\n===========>> "+a.toString());
		
		System.out.print("\n===========>> "+a.get(new Dog(1, "b")));
    }
}

class Dog {
		private int id;
		private String name;
		private int hashCode;

		
		public Dog(int id, String name) {
			this.id = id;
			this.name = name;
			this.hashCode = Objects.hash(id, name);
		} 
		
		public String getName() {
			return this.name;
		}
		public int getId() {
			return this.id;
		}
		
		public String toString() {
			return "\n\n\n{ id: " + this.id + " name: " + this.name + " }\n";
		}
		
		@Override
		public boolean equals(Object obj) {
			Dog d = (Dog) obj;
			//if (this == obj) return true;
			if (this.id == d.getId() && this.name == d.getName()) return true;
			return false;
		}
		
		@Override
		public int hashCode() {
			return this.hashCode;
		}
	}
	
class Emp {
	private String fname;
	private String lname;
	public Emp(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	} 
		
		public String getFname() {
			return this.fname;
		}
		public String getLname() {
			return this.lname;
		}
		
		public String toString() {
			return "\n{ " + this.fname + ", " + this.lname + " }";
		}
}