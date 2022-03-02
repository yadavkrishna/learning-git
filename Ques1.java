import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        System.out.println("Enter 3 no:");
        int a,b,c;
        Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
       int max=a;
       if(b>max){
           max=b;
       }
       if(c>max){
           max=c;
       }
       System.out.println("Max of 3 num:"+max);


       int larger=Math.max(max,(Math.max(56,89)));
       System.out.println("\nlarger "+larger);
    }
}
