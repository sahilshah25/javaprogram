public class Main implements  Engine,Break{

@Override
    public void start(){
    System.out.println("i start like a normal car");
}
@Override
    public void stop(){
    System.out.println("i stop like  NORMAL CAR");
}

@Override
    public void Accelerate(){
       System.out.println("i accelerate like a normal car");
}
public static void main(String[] arg){
    Main car=new Main();
    car.start();
    car.stop();
    car.Accelerate();
    car.Brake();
}

    @Override
    public void Brake() {
    System.out.println("break like a normal car");

    }
}

