class Sample3{
    public static void main(String[] args) {
        Car3 car = new Car3();
        car.show(1);
    }
}

class Car3{
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
    public void show(byte num){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
    }
    public void show(short num){
        System.out.println("仮車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
    }
}
