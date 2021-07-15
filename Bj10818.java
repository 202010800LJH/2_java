import java.util.*;
public class Bj10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] num = new int[N];
        for (int i=0; i<N;i++){
            num[i]=sc.nextInt();
        }
        for (int i=0; i<N; i++){
            if (num[i]<=-1000000&&num[i]>=1000000){
                break;
            }
            a[i]=num[i];
        }

        int resultMax=a[0];
        for (int i=0; i<N-1; i++){
            if (resultMax<a[i+1]) {
                resultMax = a[i + 1];
            }
        }

        int resultMin=a[0];
        for (int i=0; i<N-1; i++){
            if (resultMin>a[i+1]){
                resultMin=a[i+1];
            }
        }
        System.out.println(resultMin +" "+ resultMax);
    }
}
