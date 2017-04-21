


import java.util.logging.Level;
import java.util.logging.Logger;

public class Sample3 {
    public static void main(String[] args){
        Car3 car = new Car3("１号");
        car.start();
        
        for(int i = 0; i < 5; i++){
            System.out.println("mainの処理をしています");
        }
    }
}
class Car3 extends Thread{
    String name;
    Car3(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            try {
                sleep(1000);
                System.out.println(name + "の処理をしています");
            } catch (InterruptedException ex) {}
        }
    }
}
