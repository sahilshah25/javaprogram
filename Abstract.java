
public abstract class Parent
{
    abstract void carrier(String name);
    abstract void partner(String name,int age);
    
   
}
public class Son extends Parent{
    @Override
    public void carrier(String name){
        System.out.println("i want to become a "+name);
    }
    @Override
    public void partner(String name,int age){
        System.out.println("i love "+name+" her age is "+age);
      
    }
      public static void main(String[] args){
            Son sahil=new Son();
            sahil.carrier("doctor");
            sahil.partner("ssss",21);
        }
}
