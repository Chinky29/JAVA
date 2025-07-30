import java.util.*;
public class binarytodec{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        //  System.out.println("enter the number in binary");
        //  int dec=0,p=0;
        //  int n=sc.nextInt();
        //  while(n>0){
        //     int l;
        //     l=n%10;
        //     dec=dec+(l*(int)Math.pow(2,p));
        //     p++;
        //     n=n/10;

        //  }
        //  System.out.println("Decimal number= "+dec);
         System.out.println("enter the number in dec");
         int bin=0;
         int p=0;
         int n2=sc.nextInt();
         while(n2>0){
            int l;
            l=n2%2;
           bin=bin+l*(int)Math.pow(10,p);
            p++;
            n2=n2/2;

         }

         System.out.println("binary number= "+bin);
         sc.close();
    }
}