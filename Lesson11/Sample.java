class Sample{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("aaa");
        String s = String.valueOf(sb);

        System.out.println(s);
    }
    public static void show(String s){
        System.out.println(s);
    }
}
