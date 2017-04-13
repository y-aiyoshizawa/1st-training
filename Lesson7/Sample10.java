class Sample10{
    public static void main(String[] args) {
        int[][] test = {
            {80,60,22,50,75},
            {90,55,68,72,58}
        };

        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test[i].length; j++){
                System.out.println("test["+i+"]["+j+"]=" + test[i][j]);
            }
            System.out.println();
        }
    }
}
