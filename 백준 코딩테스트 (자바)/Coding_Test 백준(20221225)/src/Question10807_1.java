import java.util.Scanner;

/*이번 예제는 토큰을 사용하기가 애매할 것 같아서(사실 변수에 토큰을 담아 사용해왔는데 연속된 배열 숫자를 감당하기가...)
Scanner를 사용함.*/
public class Question10807_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*사용자 입력값(배열의 길이를 정할 값)*/
        int Input = sc.nextInt();
        /*사용자 입력값(길이)를 배열의 길이로 지정해줌*/
        int[] array = new int[Input];
        /*배열 길이만큼 사용자의 입력값들을 하나씩 넣어줌*/
        for(int i = 0 ; i<array.length ; i++){
            /*사용자의 입력값을 Number에 넣어줄때*/
            int Number = sc.nextInt();
            /*그 입력값이 조건에 부합한다면*/
            if(Number >= -100 && Number <= 100){
                /*배열에 담고*/
                array[i] = Number;
            /*아니라면*/
            }else{
                /*구문 출력후*/
                System.out.println("제대로 된 입력값을 입력해주세요.");
                /*종료*/
                return;
            }
        }
        /*사용자가 찾을 수 입력*/
        int find = sc.nextInt();
        /*사용자가 찾는 값에 부합할 경우 누적시킬 count 선언*/
        int count = 0;
        /*다시 배열의 길이만큼 for문 실행*/
        for(int i = 0 ; i <array.length ; i++){
            /*만약 사용자가 입력한 값이 조건을 부합하고 array의 0번째에 있을 경우 count를 누적 증가시켜줌*/
            if(find >= -100 && find <= 100 ) {
                if (find == array[i]) {
                    count++;
                }
            }else{
                /*조건에 미부합시 다음 문자를 출력후 리턴.*/
                System.out.println("제대로 된 값을 입력해주세요.");
                return;
            }
        }System.out.println(count);
    }
}
