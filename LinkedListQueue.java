import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(12);
        queue.offer(22);
        queue.offer(33);
        queue.offer(44);
        queue.offer(55);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        
    }
}
