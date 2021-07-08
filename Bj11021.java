import java.util.*;
public class Bj11021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] result = new int[c];
        for (int i=0; i<c; i++) {
            int A = sc.nextInt(), B = sc.nextInt();
            result[i]=A+B;
        }
        for (int i=0; i<c; i++){
            System.out.println("Case #"+i+1+":"+result[i]);
        }
    }
}
