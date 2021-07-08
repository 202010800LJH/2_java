import java.util.*;
public class Bj2739 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        int result;
        for (int i=1; i<10; i++){
            result = mul*i;
            System.out.printf("%d * %d = %d\n", mul, i, result);
        }
    }
}
