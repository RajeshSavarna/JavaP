package handson;
/**

NL - Distinct Characters Count (Java Stream)
In this challenge, use the Java Stream, Predicate, and Function to find the number of distinct characters in the given names which start with a given prefix. The complete implementation of CharactersCount class is given. It has the following two fields:

name describes the name string.
distinctCharacterCount describes the number of distinct characters.
Create the following two classes:

Filter class with methodPredicate<String> nameStartingWithPrefix(String prefix) that returns a predicate to check whether a name string starts with the given prefix or not.
Mapper class with methodFunction<String, CharactersCount> getDistinctCharactersCount() that returns a mapper function to return a CharactersCount class object that correspond to the given name string.
The locked stub code in the editor validates the correctness of the Filter and Mapper classes implementation.

 

Constraints

There exists at least one name for the given prefix.
Input Format For Custom Testing
Sample Case 0
Sample Input For Custom Testing

aa
Sample Output

"aaryanna" has 4 distinct characters.
"aayanna" has 3 distinct characters.
Explanation

For the given names ["aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna", "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle"], "aaryanna" and "aayanna" starts with the prefix "aa".

"aaryanna" has four distinct characters: 'a', 'n', 'r', and 'y'.
"aayanna" has four distinct characters: 'a', 'n', and 'y'.
*/


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Function;

/*
 * Create the Filter and Mapper classes here.
 */
 
 class Filter {
    public static Predicate<String> nameStartingWithPrefix(String prefix) {
        return n -> n.startsWith(prefix);
    }
}
class Mapper {
    public static Function<String, CharactersCount> getDistinctCharactersCount() {
        return s -> new CharactersCount(s, (int)s.chars().distinct().count());
    }
}

class CharactersCount {
    private final String name;
    private final Integer distinctCharacterCount;
    
    public CharactersCount(String name, Integer distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }
    
    @Override
    public String toString() {
        return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
    }
}

public class DistinctCharactersSolution {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );
        
        names.stream()
                .filter(Filter.nameStartingWithPrefix(scanner.nextLine()))
                .map(Mapper.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }
}