import java.util.Scanner;
import java.util.StringTokenizer;

public class Question2884_1 {
    /*이번 예제는 주어진 예제를 잘보아야 한다. 즉 세가지 경우의 수를 찾아야 하는데
    첫번째는 45분 미만의 상황, 두번째는 45분 이상의 상황, 세번째는 시간(h)이 0(자정)인 상황을비교해야 하는데
    */
    public static void main(String[] args) {
        /*입력값을 받아오는 경우 앞선 예제(두 수 비교하기)를 통해 배열과 split을 이용할 수 있으나
        인터넷 검색 결과 Stringtokenizer 함수로도 문자열을 split처럼 쪼갤수 있다고 해서 다음과 같이 사용을 해봤다.
        */
        Scanner sc = new Scanner(System.in);
        String Input = sc.nextLine();
        /*StringTokenizer의 변수 선언 예시, 단 여기서는 split과 다르게 변수 선언시 대상 변수 및 조건값을 같이 넣어줘야함.*/
        StringTokenizer toString = new StringTokenizer(Input, " ");

        /*그리고 해당 H와 M 변수를 지정 후 각각에 분리된 토큰 단위의 문자 단위들을 하나씩 집어넣음 */
        int H = Integer.parseInt(toString.nextToken());
        int M = Integer.parseInt(toString.nextToken());
        /*이렇게 H와 M을 출력 해보고 정상 출력인지 확인 했으면 바로 다음으로 넘어가자*/
        /*
        System.out.println(H);
        System.out.println(M);
        */
        if(H <= 23 && M < 45){
            H -= 1; /*참조 H--와 동일(후위연산자)*/
            M += 15; /*만약 넣는 분이 44분 까지면 44에 15를 더한 59분, 정확히 44분의 45분 전이 된다.*/
            /*여기서 두번째, 45분 전으로 돌렸을 때 즉 시간을 구하는 윗쪽 코드의 H가 0(자정)인 경우 시간은 23시가 되어야함*/
           if(H < 0){
               /*즉 위의 H에 0을 넣으면 위 후위연산자에 의해 -1이 됨, 하지만 우리가 구하는건 44분 까지의 분에 의한
               H(시간)이 한 시간 전 단위로 돌아가는 것이기 때문에 23이 되어야함. 그래서 다음과 같은 코드를 대입해줌.*/
               H = 23;
               System.out.println(H + " " + M);
               /*만약 분이 45분 이상이라면 시간을 바꿀 필요 없이 45분을 뺴주면 됨.
               또한 유저가 시간 개념상 24시 60분 이라는 개념을 넣을 일은 없기 때문에 이에 대한 조건들은 기입 X*/
           }else{
               /*다시 H(시간)이 0이 아닌 상황, 즉 23시를 표현 안해도 되는 경우의 조건을 입력.*/
               System.out.println(H + " " + M);
           }
        }else if(H <=23 && (M >= 45 && M <= 59)){
            System.out.println(H + " " + (M - 45));
        }else if(H >= 24 || M >= 60){
            System.out.println("올바른 시간을 입력해주세요.");
        }

    }
}
/*위 코드는 정상적으로 돌아가는 코드임, 근데 백준에서 채점할때 실패가 떠서 블로그 글을 참고 했더니 블로그는 다음과 같이 되어있었음*/
/*
if(M < 45) {
			H--;
			★ M = 60 - (45 - M); ★ -> 여기서 나는 분(M)에 대해 위와 같이 적었으나
			블로그에서는 나같이 44분 조건, 45분 이상 조건 이렇게 구별한게 아니라 아예 식을 만들어서 넣었음
			즉 44까지의 숫자를 넣었을 경우 45 - 44 = 1이 되고 거기서 60으로 1을 뺐을 시
			결과는 59, 즉 44분 이라는 숫자를 넣었을 경우 45분 전으로 돌린 59분이 정확히 계산되게 된다.
			이하 43, 40, 20 등등의 45 미만의 숫자를 집어넣어도 결과는 동일했다.
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
*/
/*블로그의 코드는 정상적으로 채점이 되는 것으로 확인을 했다. 하지만 내가 여지껏 짰던 여러 if문들의 조건을
저렇게 하나의 if문에 정리해서 넣었다는 것이 대단했고, 또 이러한 사고의 연습이 필요하지 않나 생각을 해봤다.
블로그 출처 : https://st-lab.tistory.com/24
*/