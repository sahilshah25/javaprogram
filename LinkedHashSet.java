import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        set.add(32);
        set.add(42);
        set.add(52);
        set.add(62);
        set.add(72);
        set.add(32);
        System.out.println(set);
        set.remove(42);
         System.out.println(set);
         System.out.println(set.contains(52));
         System.out.println(set.size());
        
    }
}
