import java.util.*;
public class pallendrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int x=n;
        int l,n1=0;
        sc.close();

        while(n>0){
            l=n%10;
            n1=n1*10+l;
            n=n/10;
        }
        if(n1==x){
            System.out.println("pallendrome");
        }
        else
        System.out.println(("not a pallendrome"));

    }

}