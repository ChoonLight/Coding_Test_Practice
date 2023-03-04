import java.io.*;


public class Question2439_1 {
    /*이전 2438문제에서 사용했던 구문을 응용해 이중 for문 및 중첩을 사용하기로 했따..
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Input = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 1 ; i <= Input ; i++){
            /*여기부터는 공백을 출력하는 구간
            참고로 한줄씩 내려갈때마다 공백 -1씩 감소를 하기 때문에 첫째줄은 4개의 공백을 만들기 위해 4번의 공백을 반복해야 하므로
            j가 1일때는 만약 사용자가 5를 입력했다면 첫줄은 Input(5) - i(1) = 4 이렇게 총 4번의 공백을 실행하게 되고
            다음 for문으로 넘어가 k를 실행하며
            j가 2일때는 Input(5) - i(2) = 3이므로 j 1부터 3까지 총 3번의 공백을 실행
            이대로 쭉 가다가 네번째 줄이 되는 시점은 Input(5) - i(4) = 1이므로 여기까지는 딱 하나 실행
            이후 마지막 줄에서는 범위의 연산 결과값이 0이 되므로 공백을 실행하지 않고 바로 다음 for문으로 간다.
            */
            for(int j = 1 ; j <=Input - i ; j++){
                bw.write(" ");
            }
            /*여기부터는 공백을 출력하는 구간*/
            for(int k = 1 ; k <= i ; k++){
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

