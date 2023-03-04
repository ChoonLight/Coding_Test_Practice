import java.util.Scanner;

class Test{
    long sum(int[] a){
        long sum = 0 ;
        for (int i = 0; i < a.length ; i++){
            sum += a[i];
        }return sum;
    }
}
/*알고리즘
설명X (윗쪽↑ = method / 밑쪽↓ = class)
*/
public class Question15596_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        for (int i = 0 ; i < array.length ; i++){
            array[i] = sc.nextInt();
        }
        Test sum = new Test();
        long result = sum.sum(array);
        System.out.println(result);
    }
}


/* 출처 -Stranger's LAB
https://st-lab.tistory.com/51
*/
