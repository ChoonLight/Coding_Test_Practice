import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question10951_2 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*사용자 입력값을 string 형태로 받아오고*/
        String n = br.readLine();
        /*그 후 사용자가 얼마를 입력했는지를 보여줄 count와 사용자 입력값의 초기값을 담아줄 copy 변수를 생성.*/
        int count = 0;
        int copy = Integer.parseInt(n);
        /*토커나이저를 위한 list변수 생성*/
        StringTokenizer list;
        /*스트링 토커나이저n의 결과값을 사용자의 입력 초기값 int copy와 비교하기 위한 임시 그릇 n2 생성 */
        int n2;
        do {
            //토커나이저에 string형 n값 저장//
            list = new StringTokenizer(n, "");
            //다시 string형 n값을 n2에 저장//
            n2 = Integer.parseInt(n);
            //n의 첫번째 자리(1)과 두번째 자리(2)를 저장//
            int A = Integer.parseInt(list.nextToken());
            int B = Integer.parseInt(list.nextToken());
            //이후 정수형 n2에 B의 10의자리수와 A+B의 합을 더하고//
            n2 = (B * 10) + (A + B);
            //다시 정수형 타입의 결과값 n2값을 n에 String형태로 담아 반복 실행//
            n = String.valueOf(n2);
            /*입력값 증가*/
            count++;
        }
        /*사용자의 초기값이 새로운 계산식에 의해 생성된 값과 같지 않을 때까지, 즉 이 두 값이 같을 경우 do while문 종료*/
        while (copy != n2);
        System.out.println(count);
        //근데 안됨 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 한번에 구분 없이 입력된 연속숫자는 토커나이저로 구분이 안되나봄....//
    }
}
/*이런 복잡한 식을 한줄로 풀어낼 수 있는 알고리즘을 더욱 연습할 필요성을 느끼게 되었다.*/
