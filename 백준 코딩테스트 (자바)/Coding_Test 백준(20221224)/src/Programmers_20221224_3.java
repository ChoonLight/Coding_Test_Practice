import java.io.IOException;
import java.util.Scanner;

class Solution2 {
    /*약간은 복잡하지만 입력 받은 정수 타입을 String으로 형변환 후 다시 String형 배열에 담아
    그 배열 만큼의 길이를 가진 int형 배열과 누적 합계를 위한 total을 생성,String형 배열 길이 만큼 for문을 돌리고
    int 배열에 String 배열의 값들을 하나씩  Integer.parseInt로 변환 후 그 값을 고대로 total에 누적 합계 시키고
    for문이 끝난 total을 return 시켜주면 끝.
    */
    public int solution2 (int n) {
    String str = String.valueOf(n);
    String[] Array = str.split("");
    int[] subArray = new int[Array.length];
    int total = 0;
    for (int i = 0 ; i < Array.length ; i++) {
        total += subArray[i] = Integer.parseInt(Array[i]);
    }
        return total;
    }
    /*return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();*/
    /*
     while(n>0){
            answer+=n%10;
            n/=10;
        }

        return answer;
    */

}

/* 이하 출력문
public class Programmers_20221224_3 {
    public static void main(String[] arges)throws IOException{

        Scanner sc = new Scanner(System.in);
        int Input = sc.nextInt();

        Solution2 cal = new Solution2();
        int result = cal.solution2(Input);
        System.out.println(result);
    }
}
*/

