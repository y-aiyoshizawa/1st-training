class Sample8{
    public static void main(String[] args) {
        Car8 car1 = new Car8(1234,12.3);
        Car8 car2 = new Car8(1234,12.3);
        Car8 car3 = car1;

        boolean bo1 = car1.equals(car2);
        boolean bo2 = car1.equals(car3);

        System.out.println("car1.equals(car2)の結果:" + bo1);
        System.out.println("car1.equals(car3)の結果:" + bo2);
        System.out.println();

        String str1 = "abc";
        String str2 = "abc";
        String str3 = str1;

        bo1 = str1.equals(str2);
        bo2 = str1.equals(str3);

        System.out.println("str1.equals(str2)の結果:" + bo1);
        System.out.println("str1.equals(str3)の結果:" + bo2);


    }
}
class Car8{
    protected int num;
    protected double gas;

    public Car8(){
        System.out.println("車を作成しました");
        num = 0;
        gas = 0.0;
    }
    public Car8(int num,double gas){
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
