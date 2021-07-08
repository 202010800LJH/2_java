import java.util.*;
public class Bj1110 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fn, sn;
        int count=0;
        int nn=N;
        if (N>=0&&N<=99){
            int ne;
            do {
                sn = nn%10;
                nn/=10;
                fn=nn%10;
                ne = fn+sn;
                ne = ne%10;
                nn=(sn*10)+ne;
                count++;
            }while(N!=nn);
            System.out.println(count);
        }
    }
}
