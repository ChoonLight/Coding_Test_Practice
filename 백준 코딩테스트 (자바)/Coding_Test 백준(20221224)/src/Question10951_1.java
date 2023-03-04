import java.io.*;
import java.util.StringTokenizer;

/*여기서는 전에 연습했던 while을 연습하지 않고 바로 if문으로 쓰려고 했는데 if문에 null이 먹히지 않아서*/
/*평소 자주 애용하는 Stranger's LAB 블로그에 방문을 했더니*/
/*거기는 아예 */
public class Question10951_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer list;
        String line;
        while ((line=br.readLine()) != "\n"){
            list = new StringTokenizer(line, " ");
            int A = Integer.parseInt(list.nextToken());
            int B = Integer.parseInt(list.nextToken());
            int answer = A + B;
            bw.write(answer + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
/*bw.newLine을 사용하면 출력값이 무슨 이상한 이모티콘이 나온다. 아직도 적응이 안되네...*/
