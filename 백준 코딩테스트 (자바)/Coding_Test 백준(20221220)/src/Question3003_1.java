import java.util.Scanner;

public class Question3003_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*전형적인 리스트 반복문, chessList에 셋트를 배열하고 for문을 돌려 i만큼 유저의 입력값을 받아오고 그때마다
        체스리스트의 개수와 유저가 작성한 답의 차액 만큼 완전한 체스세트가 되기 위한 숫자를 알려줌 */
        int[] chessList = {1, 1, 2, 2, 2, 8};
        for(int i=0; i<6; i++) {
            int userwrite = sc.nextInt();
            System.out.println((chessList[i] - userwrite));
        }
    }
}