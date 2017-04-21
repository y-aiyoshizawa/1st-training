class Sample4{
    public static void main(String[] args) {
        try{
            System.out.println("int型のtest[5]の配列を作る");
            int test[] = new int[5];
            System.out.println("test[10]に10を代入");
            test[10] = 10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("配列の要素を超えています");
            System.out.println("例外の種類:"+e);
        }
        System.out.println("終了します");
    }
}
