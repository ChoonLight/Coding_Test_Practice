import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Question18108_Java_2 {
    public static void main(String[] args) throws IOException {

        /*Scanner 보다 빠른 입출력을 위한 BufferReader 사용. 이때 문자열을 하나씩 받는 상태라 print는 오류가 발생
        이때 throw IOException을 넣어줘야함 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*이때 InputStreamReader는 BufferReader에서 읽어온 입력 스트림들을 캐릭터 단위로 처리해주고
        system.in은 사용자의 입력값을 입력 받는 자바 기본 입출력 클래스
        */

        String s = br.readLine();	// 해당 br에 있는 한 줄을 읽고 String s에 문자열로 반환함
        int year = Integer.parseInt(s);	// 반환 된 문자열을 정수로 바꿔준다.

        System.out.println(year - 543);
    }
}
