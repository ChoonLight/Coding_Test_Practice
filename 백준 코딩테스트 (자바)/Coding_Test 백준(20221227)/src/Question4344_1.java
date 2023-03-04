import java.util.Scanner;
/*알고리즘
첫째줄 : 주어지는 테스트 케이스 개수 C
둘째줄 : 첫번째 숫자는 학생의 수, 두번째 부터는 각 학생의 점수
1. 테스트케이스 변수 선언
2. for문을 이용해 학생들의 수를 담을 변수 지정(1), 다시 for문을 돌려 해당 첫번째 배열의 길이만큼 성적 입력.
3. 학생들의 점수를 합산하여 평균을 내고 그 평균을 넘는 학생들의 숫자를 누적시키기 위한 for문을 작성
4. 전체 학생(testcase) 중 평균을 넘는 학생들(count)의 비율을 구하고 해당 값을 소수 3번째 자리까지 실수형으로 출력.
*/
public class Question4344_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] List;
        int testCase = sc.nextInt();
        //for문을 사용자가 입력한 테스트케이스 만큼 반복할 for문 입력//
        for (int i = 0; i < testCase; i++) {
            //해당에 설정한 배열에 길이를 입력받도록 변수 선언//
            int n = sc.nextInt();
            List = new int[n];
            /*해당 성적의 누적 합산 구간, 참고로 double인 이유는
            평균을 넘는 학생들의 비율값을 반올림하여 소수 세번째자리까지 출력해야 하기 때문.*/
            double sum = 0;

            // 성적 입력부분
            //다시 for문을 돌리고 testcase의 길이만큼 학생들의 성적을 입력한다.//
            for (int j = 0; j < List.length; j++) {
                int val = sc.nextInt();    // 성적 입력
                List[j] = val;
                sum += val;
            }
            //조건문에는 테스트케이스마다 평균이 넘는 학생들의 비율(전체 학생 중에서의 비율)을 출력
            double average = (sum / List.length);
            //평균이 넘는 학생들의 수를 카운트하는 변수 선언//
            double count = 0;

            //다시 해당 i번째 배열을 가진 List를 for문으로 실행해서
            for (int j = 0; j < List.length; j++) {
                //만약 배열값들 중에 평균을 넘는 인덱스가 있다면 그 값을 count에 누적 합산.//
                if (List[j] > average) {
                    count++;
                }
            }
            /*출력문은 printf를 활용해 실수를 출력, 참고로 %기호를 출력하기 위해선 %%를 이렇게 두번 넣어주어야 한다고함
            또한 계산식 풀이는 (평균을 넘는 학생/전체 학생) * 100 -> 소수 세번째 자리까지 나타내야 하기 때문에 
            100(3자리 수)를 곱해준거임
            */
            System.out.printf("%.3f%%\n", (count / List.length) * 100);
        }
    }
}


/* 출처 -Stranger's LAB
https://st-lab.tistory.com/51
*/
