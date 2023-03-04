import java.util.Scanner;
public class Question1330_1 {
    /*기본적인 연속되지 않은 숫자 입력(2회)에 대한 비교문*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if(A>B)
            System.out.println(">");
        else if(A<B)
            System.out.println("<");
        else System.out.println("==");

    }

}