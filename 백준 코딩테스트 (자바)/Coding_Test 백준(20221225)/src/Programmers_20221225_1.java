import java.io.IOException;
import java.util.Scanner;

class Solution {
    public int solution(String[] s1, String[] s2  ) {
        /*가장 큰 수 찾기 (입문)*/
        int count = 0;
        /*배열 s1의 길이만큼 for문 실행*/
        for (String str1 : s1){
            /*배열 s2의 길이만큼 for문 실행*/
            for (String str2 : s2){
                /*s1배열의 첫번째 인덱스를 기준으로 s2의 첫번째부터 마지막까지 for문을 돌았을때
                만약 같은 숫자가 있다면 count를 증가시키고 이어서 다시 s1 for문의 두번째 인덱스를 기준으로 s2의 for문을 실행
                이것을 s1의 배열의 길이만큼 반복 실행하여 같은 수(배열 s1과 s2의 내용물 중 일치하는 횟수)를 구하게 됨.
                */
                /*참고로 str1 == str2를 넣을 경우 배열의 길이가 달라 실행되지 않는 듯한 모습을 보인다.*/
                if(str1.equals(str2)){
                    count++;
                }
            }
        }return count;
    }
}



public class Programmers_20221225_1 {
    public static void main(String[] arges)throws IOException{

        Scanner sc = new Scanner(System.in);
        String[] a = new String[sc.nextInt()];
        String[] b = new String[sc.nextInt()];
        Solution1 cal = new Solution1();
        int result = cal.solution(a, b);
        System.out.println(result);
    }
}
