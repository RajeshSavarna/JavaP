package handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

//public class Person {
//    private String firstName;
//    private String lastName;
//    
//    public Person (String fn, String ln) {
//        this.firstName = fn;
//        this.lastName = ln;
//    }
//    
//    public void setFirstName (String fn) {
//        this.firstName = fn;
//    }
//    
//    public String getFirstName() {
//        return this.firstName;
//    }
//    
//    public void setLastName (String ln) {
//        this.lastName = ln;
//    }
//    
//    public String getLastName() {
//        return this.lastName;
//    }
//    
//    public int hashCode () {
//        return 13;
//    }
//    
//    public String toString() {
//        return "First Name : " + this.firstName + ", Last Name : " + this.lastName;
//    }
//    
//    public static void main(String... args) {
//        Person p1 = new Person("firstName1", "lastName1");
//        Person p2 = new Person("firstName2", "lastName2");
//        Map<Person, String> map = new HashMap<>();
//        
//        map.put(p1, "This is First person Object");
//        map.put(p2, "This is Second person Object");
//        map.put(new Person("firstName1", "lastName1"), "Overriding First person Object");
//        
//        System.out.println(map.size());
//        System.out.println(map.get(new Person("firstName1", "lastName1")));
//    }
//}

//public class Person {
//    private String firstName;
//    private String lastName;
//    
//    public Person (String fn, String ln) {
//        this.firstName = fn;
//        this.lastName = ln;
//    }
//    
//    public void setFirstName (String fn) {
//        this.firstName = fn;
//    }
//    
//    public String getFirstName() {
//        return this.firstName;
//    }
//    
//    public void setLastName (String ln) {
//        this.lastName = ln;
//    }
//    
//    public String getLastName() {
//        return this.lastName;
//    }
//    
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person)) return false;
//        Person person = (Person) o;
//        return Objects.equals(firstName, person.firstName) &&
//                Objects.equals(lastName, person.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
//    
//    public String toString() {
//        return "First Name : " + this.firstName + ", Last Name : " + this.lastName;
//    }
//    
//    public static void main(String... args) {
//        Person p1 = new Person("firstName1", "lastName1");
//        Person p2 = new Person("firstName2", "lastName2");
//        
//        Set<Person> treeSet = new TreeSet<>();
//        treeSet.add(p2);
//        treeSet.add(null);
//        treeSet.add(p1);
//        
//        for (Person p : treeSet) {
//            System.out.println(p);
//        }
//    }
//}

//class MyAdd<T> {
//    
//    void add(T t) {
//        // some implementation
//    }
//}
//
//public class Person {
//	public static void main(String... args) {
//
//		MyAdd<Number> myadd = new MyAdd<>();
//		myadd.add(new Integer(1));
//		myadd.add(new Double(1.0));
//	}

//class Person extends Thread{    
//    public void run(){  
//        System.out.println("Running thread is daemon...");  
//    }  
//    public static void main (String[] args) {  
//    	Person td= new Person();  
//        td.setDaemon(false);
//        td.start();  
//        td.setDaemon(true);
//    }  
//}

 
//public class Person {
//    public static void main(String[] args) {
//        Integer[] arr = new Integer[] { 10, 3, 10, 2, 20};
//        List<Integer> list = Arrays.asList(arr);
//        OptionalDouble avg = list.stream().mapToInt(n -> n * n).filter(n -> n >= 10).average();
//         
//        if (avg.isPresent())
//            System.out.println(avg.getAsDouble());
//    }
//}


//public class Person {
//	public static void main(String... args) {
//		ExecutorService service =
//				Executors.newFixedThreadPool(2);
//		Future result = service.submit(() -> 1);
//	}
//}


public class Person 
{ 
    static Person t ; 
    static int count =0; 
      
    public static void main(String[] args) throws InterruptedException 
    { 
    	Person t1 = new Person(); 
        t1 = null;
        System.gc(); 
        Thread.sleep(1000);  
        t = null;
        System.gc();
        Thread.sleep(1000);  
        System.out.println("finalize method called "+count+" times"); 
    } 
      
    @Override
    protected void finalize()  
    {  
        count++; 
        t = this; 
    } 
} 