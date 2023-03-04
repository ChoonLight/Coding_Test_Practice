import java.util.Scanner;
import java.util.StringTokenizer;

public class Question2525_1 {
    /*일단 세가지 조건이 필요하다. 세개의 주사위 모두 같거나, 둘이 같거나, 다 다른경우. 일단 쉬운 것부터 하자.*/
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*뭐 배열을 넣든 토큰을 넣어주든 상관은 없지만 지난 시간(10950/A+B-3 문제)에서 하도 데여서
    이번엔 안전하게 그냥 int를 일일이 넣어보겠다. */
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    /*먼저 세 주사위 모두 같은 경우, 이 식을 기억해야 하는게
    AB가 같고, AC가 같다는건 결국 BC도 같다는 것을 의미하기 때문에 아래의 조건 하나로 세 주사위가 같음을 알수 있다.*/
    if(A == B && A == C){
        System.out.println(10000+(A*1000));
    }
    /*이제 세 주사위중 두 주사위가 같을 경우인데 이 조건은 AB, AC, BC 이렇게 세가지 경우로 나온다
    물론 한가지 조건만을 놓고 if문을 작성 할수 있겠지만 A라는 공통분모를 가진 AB와 AC를 한대 묶어줄 필요가 있다.
    */
    else if(A == B || A == C){
        System.out.println(10000+(A*1000));
    }else if(B == C)
        System.out.println(10000+(B*1000));
    }
    /*여기까지 적고 나서 생각을 해보니 세 주사위 모두 같은 경우를 작성하지 않아 else if로 다시 넣으려 하였으나
    이미 위에 세 주사위 모두 같은 경우를 가장 우선순위로 작성을 하였기 때문에 씨알도 먹히지 않게 되었다.
    그래서 또 자주 참고하는 Stranger's LAB 블로그를 참고 해봤는데
    그쪽에서는 처음부터 세 주사위 모두 다른 경우를 두고 max값(가장 큰 값의 주사위)를 구하고 있었다.
    */


}