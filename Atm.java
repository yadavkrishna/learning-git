import java.util.Scanner;

public class Atm {
    static int cardNo;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int bal=0;
       int amt;
       int wid,dip;
       
        while(true){
            System.out.println("***********************");
            System.out.println("-|- Welcome to ATM -|- ");
            System.out.println("To Login press 1");
            System.out.println("To Change pin press 2");
            System.out.println("To raise complaint press 3");
            System.out.println("To exit press x or 4 ");
            
            char ch=in.next().trim().charAt(0);
            switch(ch){
                case 1:login();
                        break;
                case 2:changePin();
                        break;
                        
                case 3:complaint();
                            break;

                case 4:exit(0);
                default:System.out.println("Invalid input ");
            }
            
        }

        void login() {
           
       } 
        
    }    
    
}
