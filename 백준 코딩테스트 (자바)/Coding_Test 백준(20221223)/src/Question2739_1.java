import java.util.Scanner;

public class Question2739_1 {
    /*이번 예제는 주어진 예제를 잘보아야 한다. 즉 세가지 경우의 수를 찾아야 하는데
    첫번째는 45분 미만의 상황, 두번째는 45분 이상의 상황, 세번째는 시간(h)이 0(자정)인 상황을비교해야 하는데
    */
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int Input = sc.nextInt();
        if(Input >= 1 && Input <= 10){
            for(int i = 1 ; i < 10 ; i++)
                System.out.println(Input + " * " + i + " = " + Input*i);
        }else{
                System.out.println("1이상, 10이하의 숫자를 입력해주십시오.");
        }

    }

}