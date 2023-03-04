import java.util.Scanner;

/*알고리즘

*/
public class Question10809_1 {


    public static void main(String[] args) {
        //scanner 생성//
        Scanner in = new Scanner(System.in);

        //알파벳의 포함 여부를 표시할 26길이의 (소문자만 구성해서 26)arr 생성//
        int[] arr = new int[26];
        //for문이 도는 동안 arr의 length(26)만큼 -1을 다 담아줘 전체의 값을 -1로 초기화해줌//
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        //사용자가 입력하는 값//
        String S = in.nextLine();
        //사용자가 입력한 값의 길이만큼 한 단어씩 담을수 있는 char형 ch변수에 차곡차곡 담아줌//
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            //만약 사용자가 입력한 문자의 첫번째에 알파벳 a를 뺐을때 -1이라면 i를 arr의 i번쨰에 넣기//
            /*무슨 말이냐면 만약 사용자 입력값이 baekjoon 이라고 할때
            i가 0부터 시작할때 ch에는 현재 s.charAt의 i번째(0)에는 'b'가 들어가 있음.
            그리고 그 아래 if 조건문은 arr['b' - 'a'] == -1이라는 건데 이걸 풀어쓰자면
            아스키 코드값으로 환산해 인덱스 번호를 구하는 값은 [98 - 97]이 됨.
            그리하여 arr[1]번째의 값(기본값은 이미 앞에서 -1로 초기화를 했기 때문에)이 -1과 같으니까
            arr의 [1]번째 인덱스에는 현재의 i값(0)이 들어가게 되는거임.
            그 다음 다시 for문을 돌아서 두번째 a가 올때는 ['a' - 'a'] == -1이 되는 것이고
            마찬가지로 arr의 첫번째 인덱스에 다음 i인 1을 넣으라는 소리임.
            그 다음 e를 계산하면 [4]인데 이는 arr의 다섯번째 인덱스에 다음 i의 증가값인 2를 넣으라는 소리고
            이를 계속 풀었을때 나오는 식은 결국
            k(107) - 97 = 10 -> arr의 11번째 인덱스에 3을 넣어라
            j(106) - 97 = 9 -> arr의 10번째 인덱스에 4을 넣어라
            o(111) - 97 = 14 -> arr의 15번째 인덱스에 5을 넣어라
            o(111) - 97 = 14 -> arr의 15번째 인덱스에 6을 넣어라 인데 이미 앞에 o(앞전의 i값 5)가 들어있기 때문에 -1가 아니므로
            그냥 패스
            n(110) - 97 = 13 -> arr의 14번째 인덱스에 7을 넣어라
            이렇게 된다고 보는게 맞는 이해일까요?
            */
            if (arr[ch - 'a'] == -1) {    // arr 원소 값이 -1 인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for (int val : arr) {    // 배열 출력
            System.out.print(val + " ");
        }
    }
}


/* 출처 -Stranger's LAB
https://st-lab.tistory.com/51
*/
