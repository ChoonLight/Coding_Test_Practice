
    import java.util.Scanner;

    public class Question10950_2 {
        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            int arraySize = sc.nextInt();
            int testCase[] = new int[arraySize];
            System.out.println(testCase.length);
            for (int i = 0; i < arraySize ; i++){
                Scanner sc1 = new Scanner(System.in);
                String userAnswer = sc1.nextLine();
                String[] answerChange = userAnswer.split(" ");
                int A = Integer.parseInt(answerChange[0]);
                int B = Integer.parseInt(answerChange[1]);
                testCase[i] = A+B;
            }

            for(int j : testCase){
                System.out.println(j);
            }
        }

    }
