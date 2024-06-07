import java.util.*;
public class Main
{
    public static void main(String[] args) {
        ArrayList<String> student=new ArrayList<>();
        ArrayList<String> student2=new ArrayList<>();
        student2.add("azaan");
        student2.add("nabi");
        student.add("sahil");
        student.add("s");
        student.add("sa");
        student.add("sah");
        student.add("sahi");
        
        student.add(1,"ahmad");
        student.addAll(student2);
        student.set(2,"nadeem");
        student.contains("sahil");
        
        
        System.out.println(student);
        student.remove(1);
        System.out.println(student);
        System.out.println(student.remove(String.valueOf("nabi")));
        System.out.println(student);
       // for(String re:student){
        //    System.out.println(student);
       // }
       for(int i=0;i<student.size();i++){
           System.out.println("the element.  "+student.get(i));
       }
       for(String el:student){
           System.out.println("for element. "+el);
           
       }
       Iterator<String> it=student.iterator();
       while(it.hasNext()){
           System.out.println("iterator "+it.next());
       }
    }
}