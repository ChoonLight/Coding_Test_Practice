import java.util.Scanner;

public class Question18108_Java_1 {
    public static void main(String[] args) {
            /*가장 일반적인 방법 - 1998년과 2541년 만큼의 차이(543)을 이용해 입력 연도에서 543을 더해주면 됨*/
            System.out.print("연도를 입력하세요.");
            Scanner in = new Scanner(System.in);

            int year = in.nextInt();

            System.out.println("불기 연도는" + (year + 543) + "입니다."); /*println*/
            System.out.printf("불기 연도는 %d년입니다.%n", year + 543 ); /*printf*/
    }
}