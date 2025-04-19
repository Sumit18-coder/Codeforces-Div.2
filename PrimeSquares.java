import java.util.Scanner;
public class PrimeSquares{
       public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
               int n = sc.nextInt();
               int[][] matrix = new int[n][n];

               //fill matrix with 1's
               for(int i = 0;i < n;i++){
                 for(int j = 0;j < n;j++){
                    matrix[i][j] = 1;
                 }
               }

               //adjust diagonal 
               for(int i = 0;i < n;i++){
                  matrix[i][i] = 2;
               }
               
               for(int i = 0;i < n;i++){
                  for(int j = 0;j < n;j++){
                     System.out.print(matrix[i][j] + " "); 
                  }
                  System.out.println(); 
               }
            }
            sc.close();
       }
}