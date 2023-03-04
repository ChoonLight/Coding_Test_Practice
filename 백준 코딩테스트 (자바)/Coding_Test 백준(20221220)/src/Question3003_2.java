import java.util.Scanner;

public class Question3003_2 {
    public static void main(String[] args) {
        /*하지만 문제에는 0초과 10미만의 정수가 입력되야 한다는 것을 전제로 하고 있음
        그래서 for문과 if문을 같이 사용함*/
        int[] sets = {1, 1, 2, 2, 2, 8};

        Scanner sc = new Scanner(System.in);
        /*여기까진 똑같음*/
            for (int i = 0; i < 6; i++) {
                int puts = sc.nextInt();
                /*for문을 돌리는데 만약 사용자 입력값이 해당하는 조건에 부합한다면 아래의 sets[i] - puts 값이 입력됨*/
                /*그 이후 똑같이 puts의 인덱스 값이 6보다 작은 경우(0부터 5번째까지)를 반복함*/
                if (puts > 0 && puts <= 10) {
                    System.out.println((sets[i] - puts));
                }
                /*만약 사용자가 입력한 값이 0보다 작은 음수이거나 10을 초과한 양수를 조건으로 했을때 다음 문구가 출력되도록 함*/
                /*이때 위 첫번째 조건은 0~10 사이에 들어가야 하기 때문에 교집합(and), 두번째 조건은 둘중 하나만 들면 되기에
                합집합(or 조건)의 형태로 코드를 작성해줌*/
                else if (puts < 0 || puts > 10) {
                    System.out.print("0이상, 10 이하인 정수를 입력 해주세요.");
                }
            }
    }
}
