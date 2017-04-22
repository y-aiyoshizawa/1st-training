class En{
    public static void main(String[] args) {
        a(10000);
    }
    public static void random(int max){
        int c = 0;
        for(int i = 0; i < max; i++){
            double x = Math.random();
            double y = Math.random();
            if(x * x + y * y < 1){
                c++;
            }
        }
        System.out.println((double)c / max * 4);
    }
    public static void a(int max){
        int c = 0;
        for(int i = 0; i < max; i++){
            for(int j = 0; j < max; j++){
                double x = (double)i / max;
                double y = (double)j / max;
                if(x * x + y * y < 1){
                    c++;
                }
            }
        }
        System.out.println((double)c / (max * max) * 4);
    }

}
