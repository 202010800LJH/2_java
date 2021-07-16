import java.util.*;
public class Bj_10809_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] c = new char[100];
        String s = sc.next();
        char[] re = new char[26];
        int[] fre = new int[26];
        if (s.length()<100){
            for (int i =0; i<s.length(); i++){
                c[i]=s.charAt(i);
            }
            for (int a=0;a<re.length;a++){
                re[a]=(char)(97+a);
            }
            for (int y=0; y<26; y++){
                fre[y]=-1;
            }
            for (int j=0; j<s.length(); j++){
                for (int l=0; l<26; l++){
                    if (c[j]==re[l]&&fre[l]==-1){
                        fre[l]=j;
                    }
                }
            }
            for (int n=0; n<26; n++){
                System.out.printf("%d ", fre[n]);
            }
        }
    }
}
