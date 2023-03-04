import java.util.Scanner;

public class Question2588_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = (b % 10) * a; /*c에는 b(385)에 10을 나눠 나머지 결과값인 5와 a(472)를 곱함*/
        int d = ((b % 100) / 10) * a;
        /*d에는 b(385)에 100을 나눠 나머지 결과값인 85와 a(472)를 곱함*/
        /*여기서 다시 8을 만들어주기 위해 10으로 85를 나눠주는데*/
        /*이때의 셈은 85에 10을 나눠 8.5(float)이 나왔더라도 다시 곱하는 a(385/int)가 형이 우선되므로*/
        /*472와 8.5를 더할시 0.5는 자동적으로 탈락하고 나머지 값인 8과 나눈 결과값 3776이 나옴*/
        int e = (b / 100) * a; /*마지막은 b의 세번째 자리수(300)로 곱해야 하기에 자연스럽게 385/100 처리 */
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a * b);

    }

}