import java.io.*;
import java.util.StringTokenizer;


public class Question11022_1 {

    public static void main(String[] args) throws IOException {
        /*이번엔 System.out.println대신 BufferWriter를 연습해보았다.*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*BufferedWriter 생성ㅈ아 구문*/
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int x = 1 ; x <= T ; x++){
            StringTokenizer Line = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(Line.nextToken());
            int B = Integer.parseInt(Line.nextToken());
            int C = A+B;
            /*BufferedWriter 출력 구문, 참고로 bw.write는 일일이 줄바꿈을 해줘야 한다.*/
            bw.write("Case #"+x+": "+ A +" + "+B+" = "+C+"\n");
        }
        br.close();
        bw.flush();/*BufferedWriter를 사용시 버퍼 뿐만 아니라 파일에도 사용하기 위해 flush 사용.*/
        bw.close();/*이후 bw.close 사용.*/
    }
}

