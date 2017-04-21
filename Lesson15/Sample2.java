


public class Sample2 {
    public static void main(String[] args){
        Car2 car1 = new Car2("１号");
        Car2 car2 = new Car2("２号");
        car1.start();
        car2.start();
        for(int i = 0; i < 500; i++){
            System.out.println("mainの処理をしています");
        }
    }
}
class Car2 extends Thread{
    String name;
    Car2(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(name + "の処理をしています");
        }
    }
}
