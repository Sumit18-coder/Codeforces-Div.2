import java.util.ArrayList;
import java.util.Scanner;
class Games{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer> homeDress = new ArrayList<>();
      ArrayList<Integer> guestDress = new ArrayList<>();
      int changeCount = 0;
      
      while(n-- >= 1){
             homeDress.add(sc.nextInt());
             guestDress.add(sc.nextInt());
      }
         for(int i = 0;i < homeDress.size(); i++){
             for(int j = 0;j < guestDress.size(); j++){
                  if(homeDress.get(i) == guestDress.get(j)){
                      changeCount++;
                  }
             }
         }
      System.out.println(changeCount);
    }
}