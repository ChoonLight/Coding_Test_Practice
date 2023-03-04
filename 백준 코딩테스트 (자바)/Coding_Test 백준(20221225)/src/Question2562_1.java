import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Question2562_1 {
/*이번엔 Arrays 함수를 사용해 최대값과 최소값을 사용해보았다. */

    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    /*배열 공간 저장*/
    int[] Input = new int[9];
    /*사용자 입력값*/
    for (int i = 0 ; i < Input.length ; i++){
        Input[i] = sc.nextInt();
    }
    /*가장 큰 값을 담을 저장소와 해당 인덱스*/
    int max = 0;
    int index = 0;

    for (int i = 0 ; i < Input.length ; i++){
        if (Input[i] > max){
            /*큰 값을 저장하는건 어렵지 않지만 인덱스를 표현하는건 고민이 많이 되었다.
            물론 백준처럼 i값을 이용해(어차피 i값은 고정으로 증가하니까)index = (i+1)를 작성하여
             +1만 해주면 되었지만(0번째부터 시작하니까) 나는 Arrays 함수를 통해 사용해보기로 했다.*/
            max = Input[i];
            index = Arrays.asList(Input).indexOf(i);

        }

    }System.out.print(max + "\n" + index);

    }
}
/*Stranger's LAB을 참고하지 않고 스스로 짜낸 몇 안되는 코딩문 ♥*/

