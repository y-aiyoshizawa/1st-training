


import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sample5 {
    public static void main(String[] args){
        Car5 car = new Car5("１号");
        car.start();
        try {
            car.join();
        } catch (InterruptedException ex) {}
        System.out.println("mainの処理を終了します");
    }
}
class Car5 extends Thread{
    String name;
    Car5(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(name + "の処理をしています");
        }
    }
}
