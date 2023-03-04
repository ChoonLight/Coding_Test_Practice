import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Question10871_1 {
/*이번엔 정석대로 입력을 해봤는데 Stranger's LAB에 StringBuilder를 쓰는 방법이 있어서 연습 해봤다. */

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int limit = sc.nextInt();
        /*int[] array = new int[length];
        for(int i = 0 ; i < array.length ; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] < limit){
                System.out.print(array[i] + " ");
            }
        }
        원문은 위의 내용인데 append를 사용시 굳이 배열을 쓰지 않고도 연속 입력되는 값들을 저장할 수 있다고 한다.
        */
        /*StringBuilder를 사용할 생성자 선언*/
        StringBuilder sb = new StringBuilder();
        /*사용자의 길이 입력만큼 for문 실행*/
        for(int i = 0 ; i<length ; i++) {
            //사용자가 입력 할 숫자//
            int Input = sc.nextInt();
            /*만약 사용자의 입력값이 limit숫자보다 작은 경우*/
            if (Input < limit) {
                /*sb에 그 input값 + 공백값을 어펜딩 시켜주고 다시 for문 반복*/
                sb.append(Input + " ");
            }
        /*반복이 끝나고 누적된 sb를 출력*/
        }System.out.println(sb);
    }
}
/*append는 생각보다 연습하면 굳이 번거로운 배열을 쓰지 않고도 입력 누적이 가능하다는 것을 알게됬다.
물론 N차원 배열이라고 한다면 또 배열을 사용해야겠지만 연속된 값이라고 한다면 애용해볼만도 하다.
이후에 BufferedReader와 StringTocker를 활용해 토큰 값들을 append 시켜주는 방법도 있었으나 그건 2회차에 시도하는 걸로...
출처 - Stranger's LAB
https://st-lab.tistory.com/38
*/
