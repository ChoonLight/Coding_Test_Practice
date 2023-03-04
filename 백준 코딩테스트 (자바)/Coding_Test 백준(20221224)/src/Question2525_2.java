import java.util.Scanner;

public class Question2525_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A != B && A != C && B != C) {
            int max = 0;
            if (A > B && A > C) {
                max = A;
            }else if (B > C && B > A) {
                max = B;
            }else
                max = C;
            System.out.println(max*100);
        }else{
            if(A == B && A == C){
                System.out.println(10000+(A*1000));
            }else{
                 if(A == B || A == C){
                    System.out.println(10000+(A*1000));
                }else
                    System.out.println(10000+(B*1000));
            }
        }


    }
}