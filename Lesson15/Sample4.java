


import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sample4 {
    public static void main(String[] args){
        Car4 car = new Car4("１号");
        car.start();
        
        for(int i = 0; i < 5; i++){
            try {
                sleep(1000);
                System.out.println("mainの処理をしています");
            } catch (InterruptedException ex) {}
        }
    }
}
class Car4 extends Thread{
    String name;
    Car4(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(name + "の処理をしています");
        }
    }
}
