class Sample2{
    public static void main(String[] args) {
        Car2 car = new Car2();

        // car.num = 4444;
        // car.gas = -10.0;

        car.setNum(1234);
        car.setGas(10.0);
        car.show();
    }
}

class Car2{
    private int num;
    private double gas;

    public void setGas(double gas){
        if(0.0 < gas && gas < 100.0){
            this.gas = gas;
            System.out.println("ガソリンの量に" + this.gas + "Lをセット");
        }else{
            System.out.println("ガソリンの量が正しくありません");
        }
    }
    public void setNum(int num){
        if(num != 4444){
            this.num = num;
        }else{
            System.out.println("不吉な数字です");
        }
    }
    public void show(){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
    }
}
