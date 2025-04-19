import java.util.*;
public class ValeraAndAntiqueItems{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int v = sc.nextInt();
         List<Integer> sellers = new ArrayList<>();
         for(int i = 1;i <= n;i++){
           int k = sc.nextInt();
           boolean canBuy = false;
           
           for(int j = 0;j < k;j++){
                int price = sc.nextInt();
                if(price < v){
                   canBuy = true;
                }
           }
           if(canBuy){
              sellers.add(i);
           }
         }
         System.out.println(sellers.size());
           for(int seller : sellers){
               System.out.print(seller + " ");
         }
    }
}