


public class Sample1 {
    public static void main(String[] args){
        Car1 car = new Car1("１号");
        car.start();
        for(int i = 0; i < 100; i++){
            System.out.println("mainの処理をしています");
        }
    }
}
class Car1 extends Thread{
    String name;
    Car1(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(name + "の処理をしています");
        }
    }
}
