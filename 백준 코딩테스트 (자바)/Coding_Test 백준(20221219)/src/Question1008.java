import java.util.Scanner;

public class Question1008 /*A/B 구하기*/{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        /*결과값 담기*/
        double result = (A/B);
        System.out.print(result);
        in.close();
    }
}
