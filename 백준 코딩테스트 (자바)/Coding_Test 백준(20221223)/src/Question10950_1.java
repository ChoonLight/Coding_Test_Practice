
    import java.util.Scanner;

    public class Question10950_1 {
        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            int arraySize = sc.nextInt();
            int testCase[] = new int[arraySize];

            for (int i = 0; i < arraySize ; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a);
                System.out.println(b);
                testCase[i] = a + b;
            }
            sc.close();
            for(int j : testCase){
                System.out.println(j);
            }
        }

    }
        /*String[] answerChange = userAnswer.split(" ");
        int A = Integer.parseInt(answerChange[0]);
        int B = Integer.parseInt(answerChange[1]);
                testCase[i] = A+B;

         */