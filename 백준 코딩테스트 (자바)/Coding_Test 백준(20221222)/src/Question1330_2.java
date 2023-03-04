
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Question1330_2 {
    /*지문에서는 연속된 숫자 입력과 그 숫자 사이에 공백이 하나 포함되어 있기에 split 함수를 사용하기로 함*/
    public static void main(String[] arges) throws IOException {


        /*스캐너 변수 sc 정의 및 실행 시작*/
        Scanner sc = new Scanner(System.in);
        /*사용자 입력값을 문자열로 Input저장*/
        String Input = sc.nextLine();
        /*스캐너 종료*/
        sc.close();
        /*문자형 Input을 문자형 배열 arr에 담는데 Input 자료형 사이의 공백을 제거하고 그 양 만큼 담아냄*/
        String[] arr = Input.split(" ");
        /*split으로 구분된 문자형 배열 arr을 다시 정수형타입의 배열 newArr에 담기위해 int형 정수 배열을 arr의 길이만큼 선언해줌 */
        int[] newArr = new int[arr.length];
        /*for문을 arr.length만큼 돌림 (총 2회)*/
        for(int i = 0 ; i < arr.length; i++){
        /*for문이 진행되는 동안 문자형 배열 arr의 첫번째 값(0)을 Integer.parseInt로
        newArr의 똑같은 첫번째 공간에 정수형으로 변환해서 담아줌*/
            newArr[i] = Integer.parseInt(arr[i]) ;
        }
        /* 배열이 맞게 들어갔는지 확인해주는 코드
        System.out.println(Arrays.toString(newArr));
        */
        /*if부터 else if까지는 같음, newArr의 첫째 입력값과 둘째 입력값을 비교함*/
        if(newArr[0]>newArr[1])
            System.out.println(">");
        else if(newArr[0]<newArr[1])
            System.out.println("<");
        /*여기서 else를 쓴건 첫번째 조건문(작거나)과 두번째 조건문(크거나)를 제외한 나머지 선택지가 '같거나' 밖에 없기 때문임.*/
        else
            System.out.println("=");
    }
}