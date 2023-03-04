import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Question1546_1 {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        int firstArray[] = new int[sub];
        double secondArray[] = new double[sub];

        double max = 0;

        for(int i = 0; i < firstArray.length; i++) {
            firstArray[i] = sc.nextInt();
        }
        for(int i = 0; i < firstArray.length; i++) {
            if(firstArray[i] > max) {
                max = firstArray[i];
            }
            else if((firstArray[i] < max)){
                secondArray[i+1] = (firstArray[i]/max*100);
            }

        }
        secondArray[0] = max;
        double sum = Arrays.stream(secondArray).sum();
        System.out.println(sum);
        sc.close();
    }
}
/*근데 문제는 중복된 인풋값에 대해서는 같은 배열에 1을 집어넣기 때문에 그에 대비해서 hashset(defalut 값이 0임)
을 활용하면 중복 없이 그 참거짓 여부를 출력할수있다. (add와 size를 이용해 hashset의 총 길이를 구하는 함수 활용)*/

/* 출처 -Stranger's LAB
https://st-lab.tistory.com/46
*/
