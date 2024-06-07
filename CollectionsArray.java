import java.util.*;
public class Main
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int index=Arrays.binarySearch(a,7);
        System.out.print(index);
        
        Arrays.sort(a);
        Arrays.fill(a,0);
        for(int i:a){
            System.out.println(i);
        }
        
        
        
        
        
        
        
    }
}
