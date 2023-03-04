import java.io.IOException;
import java.util.Scanner;

class Solution1 {
    /*배열의 유사도 (입문)*/
    public int[] solution(int[] array) {
        int[] resultArray = new int[2];
        /*일단 세개가 필요하다. 최대값과 그 인덱스를 담을 변수, 그 두 값을 다시 담을 배열형 함수 하나.*/
        int max = 0;
        int index = 0;
        /*사용자에게 전달 받은 배열 array의 길이만큼 for문 실행*/
        for (int i = 0 ; i < array.length ; i++){
            /*이하 생략*/
            if(array[i] > max){
                max = array[i];
                index = (i);
            }
        }
        /*미리 설정 해놓은 리턴값 배열의 첫번째와 두번째에 각각 최댓값과 인덱스 값을 넣어준 후 리턴*/
        resultArray[0] = max;
        resultArray[1] = index;
        return resultArray;
    }
}
/*출처 - cogito-new
https://cogito-new.tistory.com/m/113
*/



public class Programmers_20221225_2 {
    public static void main(String[] arges)throws IOException{

        Scanner sc = new Scanner(System.in);
        String[] a = new String[sc.nextInt()];
        String[] b = new String[sc.nextInt()];
        Solution1 cal = new Solution1();

    }
}
