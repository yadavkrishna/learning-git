import java.util.Scanner;

public class SwitchEg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any month 1 to 12");

        int month=sc.nextInt();
        String season;
        switch(month){
            case 11:
            case 12:
            case 1:season="winter";
                    break;
            case 2:
            case 3:
            case 4:season="Spring";
                    break;
            case 5:
            case 6:
            case 7:season="Summer";
                    break;
            case 8:
            case 9:
            case 10:season="Autumn";
                    break;
            default:season="Bogus month";
        }System.out.println("Entered month: "+month+" is :"+season);
    }    
}
