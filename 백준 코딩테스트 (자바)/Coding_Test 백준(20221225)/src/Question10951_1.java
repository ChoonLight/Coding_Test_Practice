import java.io.*;
import java.util.StringTokenizer;

public class Question10951_1 {
//이건 알고리즘을 좀 많이 참고를 해야할 것 같아서 Stranger's LAB 블로그를 참조하였다.//
//알고리즘 순서//
/*- 주어진 숫자가 12라고 가정을 할때
  1. 10의 자리를 구하는 법은(N % 10) * 10 =  12를 10으로 나눈 그 나머지 값인 2를 다시 10으로 곱해주면 결국 20을 얻게됨
  2. 결과값으로 나온 20과 N끼리의 합을 더해야 하는 경우인데 split을 쓰자니 좀더 길어질 것 같아서 그냥 다음 알고리즘을 참조하기로 함
  3. 다시 1의 자리를 구하기 위해서는 결국 1과 2를 더한 값 = 3을 얻어야 한다는 소리인데
  4. 2는 이미 뒤에 나머지 값으로 구했으니까 1만 구하면 됨. / 12/10 = 1.2
  5. 그럼 다시 돌아와 1+2 = 3은 결국 (12/10) + (12%10) = 3이라는 소리고
  6. 이를 조합해보면 ((12%10) * 10) + ((12/10) + (12%10))) 이렇게 된다는 소리임 (뭔소리지?)
  7. 결국 위의 식을 풀면 1번 2*10=20 2번 1.2 + 2 - 3.2 3번 23.2 이렇게 된다는 소리임.
  */

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       /*일단 사용자 입력값을 받을 n을 생성하고 형변환 후 읽어옴*/
       int n = Integer.parseInt(br.readLine());
       /*그 후 사용자가 얼마를 입력했는지를 보여줄 count와 사용자 입력값의 초기값을 담아줄 copy 변수를 생성.*/
       int count = 0;
       int copy = n;

       /*일단 계산식을 실행 해보자*/
       do{
           /*이하 맨윗줄 풀이식 참조*/
           n = ((n%10) * 10) + (((n/10) + (n%10)) % 10);
           /*입력값 증가*/
           count++;
       }
       /*사용자의 초기값이 새로운 계산식에 의해 생성된 값과 같지 않을 때까지, 즉 이 두 값이 같을 경우 do while문 종료*/
       while (copy != n);
        System.out.println(count);
    }
}
/*이것이 알고리즘을 배워야하는 이유인 것인가... */
