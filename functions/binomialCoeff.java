import java.util.*;
public class binomialCoeff{
    public static int Binomial(int n,int r){
        int n1=factorial(n);
        int r1=factorial(r);
        int s=factorial(n-r);
        int c=n1/(r1*s);
        return c;


    }
    public static int factorial(int var0) {
        int var1 = 1;
        if (var0 != 0 && var0 != 1) {
           for(int var2 = 1; var2 <= var0; ++var2) {
              var1 *= var2;
           }
        } else {
           var1 = 1;
        }
  
        return var1;
     }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n and r");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int c=Binomial(n, r);
        System.out.println(c);

    }
}