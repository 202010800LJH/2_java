import java.util.*;
public class Bj_3_2869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int V= sc.nextInt();
        int count=0;
        while (true){
            V-=A;
            if (V<=0){
                count++;
                break;
            }
            V+=B;
            count++;
        }
        System.out.println(count);
    }
}
