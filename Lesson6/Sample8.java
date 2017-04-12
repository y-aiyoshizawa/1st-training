class Sample8{
    public static void main(String[] args) {
        boolean boo = true;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(boo){
                    System.out.print("*");
                    boo = false;
                }else{
                    System.out.print("-");
                    boo = true;
                }
            }
            System.out.println();
        }
    }
}
