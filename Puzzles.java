import java.util.Scanner;
import java.util.Arrays;
public class Puzzles{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] f = new int[m];
      for(int i = 0;i < m; i++){
          f[i] = sc.nextInt();
      }
      Arrays.sort(f);
      int leastDifference = Integer.MAX_VALUE;
      for(int i = 0; i <= m - n; i++){
         int difference = f[i + n - 1] - f[i];
         if(difference < leastDifference){
            leastDifference = difference;
         }
      }
      System.out.println(leastDifference);
      sc.close(); 
   }
}

