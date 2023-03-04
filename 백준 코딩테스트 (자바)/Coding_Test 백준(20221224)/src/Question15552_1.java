import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*일단 제시된 예시중 총 금액이 260000원인 영수증을 예로 들어보면
그 중에 상품의 종류는 4가지, 즉 4번의 계산식을 거쳐야 한다는 것을 의미하며
20000*5 = 100000
30000*2 = 60000
10000*6 = 60000
5000*8 = 40000
이를 종합적으로 합했을때 260000원이 나온다
즉 for문을 네번 돌려 각 반복마다 total에서 각 상품의 금액과 수량을 곱해서 나온 금액을 빼야한다는 것이며
만약 for문을 돌려서 total(남은 값)이 0일때, 즉 0원일때 영수증과 실제의 계산값이 맞는다는 것을 의미하고
else(그 반대의 경우)라면 맞지 않는다는 의미로 구조를 짜면 되겠다.*/
public class Question15552_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] Array = new int[testCase];
        for(int i = 0 ; i < testCase ; i++){
            StringTokenizer Line = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(Line.nextToken());
            int B = Integer.parseInt(Line.nextToken());
            Array[i] = A+B;
        }
        for (int i = 0 ; i < testCase ; i++){
            System.out.println(Array[i]);
        }
    }
}
/*이번에 느낀건... 일단 지문과 주어진 부분을 잘 이해하는 알고리즘 사고 능력이 중요함을 느끼게 되었다.*/
