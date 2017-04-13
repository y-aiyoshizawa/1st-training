class Sample5{
    public static void main(String[] args) {
        int[] test1 = {1,2,3};
        System.out.println("test1に配列要素を確保");

        int[] test2 = test1;
        System.out.println("test2=test1を実行");

        for(int i = 0; i < 3; i++){
            System.out.println("test1[" + i + "]=" + test1[i]);
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.println("test2[" + i + "]=" + test2[i]);
        }
    }
}
