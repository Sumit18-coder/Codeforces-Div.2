import java.util.Scanner;
class Watermelon1{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int weight = sc.nextInt();
     if(weight>2 && weight % 2 == 0){
       System.out.println("YES");
     }else{
       System.out.println("NO");
     }
   }
 }