import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Stack<String> animal=new Stack<>();
        
        animal.push("loin");
        animal.push("horse");
        animal.push("cat");
        animal.push("dog");
        animal.push("tiger");
        System.out.println("stack"+animal);
        System.out.println(animal.peek());
        System.out.println(animal.pop());
        System.out.println("stack"+animal);
    }
}
