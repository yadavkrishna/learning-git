package function;

import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        
        
        boolean ans=isPrime(9);

        

        // for(int i=100; i<1000;i++){
        //     if(armstrongNumber(i))
            
        //     {
        //         System.out.println("Armstrong numbers are at: "+i+ " ");
        //     }
        // }
    }
    

    static boolean armstrongNumber(int n){
        int original=n;
        int arnum=0;
        while(n>0){
            int rem=n%10;
            arnum=arnum+(rem*rem*rem);
            n=n/10;
        }
       return (original==arnum);
        
    }


    static boolean isPrime(int n){
       if(n<=1){
           return false;
       }
       int c=2;

        while(c*c<=n){
            if(n%c==0){
                System.out.println("mot prime");
            }
                
            
            c++;
        }if(c*c>n){return true;}
        return false;

    }
}
