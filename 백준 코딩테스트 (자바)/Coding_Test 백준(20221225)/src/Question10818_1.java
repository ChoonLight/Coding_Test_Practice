import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Question10818_1 {
/*이번엔 Arrays 함수를 사용해 최대값과 최소값을 사용해보았다. */

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        if(length < -1000000 || length > 1000000){
            System.out.println("범위 안의 정수를 입력하세요.");
            return;
        }

        int[] array = new int[length];
        
        for(int i = 0 ; i < array.length ; i++){
            int Input = sc.nextInt();
            if (Input >= -1000000 && Input <= 1000000){
                array[i] = Input;
            }else{
                System.out.println("범위 안의 정수를 입력하세요.");
                return;
            }
        }
        /* 일단 최댓값과 최소값을 구하는 코드는 아래처럼 구현이 가능하나, 배열 안에 자체 최대 최소갑을 구하는 방식을 활용하기로 함
        int max = array[0];
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        int min = array[0];
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.print(min + " " + max);
        */
        /*바로 Arrays 함수를 이용하는 방법, 단 배열의 최대 최소값을 Int형으로 다시 변환해야되서 아래같이 getAsInt를 넣어주어야 한다.*/
        System.out.println(Arrays.stream(array).min().getAsInt() + " " + Arrays.stream(array).max().getAsInt());

    }
}
/*참고로 형변환 getAsInt을 사용하지 않을시 stream에 의해 기본형 함수(optionalInt)가 생성되므로 꼭 형변환!*/
/*2회차에는 Stranger's LAB 블로그를 참조해서 BufferedReader와 StringTokenizer, StringBuilder를 응용해보자.*/
