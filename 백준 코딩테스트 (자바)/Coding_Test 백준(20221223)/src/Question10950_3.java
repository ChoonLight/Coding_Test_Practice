
    import java.util.Scanner;
    import java.util.StringTokenizer;

    public class Question10950_3 {
        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            int arraySize = sc.nextInt();
            int testCase[] = new int[arraySize];

            for (int i = 0; i < arraySize ; i++){
                Scanner sc1 = new Scanner(System.in);
                StringTokenizer toString = new StringTokenizer(sc1.nextLine(), " ");
                int A = Integer.parseInt(toString.nextToken());
                int B = Integer.parseInt(toString.nextToken());
                testCase[i] = A+B;
            }

            for(int j : testCase){
                System.out.println(j);
            }
        }

    }
