import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Question1546_2 {


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        double arr[] = new double[in.nextInt()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }
        //여기까지는 입력값을 double로 받음//

        in.close();
        //배열의 합계를 담을 double 인수 선언//
        double sum = 0;
        //이거 컴활 내용때 진짜 많이 활용한건데 오름차순을 까먹고 있었따...//
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            /*for문이 실행 되는동안 sum에 i/(배열의 길이의 -1) * 100을 하는데
              이게 뭔말이냐면 만약 반복이 배열의 길이가 3이라고 가정을 하고 오름차순으로 인해 가장 큰 값이 오른쪽에 있다 가정할때
              배열의 첫번째에 70점이 담겨 있다면 70/배열의 최대 길이의 -1 즉 3-1 = 2번째(실제로 0부터 시작하니 가장 큰 값은 2번쨰)
              이렇게 해서 배열의 끝 값(맥스값)으로 각 최솟값들을 나눌 수 있는 것임.
              그리고 if를 쓰지 않은건 '모든 점수' 를 고친다고 했으니 max값 또한 적용이 되는 것을 알수있음.
            */
            sum += ((arr[i] / arr[arr.length-1]) * 100);
        }
        //연산이 끝나면 각 누적 합계인 sum을 배열의 길이로 나눈 평균값을 출력함.//
        System.out.print(sum / arr.length);
    }
}
/*이번에 느낀건... 진짜 이 어려운 for문도 조금만 뇌를 굴리면 푸는게 가능하다는 사실이다.
그렇다. 나는 뇌가 없는건 ㄱ...?*/

/* 출처 -Stranger's LAB
https://st-lab.tistory.com/47
*/