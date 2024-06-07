import java.util.*;
public class Main
{
    public static void main(String[] args) {
        ArrayList<Integer> cll=new ArrayList<>();
        cll.add(34);
        cll.add(45);
        cll.add(22);
        cll.add(11);
        cll.add(11);
        cll.add(22);
        cll.add(34);
        cll.add(56);
        System.out.println(Collections.min(cll));
        System.out.println(Collections.max(cll));
        System.out.println(Collections.frequency(cll,11));
        
        Collections.sort(cll);
        System.out.println(cll);
        Collections.sort(cll,Comparator.reverseOrder());
        System.out.println(cll);
        
    }
}
