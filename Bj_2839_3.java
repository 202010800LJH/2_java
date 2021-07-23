import java.util.*;
public class Bj_2839_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result=0;
        result+=N/5;
        N%=5;
        result+=N/3;
        N%=3;
        if (N<3&&N>0){
            System.out.println(-1);
        }
        else {
            System.out.println(result);
        }
    }
}
