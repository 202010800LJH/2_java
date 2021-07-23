import java.util.*;
public class Bj_9_5_4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int answer=0;
        while (true){
            n=sc.nextInt();
            if (n>=1&&n<=123456){
                for (int i=n+1; i<=2*n; i++){
                    boolean flag = true;
                    for (int j=2; j<i; j++){
                        if (i%j==0){
                            flag=false;
                            break;
                        }
                    }
                    if (flag==true)answer++;
                }
                System.out.println(answer);
            }
            else if (n==0) break;
        }
    }
}
