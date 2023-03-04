import java.util.Scanner;
public class Question14681_1 {
    /*사분면 중 해당되는 조건의 영역을 고르면 되는 if문.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        /*여기서는 전에 작성한 윤년(2753)의 예제 처럼 이중 if문을 이용해 정의가 가능하나 연습 겸 이중 조건을 연습해봄
        * 여기서 switch case문을 if문과 같이 사용해 case 별로 해당 분면을 출력하게도 할수 있으나 굳이 그럴 것 까지는 없음.*/
        /*혹은 이전에 연습했던 두 수 비교하기(1330) 예제를 통해서 하나의 입력값을 공백 포함 string 형 배열로 받아
        그걸 다시 나누고(split) integer.parseint로 형변환 하여 배열에 담은 후 값들을 꺼내어 사용하는 방법도 됨.
        */
        if(x > 0 && y > 0){
            System.out.print("1");
        }
        if(x < 0 && y > 0){
            System.out.print("2");
        }
        if(x < 0 && y < 0){
            System.out.print("3");
        }
        if(x > 0 && y < 0){
            System.out.print("4");
        }


    }

}