import java.io.IOException;
import java.util.Scanner;

class Solution {
    public int solution(int n) {
        /*일단 sqrt 함수를 활용해 사용자가 입력한 값의 제곱근을 구해 y에 담음(144라면 12가 담김)*/
        int y = (int)Math.sqrt(n);
        /*만약 y(12)의 제곱근(144)이 n(사용자 입력값, 144)과 같다면 1을 리턴*/
        /*참고로 Math.pow(y,2)는 (y*y)로도 대체 가능함.*/
        /*또 아예 위의 int y 선언을 하지 않고
        (n % Math.sqrt(n) == 0)를 통해 구현도 가능하다고함.*/
        /*윗쪽 코드를 풀어쓰자면 (사용자 입력값)을 입력값의 제곱수로 나눠서 0이 된다면 - */
        if(Math.pow(y,2)==n){
            return 1;
            /*그렇지 않다면 2를 리턴.*/
        }else{
            return 2;
        }
    }
}



public class Programmers_20221224_1 {
    public static void main(String[] arges)throws IOException{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution cal = new Solution();
        int result = cal.solution(n);
        System.out.println(result);
    }
}
