

public class Main
{
    enum week{
    monday,tuesday,wednesday,thursday,friday,saturday,sunday;
    week(){
        System.out.println("constructor call for "+this);
    }
}

public static void main(String[] args){
    week wek;
    week wk=week.monday;
   // wek=week.sunday;
  //  System.out.println(wek);
   // for(week day:week.values()){
       // System.out.println(day);

    //}
   // System.out.println(week.friday.ordinal());

}

}
