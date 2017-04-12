import java.util.*;

class Sample{
    public static void main(String[] args) {
        int min = 2;
        int max = 2017;
        int c = 0;

        for(int i = min; i <= max; i++){
            if(!(i % 2 == 0 || i % 3 == 0 || i % 5 == 0)){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("個数:" +  c);

        int ans = (max-min + 1) - ((max/2 + max/3 + max/5) - (max/6 + max/10 + max/15) + max/30);
        System.out.println(ans);
    }
}
