import java.util.Scanner;

/*알고리즘
1. 첫번째 입력은 숫자의 개수, 두번째 입력은 N개의 숫자
2.
*/
public class Question11720_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        //한단어씩 next로 Input에 입력해줌.//
        String Input = sc.next();
        sc.close();
        //전체 합계//
        int sum = 0;
        for (int i = 0; i < range ; i++){
            /*charAt은 String형만 읽을 수 있기 때문에 사용시 주의해야 하며
            charAt을 사용시 해당 값을 아스키코드(sum은 int형이기 때문에 한글자를 읽어오더라도 아스키값으로 변화됨)
            가 나오는 것을 고려하여 뒤에 '0' 혹은 48을 뺴누는 작업을 해줘야함.
            */
            //만약 int sum이 아니라 String혹은 char을 사용할경우 형변환을 다시해서 일일이 더해줘야함.//
            sum+=Input.charAt(i)-48;//또는 아스키코드 값이 0부터 시작하는 48입력.//;
        }
        ////
        System.out.print(sum);
    }
}


/* 출처 -Stranger's LAB
https://st-lab.tistory.com/51
*/
