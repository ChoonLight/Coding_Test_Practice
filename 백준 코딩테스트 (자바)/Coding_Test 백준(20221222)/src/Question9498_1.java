
import java.io.IOException;
import java.util.Scanner;

public class Question9498_1 {
    /*지문에서는 연속된 숫자 입력과 그 숫자 사이에 공백이 하나 포함되어 있기에 split 함수를 사용하기로 함*/
    public static void main(String[] arges) throws IOException {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();
        if(score >= 0 && score <= 100){
            if(score >= 90 && score <= 100) System.out.println("A");
            else if (score >= 80 && score <= 89) System.out.println("B");
            else if (score >= 70 && score <= 79) System.out.println("C");
            else if (score >= 60 && score <= 69) System.out.println("D");
            else if(score >= 0 && score <= 59)
                System.out.println("F");
        }else{
            System.out.println("올바른 값을 입력하세요.");
        }
    }
}