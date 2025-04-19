import java.util.Scanner;
class IiyaAndBank{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          
          if(num >= 0){
             System.out.println(num);
          }else{
             int op1 = num / 10;
             int op2 = (num / 100) * 10 + (num % 10);
             System.out.println(Math.max(op1,op2));
          }
      }
}