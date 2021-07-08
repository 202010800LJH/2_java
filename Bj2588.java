import java.util.*;
public class Bj2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result, d;
        int resultf=num1*num2;
        while (num2 >0){
            d=num2%10;
            num2 /= 10;
            result = num1*d;
            System.out.println(result);
        }
        System.out.println(resultf);
    }
}
