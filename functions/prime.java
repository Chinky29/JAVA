import java.util.*;
public class prime{
    public static void Primerange(int n){
        for(int i=2;i<=n;i++){
           if(prime(i))
           System.out.print(i+" ");

        }
    }
    public static boolean  prime(int n){
        boolean isPrime= true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime =false;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(prime(n))
        System.out.println("Prime");
        else{
        System.out.println("Not a prime number");}
        System.out.println("if u want to print the prime numbers till n type 1 and 0 if not");
        int b = sc.nextInt();
        if(b==1){
            Primerange(n) ; 
        }
        
        sc.close();
    }
}