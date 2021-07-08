import java.util.*;
public class Baekjoon10952 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b, i=0;;
        int[] result = new int[100];
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            result[i] = a+b;
            i++;
        } while (a!=0&&b!=0);
        int j=0;
        while (result[j]!=0){
            System.out.println(result[j]);
            j++;
        }
    }
}
