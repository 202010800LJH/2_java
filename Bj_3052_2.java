import java.util.*;
public class Bj_3052_2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] num=new int[10];
        for (int i=0; i<10;i++){
            int n = sc.nextInt();
            num[i]=n;
        }
        for (int i=0; i<10;i++){
            num[i]%=42;
        }
        int count=10;
        for (int i=0; i<10;i++){
            for (int j=0; j<10; j++){
                if (num[i]==num[j]&&i!=j){
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}
