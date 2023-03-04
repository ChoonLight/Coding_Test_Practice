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
public class Question25304_1 {

    public static void main(String[] args) throws IOException {
        /*지난 시간에 이어 이번에도 BufferedReader를 연습 해보고자 응용을 해보기로 했다.
        해당 구문은 그냥 외우도록 하자!*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*참고로 long은 제한사항에 범위가 꽤나 높아서 혹시 몰라 넣어놨다.*/
        long total = Long.parseLong(br.readLine());
        int kind = Integer.parseInt(br.readLine());
        /*총 금액과 물품 종류가 선언되었으면 바로 for문을 돌리도록 하자.*/
        for(int i = 0 ; i < kind ; i++){
            /*참고로 토큰은 여기서 생성하고 받아야 하기 때문에(입력 받는건 여기니까) for문에서 넣어준다.*/
            StringTokenizer productPrice = new StringTokenizer(br.readLine());
            /*마찬가지로 입력 받은 금액과 수량을 토큰 별로 순서대로 각각 담아준다.*/
            int price = Integer.parseInt(productPrice.nextToken());
            int count = Integer.parseInt(productPrice.nextToken());
            /*그 뒤 위에서 설명한 총 금액에서 금액과 수량을 곱한 금액을 빼고 
            그 결과값(나머지)를 다시 total에 넣고 kind(상품 종류)만큼 반복한다.*/
            total = total - (price * count);
        }
        /*조건문, 이하 설명 생략*/
        if(total == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
/*이번에 느낀건... 일단 지문과 주어진 부분을 잘 이해하는 알고리즘 사고 능력이 중요함을 느끼게 되었다.*/
