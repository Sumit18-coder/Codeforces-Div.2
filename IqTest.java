import java.util.Scanner;
public class IqTest{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int[] nums = new int[n];

           int evenCount = 0,oddCount = 0;
           int evenIndex = -1,oddIndex = -1;

           for(int i = 0;i < n; i++){
               nums[i] = sc.nextInt();
               if(nums[i] % 2 == 0){
                   evenCount++;
                   evenIndex = i + 1;
               }else{
                   oddCount++;
                   oddIndex = i + 1;
               }
           }
           if(oddCount == 1){
              System.out.println(oddIndex);
           }else{
              System.out.println(evenIndex);
           }
           sc.close();
      }
}