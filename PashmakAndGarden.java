import java.util.Scanner;
class PashmakAndGarden{
      public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int x1 = sc.nextInt();
             int y1 = sc.nextInt();
             int x2 = sc.nextInt();
             int y2 = sc.nextInt();

             sc.close();

             if(x1 == x2){
                 int d = Math.abs(y1 - y2);
                 System.out.println((x1 + d) + " " + y1 + " " + (x2 + d) + " " + y2);
             }else if(y1 == y2){
                 int d = Math.abs(x1 - x2);
                 System.out.println(x1 + " " + (y1 + d) + " " + x2 + " " + (y2 + d));
             }else if(Math.abs(x1 - x2) == Math.abs(y1 - y2)){
                 System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
             }else{
                 System.out.println(-1);
             }
      }
}