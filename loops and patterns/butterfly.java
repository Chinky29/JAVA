import java.util.*;
public class butterfly{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    // first half
    for(int i=1;i<=n;i++){
        // Stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        // Spaces
        for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");}
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }

   // second half
   for(int i=n;i>=1;i--){
     // Stars
     for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    // Spaces
    for(int j=1;j<=2*(n-i);j++){
    System.out.print(" ");}
    // Stars
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println(" ");

   }
}
}