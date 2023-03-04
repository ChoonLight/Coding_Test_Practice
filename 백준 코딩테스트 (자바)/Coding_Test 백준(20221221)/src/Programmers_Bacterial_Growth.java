/*문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120910*/
/*문제를 보면 1시간 마다 두배 증식 한다는 세균의 수(n)이 들어가 있다. */
/*즉 만약 어떤 세균의 수 10마리가 2시간 동안 증식을 한다면 1시간에는 20, 2시간에는 20마리의 두배인 40마리가 증가하는데*/
/*이를 통해 정해진 시간t 만큼 각각의 결과값 n에 X2를 해야한다는 것을 알수 있는데 이를 for문으로 구현 해보면 다음과 같다.*/
public class Programmers_Bacterial_Growth {
    public static int solution1(int n, int t) {

        for(int i=0;i<t;i++){
            n *=2;
        }
        /*만약 세균이 2, 시간이 10으로 주어졌을 경우 for문으로 i의 초기값 0부터 9까지 (i<t) 총 열번(10시간)을 돌게 되는데*/
        /*포문 안의 첫번째 n은 2*2의 값인 4가 되고, 두번째는 4*2인 8, 또 세번쨰는 8*2인 16 이렇게 총 열번을 반복할때*/
        /*증가하는 값이 2진수(2의 제곱)인 것을 생각해 2의 11제곱(처음 2의 1제곱은 2이기에 1부터 10을 더한 11까지 제곱을 진행)을
        한 값과 같아진다.
        */
        /*그래서 결국 for문을 열번 반복하면 2의 11제곱인 2048이 출력되게 되는 것이다.*/
        return n;
    }
    /*방금 위에서 언급한 제로곱을 이용해보면 굳이 for문을 돌리지 않고도 출력값을 얻을 수 있다고 한다.*/
    public static int solution2(int n, int t){
        /*대표적인 자바의 수학 함수인 math를 이용해 결과를 int형 정수로 result에 받고 이를 돌려주면 된다.*/
        int result = n * (int)Math.pow(2,t);
        /*참고로 (2,t)는 2제곱을 t번 만큼 반복한다는걸 의미함.*/
        return result;
    }


    public static void main(String[] args) {
        System.out.println(solution1(2,10));
        System.out.println(solution2(7,15));
    }
}