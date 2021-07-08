import java.util.*;
public class Bj2741 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N<=100000){
            for (int i=1; i<=N; i++){System.out.println(i);}
        }
        else {System.out.println("N이 100,000보다 크다");}
    }
}
