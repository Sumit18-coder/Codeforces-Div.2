import java.util.Scanner;
public class Reorder{
     public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int testCase = sc.nextInt();
            while(testCase-- > 0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int eqnSum = 0;
                for(int i = 0;i < n;i++){
                   eqnSum += sc.nextInt();
                }
                System.out.println(eqnSum == m ? "YES" : "NO");
            }
            sc.close();
     }
}