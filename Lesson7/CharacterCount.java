class CharacterCount{
    public static void main(String[] args) throws IOException{
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        Scanner scan= new Scanner(System.in);

        while(scan.hasNext()){
            String str = scan.next();
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(map.containsKey(c)){
                    map.put(c,map.get(c) + 1);
                }else{
                    map.put(c,1);
                }
            }
        }
        for(char key: map.keySet()){
            System.out.println(key + "=" + map.get(key));
        }
    }
}
