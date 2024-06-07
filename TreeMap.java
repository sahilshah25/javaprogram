import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Map<String,Integer> numbers=new TreeMap<>();
        numbers.put("one",1);
        numbers.put("a",96);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.putIfAbsent("two",36);
        numbers.remove("two");
        System.out.println(numbers);
        for(Map.Entry<String,Integer> e:numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            
        }
        for(String key:numbers.keySet()){
            System.out.println(key);
        }
        System.out.println(numbers.containsValue(3));
        
        System.out.println(numbers.isEmpty());
        
    }
}
