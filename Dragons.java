import java.util.*;
public class Dragons{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int s = sc.nextInt();
           int n = sc.nextInt();
          
           Pair arr[] = new Pair[n];
           for(int i = 0;i < n; i++){
              int x = sc.nextInt();
              int y = sc.nextInt();

              arr[i] = new Pair(x,y);
           }
              Arrays.sort(arr, new Comparator<Pair>() {
              @Override
              public int compare(Pair p1, Pair p2) {
                   return p1.s - p2.s;
                  }
              });
           boolean flag = true;
           for(int i = 0; i < n; i++){
               Pair dragon = arr[i];
               if(s > dragon.s) s += dragon.bonus;
               else{
                    flag = false;
                    break;
               }
           }
           if(flag) System.out.println("YES");
           else System.out.println("NO");
      }
      static class Pair{
            int s;
            int bonus;

            //constructor
            Pair(int a,int b){
               this.s = a;
               this.bonus = b;
            }
      }

}