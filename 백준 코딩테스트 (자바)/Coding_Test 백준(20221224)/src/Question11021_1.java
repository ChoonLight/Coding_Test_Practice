import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Question11021_1 {
    /*별다른거 없이 그냥 버퍼 쓰자.*/
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());

       for(int i = 1 ; i <= T ; i++){
           StringTokenizer Line = new StringTokenizer(br.readLine()," ");
           /*특이한건 블로그에서는 축약형으로 사용을 했다는 것이다, 즉 변수 선언을 하지 않고 출력부에
           토큰을 가져왔다.
           */
           int A = Integer.parseInt(Line.nextToken());
           int B = Integer.parseInt(Line.nextToken());
           System.out.println("Case #"+i+": "+(A+B));
           /*블로그에서 퍼온 소스
            System.out.println("Case #"+i+": "+(Integer.parseInt(Line.nextToken())
            +(Integer.parseInt(Line.nextToken())));
           */
       }br.close();
    }
}
/*이 방법 말고 더 있다... 이쯤되면 점점 블로그 주인 분이 무서워지는 ㄷ... 읍읍....
https://st-lab.tistory.com/33
*/
