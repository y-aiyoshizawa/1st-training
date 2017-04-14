class Sample1{
    public static void main(String[] args) {
        int[] test;
        test = new int[5];

        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;
        System.out.println(test);
        for(int i = 0; i < 5; i++){
            System.out.println(i + "番目の要素:" + test[i]);
        }
    }
}
