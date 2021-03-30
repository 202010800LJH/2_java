import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double humid;
        double temp;
        double dewPoint;
        System.out.println("습도를 입력하세요:");
        humid=sc.nextDouble();
        System.out.println("온도를 입력하세요:");
        temp=sc.nextDouble();
        dewPoint=((243.12*(Math.log(humid/100)+((17.62*temp)/(243.12+temp))))/(17.62-(Math.log(humid/100)+((17.62*temp)/(243.12+temp)))));
        dewPoint=(int)(dewPoint*10);
        dewPoint=(double)(dewPoint/10);
        System.out.printf("이슬점은 %.1f 입니다.\n", dewPoint);

    }
}
