import java.util.*;
class Twins{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] coins = new int[n];
      int sum = 0;

      for(int i = 0;i < n ; i++){
          coins[i] = sc.nextInt();
          sum += coins[i];
      }   
      int target = sum/2;
      int currSum = 0;
      int count = 0;

      Arrays.sort(coins);

      for(int i = n - 1;i >= 0; i--){
            currSum += coins[i];
            count++;
      if(currSum > target){
            break;
          }
      }
      System.out.println(count); 
   }
}