import java.io.*;
import java.util.StringTokenizer;
/*버퍼를 주로 사용했다. 대신 마지막에 사용자가 0 0을 입력하면 출력이 안되는 것으로 보아*/
/*마지막 끝에 따로 if로 출력문을 넣는게 아닐가 생각을 했는데
블로그를 보니까 그냥 while을 쓰다가 if문을 걸고 A와 B가 모두 0일때 break를 거는 방법이였다.*/
public class Question10952_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer line;
        while (true){
            line = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(line.nextToken());
            int B = Integer.parseInt(line.nextToken());
            int answer = 0;
            if(A == 0 && B ==0){
                break;
            }else{
                answer = A + B;
                bw.write(answer + "\n");
            }
        }bw.flush();
        br.close();
        bw.close();
    }

}
/*bw.newLine을 사용하면 출력값이 무슨 이상한 이모티콘이 나온다. 아직도 적응이 안되네...*/
