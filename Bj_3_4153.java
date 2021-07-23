import java.util.*;
public class Bj_3_4153 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] R = new int[3];
        do {
            for (int i=0; i<3;i++) R[i]=sc.nextInt();
            if (R[2]*R[2]==R[0]*R[0]+R[1]*R[1]) System.out.println("right");
            else System.out.println("wrong");
        } while (R[1]!=0);
    }
}
