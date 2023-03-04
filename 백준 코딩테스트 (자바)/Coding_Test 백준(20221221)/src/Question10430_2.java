import java.util.Scanner;

public class Question10430_2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        /*예제는 유저가 총 세번을 입력해야 하기때문에 변수 int형 변수 a,b,c를 생성 후 printf를 이용해 각각의 계산식을 차례대로 대입한다.*/

        System.out.printf("%d\n%d\n%d\n%d", (a + b) % c, ((a % c) + (b % c)) % c, (a * b) % c, ((a % c) * (b % c)) % c);
    }
}