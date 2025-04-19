import java.util.Scanner;
import java.util.Arrays;
public class ChooseTeams{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int k = sc.nextInt();
           int[] part = new int[n];
           int count = 0;

           for(int i = 0;i < n; i++){
               part[i] = sc.nextInt() + k;    
           }
           for(int i = 0;i < n - 2;i++){
               if(part[i + 2] >= 5){
                  count++;
                  i += 2;
               }
           }
           
           System.out.println(count);
           
      }
}