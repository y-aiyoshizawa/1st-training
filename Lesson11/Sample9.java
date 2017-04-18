class Sample9{
    public static void main(String[] args) {
        Car9[] cars = new Car9[2];
        cars[0] = new Car9(2468,24.6);
        cars[1] = new RacingCar9(1357,13.5,10);

        for(int i = 0; i < cars.length; i++){
            System.out.println();
            System.out.println("cars["+i+"]の情報");
            Class c = cars[i].getClass();
            System.out.println(c);
        }
    }
}
class Car9{
    protected int num;
    protected double gas;

    public Car9(){
        System.out.println("車を作成しました");
        num = 0;
        gas = 0.0;
    }
    public Car9(int num,double gas){
        this();
        setNum(num);
        setGas(gas);
    }
    public void setNum(int num){
        if(num != 4444){
            this.num = num;
            System.out.println("車のナンバーに" + this.num + "をセット");
        }else{
            System.out.println("不吉な数字です");
        }
    }
    public void setGas(double gas){
        if(0.0 < gas && gas < 100.0){
            this.gas = gas;
            System.out.println("ガソリンの量に" + this.gas + "Lをセット");
        }else{
            System.out.println("ガソリンの量が正しくありません");
        }
    }
    public void show(){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
    }
}
class RacingCar9 extends Car9{
    private int course;
    public RacingCar9(){
        System.out.println("レーシングカーを作成しました");
        course = 0;
    }
    public RacingCar9(int num, double gas,int course){
        super(num,gas);
        System.out.println("レーシングカーを作成しました");
        setCourse(course);
    }
    public void setCourse(int course){
        this.course = course;
        System.out.println("コース番号に"+this.course+"をセット");
    }
    public void show(){
        System.out.println("レーシングカーのナンバー:" + num);
        System.out.println("カーのガソリンの量:" + gas + "L");
        System.out.println("コース番号:"+course);
    }
}
