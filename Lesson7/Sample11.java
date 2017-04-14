class Sample11{
    public static void main(String[] args) {
        int[][] test = {
            {80,60,22},
            {90,55,68,72,58},
            {54,33}
        };

        for(int i = 0; i < test.length; i++){
            System.out.println("test["+i+"]の要素数:"+test[i].length);
            for(int j = 0; j < test[i].length; j++){
                System.out.println("test["+i+"]["+j+"]=" + test[i][j]);
            }
            System.out.println();
        }
    }
}
