import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(100);
        set.add(42);
        set.add(10101);
        set.add(62);
        set.add(121);
        set.add(85);
        System.out.println(set);
        set.remove(42);
         System.out.println(set);
         System.out.println(set.contains(52));
         System.out.println(set.size());
        
    
    }
}
