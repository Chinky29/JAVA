import java.util.*;
public class Rectangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght and breadth of the rectangle");
        int l=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        for(int i=1;i<=l;i++){
            for(int j=1;j<=b;j++){
                if(i==1||i==l||j==1||j==b){
                    System.out.print("*");
                }
                else
                System.out.print(" ");

            }
            System.out.println("");
        }
    }
}