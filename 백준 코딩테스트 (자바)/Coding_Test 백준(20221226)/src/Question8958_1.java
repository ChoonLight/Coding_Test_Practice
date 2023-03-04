import java.io.IOException;
import java.util.Scanner;

public class Question8958_1 {


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        String Input[] = new String[in.nextInt()];
        /*for문 실행동안 사용자가 입력한 값을 String형으로 담을 예정(문자열이니까)*/
        for(int i = 0; i < Input.length; i++) {
            Input[i] = in.next();
        }

        for(int i = 0; i < Input.length; i++){
            /*누적횟수를 저장할 cnt와 총 합을 담을 sum 선언*/
            int cnt = 0;
            int sum = 0;
            /*Input의 i번째, 즉 0번에 사용자가 입력한 첫번째 테스트케이스 값 배열의 길이만큼 for문을 실행한다
            예를들어 사용자가 총 3개의 테스트케이스를 입력하였고 첫번째 테스트케이스를 OOOXXXO 총 7개를 입력하였을시
            첫번째 for문은 총 3번(사용자가 연속한 값을 세번 입력하였으니) 반복되고
            두번째 값은 배열의 0번째의 문자 길이(OOOXXXO, 총 7번) 만큼 반복을 하게 되는 것이다.
            */
            for (int j = 0; j < Input[i].length(); j++) {
                /*그래서 처음에 시작하는 Input[0].charAt(0)에서 문자에 대한 존재 여부를 확인하고
                그에 대해 부합하는 조건문을 찾아 실행 후 다시 j를 1 증가,
                바로 Input[0].charAt(1)문자에 대한 존재 여부를 확인한다. 언제까지?
                Input[0].length(OOOXXXO,7) 까지.
                 */
                //만약 Input의 i번째의 j번째 문자가 문자 O와 같을 경우 카운트 값 증가//

                if (Input[i].charAt(j) == 'O') {
                    cnt++;
                }//같지 않다면 카운트 값을 최화//
                else {
                    cnt = 0;
                }//카운트 값을 sum에 누적한다.
                sum += cnt;
            }System.out.println(sum);
        }
    }
}
/*점점... 함수의 기능과 중요성을 배워가는게 얼마나 중요한지를 알아가는 요즘이다.*/

/* 출처 -Stranger's LAB
https://st-lab.tistory.com/50
*/
