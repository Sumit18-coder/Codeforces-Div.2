import java.util.Scanner;
import.java.util.Arrays;
class ChoosingTeams{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int k = sc.nextInt();
           int count = 0;

           for(int i = 0;i < n; i++){
               int y = sc.nextInt();
               if(5 - y >= k){
                  count++;
               }
           }
           System.out.println(count);
           
      }
}