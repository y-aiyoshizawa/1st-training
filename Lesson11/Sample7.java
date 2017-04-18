class Sample7{
    public static void main(String[] args) {
        Car7 car = new Car7(1234,12.3);
        System.out.println(car);
        System.out.printf("%s",car);
        
    }
}
class Car7{
    protected int num;
    protected double gas;

    public Car7(){
        System.out.println("車を作成しました");
        num = 0;
        gas = 0.0;
    }
    public Car7(int num,double gas){
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
    public String toString(){
        String str = "";
        str += "車のナンバー:" + num + "\n";
        str += "ガソリンの量:" + gas + "L";
        return str;
    }
}
