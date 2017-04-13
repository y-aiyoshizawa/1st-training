class Sample6{
    public static void main(String[] args) {
        int[] test1 = {1,2,3};
        System.out.println("test1に配列要素を確保し1,2,3で初期化する");

        int[] test2 = test1;
        System.out.println("test2=test1;を実行");

        System.out.println("配列の中身を表示");
        for(int i = 0; i < 3; i++){
            System.out.println("test1[" + i + "]=" + test1[i]);
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.println("test2[" + i + "]=" + test2[i]);
        }
        System.out.println();

        test1[0] = 100;
        System.out.println("test1[0] = 100;を実行");
        System.out.println();

        System.out.println("配列の中身を表示");
        for(int i = 0; i < 3; i++){
            System.out.println("test1[" + i + "]=" + test1[i]);
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.println("test2[" + i + "]=" + test2[i]);
        }


    }
}
