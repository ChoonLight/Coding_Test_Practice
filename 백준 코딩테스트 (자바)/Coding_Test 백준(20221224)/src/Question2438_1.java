import java.io.*;
import java.util.StringTokenizer;


public class Question2438_1 {
    /*가장 기본적인 이중 for문을 이용해 Scanner와 System.out을 사용해도 되지만 BufferedReader도 연습할겸
    다음과 같이 코드를 작성하였다.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        /*br을 안쓰는 구간이 있다면 close를 걸어두는 모양이다.*/
        br.close();

        for (int i=1 ; i <= count ; i++) {
            for (int j=1 ; j <= i ; j++) {
                String Star = "*";
                bw.write(Star);
            }/*참고로 write 구문에 줄바꿈을 위해 \n을 사용했지만 별 하나만 무수히 찍히는 현상을 발견했다.
            아무래도 다음 bw를 쓸때 다음 라인으로 넘어가기 위해서는 newLine(줄바꿈)을 또 써주어야 하는가보다
            System.out.println() 대용일지도?
            */
            bw.newLine();
        }bw.flush(); /*버퍼에 데이터가 차고 전송되기 전 실시간으로 보내게됨.*/
        bw.close();
    }
}
/*
참... 쓰면 쓸수록 익숙해질랑말랑 하는 놈이다.
https://st-lab.tistory.com/35
*/
