import java.io.IOException;
import java.util.Scanner;
public class Question10430_1 {
    /*앞의 예제와 달리 조건문이 붙으므로 2이상, 10000이하인 숫자를 써주고 그 범위 외는 throw IOException으로 던져주고*/
    /*각각의 조건문이 완성되면 입출력을 하는 방식.*/
    public static void main(String[] args) throws IOException
    {
        int A = 0;
        int B = 0;
        int C = 0;
        Scanner in = new Scanner(System.in);
        if (A >= 2 || A <= 10000)
            A = in.nextInt();
        in = new Scanner(System.in);
        if (B >= 2 || B <= 10000)
            B = in.nextInt();
        in = new Scanner(System.in);
        if (C >= 2 || C <= 10000)
            C = in.nextInt();
        /*
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
        */
        System.out.printf("%d\n%d\n%d\n%d", (A + B) % C, ((A % C) + (B % C)) % C, (A * B) % C, ((A % C) * (B % C)) % C);
    }

}
