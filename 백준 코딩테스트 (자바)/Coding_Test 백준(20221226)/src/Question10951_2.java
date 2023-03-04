import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Question10951_2 {


    public static void main(String[] args) throws IOException {
    /* 내가 짠 코드는 List1(사용자 입력값)과 List2(순차대로 넣은 값)을 서료 비교하는 코드였는데
    생각을 해보니 사용자가 순서대로 코드를 넣을리 만무해서 결국 블로그 글을 참고하게 되었다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] List1 = new int[28];
    int[] List2 = new int[30];
    for (int i = 0 ; i < 28 ; i++){
        List1[i] = Integer.parseInt(br.readLine());
    }
    for (int i = 0 ; i < 30 ; i++){
        int init = 0;
        List2[init] = i;
        init++;
    }
        for (int i = 0 ; i <= 29 ; i++) {
        if (List2[i] != List1[i]){
            System.out.println(i);
            }
        }
    }
    */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //불리언(1,0)형 배열을 31 길이만큼 생성을 하고//
    boolean[] List = new boolean[31];
    //0부터 28이 되기 전까지, 총 28번을 실행하는 동안//
    for (int i = 0; i < 28; i++) {
        //BufferedReader를 통해 입력받은 String 입력값을 int형 정수로 n에 받고//
        int n = Integer.parseInt(br.readLine());
        //해당하는 그 값 자리인 배열 공간에 true(1)를 넣는다.//
        List[n] = true;

    }
    //그리고 다시 for문을 30번 돌린다.(출석 부르는 파트)//
    for (int i = 1; i <= 30; i++) {
        /*1. 만약 위에+ 사용자가 입력하지 않은 숫자가 5와 10이라고 하자.
        2. 이 for문에서는 순차적으로 1부터 30까지 i를 반복하게 되는데
        3. 5와 10은 첫번째 for문에서 true값을 받지 못한 상태에기 때문에
        4 .모든 자리에 1이 있는 것과는 달리 다섯번째와 열번째, 즉 arr[5] 자리와 arr[10]의 자리는 false(0)가 들어있는 상태
        5. arr[i]는 1(참), !arr[i]는 0(거짓)이라는 소리이기에
        6. arr[i]번째가 참이 아닌 경우, 즉 거짓값(0)이 들어있는 경우 그 자리값을 출력을 하라는 뜻.
        7. 참고로 조건문을 arr[i] == false이렇게 적어도 됨.
        */
        if (!List[i]) System.out.println(i);  //불리지 않은 사람 출력
    }
    }
}
/* 출처 - 성장하는 코더의 스토리
https://propercoding.tistory.com/223
*/
