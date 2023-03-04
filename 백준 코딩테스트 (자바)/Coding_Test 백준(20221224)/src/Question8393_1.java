import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question8393_1 {
    /*이번 예제는 너무 쉬워서 이참에 일전에 잠깐 하다만 BufferedReader를 한번 연습해보기로 했다.*/
    public static void main(String[] args) throws IOException {
        /*이제 봤는데 br이 BufferReader의 약어였다.
        아무튼 아래 코드문은 BufferReader를 사용하기 위한 기본 생성자이니 기억해두자.*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*특히 readLine을 사용하기 위해서는 예외처리 구문이 필요하다.*/

        /*특히 아래 코드는 다음 코드를 축약한 코드이다.
        String Input = br.readLine();
        int n = Integer.parseInt(Input);*/
        int n = Integer.parseInt(br.readLine());
        br.close();
        /*누적을 위한 a 변수 생성*/
        int a = 0;
        /*for문 돌리고 i값을 0부터 시작해 i값이 1씩 증가함에 따라 그 증가값을 a에 누적시켜주는
        지극히 기본적인 for문*/
        for(int i = 0 ; i <= n ; i++){
            a+=i;
        }
        System.out.println(a);
    }
}
/*이참에 BufferedReader를 좀 연습해봐야겠다.*/