import java.util.*;
public class Main
{
    public static void main(String[] args) {
        //filter data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> evenNumbers = numbers.stream()
                                  .filter(n -> n % 2 == 0)
                                  .collect(Collector.toList());
                                  
                                  
    //Mapping
    List<String> names=Arrays.toList("sahil","ahmad","shah","azaan","nabi");
    List<Integer> namelength=names.stream().map(String::length).collect(Collectors.toList());
    //reducing
    int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
    
    
    //sorting
    List<String> sortedNames = names.stream()
                               .sorted()
                               .collect(Collectors.toList());
                               
    //grouping
    Map<Integer, List<Person>> groupedByAge = people.stream()
                                                .collect(Collectors.groupingBy(Person::getAge));
                                                
   
   
   //flatmap
   List<Person> people = Arrays.asList(new Person("sahil", 25),
                                    new Person("ahmad", 30),
                                    new Person("shah", 35),
                                    new Person("azan", 40));
    Map<Integer, List<Person>> groupedByAge = people.stream()
                                                .collect(Collectors.groupingBy(Person::getAge));

                    
    
    
    }
}
