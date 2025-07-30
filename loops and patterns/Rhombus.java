import java.util.*;
public class Rhombus{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of rhombus");
        int n=sc.nextInt();
        sc.close();
    //      *****
    //     *****
    //    *****
    //   *****
        for(int i=n-1;i>=1;i--){
            // Spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");

            }
            // Stars
            for(int j=n;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
        // hollow rhombus
    //      *****
    //     *   *
    //    *   *
    //   *   *
    //  *****
        for(int i=n;i>=1;i--){
            // Spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");

            }
            // Stars
            for(int j=1;j<=n;j++){
                if(j==1||j==n||i==1||i==n)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.println();
        }


    }
}