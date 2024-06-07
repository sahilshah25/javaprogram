import java.util.*;
public class Main
{
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        
        adq.offer(23);
        adq.offer(33);
        adq.offer(43);
        adq.offer(53);
        System.out.println(adq);
        
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
        
        
        
        
        
    }
}
