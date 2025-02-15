import java.util.Scanner;
class Presents{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int noOfFriends = sc.nextInt();
         int[] receiver = new int[noOfFriends];

         for(int i = 0;i < noOfFriends; i++){
            int presenting = sc.nextInt();
            receiver[presenting - 1] = i + 1;
         }
         for(int i = 0;i < noOfFriends; i++){
            System.out.println(receiver[i]+" ");
         }
     }
}