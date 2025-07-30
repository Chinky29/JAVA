import java.util.*;
public class operations{
public static int sum(int a ,int b){
    int c=a+b;
    return c;

}
public static int factorial(int n){
    int fact =1;
    if(n==0||n==1)
    fact=1;
    else{
        for(int i=1;i<=n;i++){
           fact=fact*i; 
        }
    }
    return fact;
}
    public static int multiplication(int a, int b){
        int c =a*b;
        return c;
    }
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter 2 numbers for addition");
int a = sc.nextInt();
int b=sc.nextInt();
int c=sum(a,b);
System.out.println(a+" + "+b+" = "+c);
System.out.println("Enter 2 numbers for multiplication");
int p = sc.nextInt();
int q=sc.nextInt();
int mult=multiplication(p,q);
System.out.println(p+" * "+ q +" = "+mult);
System.out.println("Enter a number for factorial");
int n=sc.nextInt();
int fact = factorial(n);
System.out.println("Factoial is "+fact);
sc.close();
}
}