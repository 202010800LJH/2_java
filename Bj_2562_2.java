import java.util.*;
public class Bj_2562_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] max = new int[9];
        for (int i=0; i<9; i++){
            int num = sc.nextInt();
            max[i]=num;
        }
        int reMax=max[0];
        int count=0;
        for (int i=0; i<8; i++){
            if (reMax<max[i+1]) {
                reMax = max[i + 1];
            }
            count++;
        }
        System.out.println(reMax);
        System.out.println(count);
    }
}
