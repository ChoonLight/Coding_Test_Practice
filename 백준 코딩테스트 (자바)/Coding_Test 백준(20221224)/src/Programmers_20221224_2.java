import java.io.IOException;
import java.util.Scanner;

class Solution1 {
    /*contains로 풀수있는 간단한 문제이다.*/
    public int solution1(String str1, String str2) {
    /*만약 str1 안에 str2문장이 포함되어 있다면 1을 리턴, 그렇지 않으면 0을 리턴.*/
    if (str1.contains(str2)){
        return 1;
    }else
        return 2;
    /*참고로 if문을 쓰지 않고 return 구문에 아예 삼항연산자의 결과값을 리턴하는 구문도 있음.
    return (str1.contains(str2)? 1: 2);*/
    }
}

public class Programmers_20221224_2 {
    public static void main(String[] arges)throws IOException{

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        Solution1 cal = new Solution1();
        int result = cal.solution1(str1, str2);
        System.out.println(result);
    }
}
