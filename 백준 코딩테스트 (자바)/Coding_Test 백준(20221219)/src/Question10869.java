import java.util.Scanner;

public class Question10869 {
    /*블로그의 글들은 다음과 같이 설명 되어있음*/
    /*
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(str + "??!");
        sc.close();
    }
    */
    
    
    /*근데 나는 if문을 사용해서 구색을 맞춰줌*/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str == "백준") /*만약에 들어온 문자가 백준이라면*/
            System.out.print(str + "??!"); /*str 입력문 + ??!*/
        else System.out.print(str + "??!"); /*그렇지 않더라도 입력문 + ??! 구문 입력*/
        sc.close();
    }
    
}
