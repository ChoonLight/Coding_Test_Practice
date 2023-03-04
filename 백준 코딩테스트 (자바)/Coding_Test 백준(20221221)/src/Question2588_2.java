import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Question2588_2 {

    /*나같은 경우 첫번째 자연수 세자리는 정수로 받고, 두번째 자연수 세자리는 각각의 배열로 변환해서 처리하도록 만듬.*/
    public static void main(String[] args) throws IOException
    {   Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        int secondInput = sc.nextInt();
        /*여기서 secondInput을 secondInputArray 배열에 */
        int[] secondInputArray = Stream.of(String.valueOf(secondInput).split("")).mapToInt(Integer::parseInt)
        .toArray();
        System.out.println();
        System.out.println(firstInput * secondInputArray[0]);
        System.out.println(firstInput * secondInputArray[1]);
        System.out.println(firstInput * secondInputArray[2]);
        System.out.println(firstInput * secondInput);

    }

}
