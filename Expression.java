import java.util.Scanner;
class Expression{
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       
       int res1 = a + b + c;
       int res2 = a * b * c;
       int res3 = (a + b) * c;
       int res4 = a * (b + c);

       int result = Math.max(Math.max(res1,res2) , Math.max(res3,res4));
       System.out.println(result);
     }
}