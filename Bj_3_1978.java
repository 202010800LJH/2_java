import java.util.*;
public class Bj_3_1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a=new int[N];
        int count=0;
        int ai=0;
        for (int i=0; i<N;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0; i<N;i++){
            ai=a[i]%a[i];
            if (ai==0&&a[i]!=1){
                count++;
            }
        }
        System.out.println(count);
    }
}
