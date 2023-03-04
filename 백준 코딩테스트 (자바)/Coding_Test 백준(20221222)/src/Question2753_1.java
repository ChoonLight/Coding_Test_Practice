
import java.io.IOException;
import java.util.Scanner;

public class Question2753_1 {
    /*여기서는 이중 if문을 사용했다.*/
    public static void main(String[] arges) throws IOException {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        /*첫번째 if문의 조건, 사용자가 입력한 연도를 4로 나눠서 그것이 0이고, 그 자연수가 1이상, 4000이하인 경우이다.*/
        if(year%4==0 && (year >= 1 && year <= 4000)) {
            /*첫번째 if문 조건을 충족시 다음 if문의 첫번째 조건,
            이번엔 그 연도값을 400으로 나눠서 0이거나 100으로 나눠서 0이 되지 않는 경우 1을 출력한다. */
            if(year%400==0 || year%100!=0) System.out.println("1");
            /*위의 두번째 if문이 충족하지 않을시, 즉 400의 배수가 아니거나 100의 배수인 경우(제시하는 조건 외)
            0을 출력함*/
            else System.out.println("0");
        /*다시 돌아와 첫번째 if문에 반하는 경우, 즉 사용자 입력값이 4의 배수더라도 1이상 4000이하의 범위에 들어있지 않거라
        그 반대의 경우일시 0을 출력하도록 함. */
        }else System.out.println("0");

    }
}
