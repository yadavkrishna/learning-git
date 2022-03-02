package function;

import javax.sound.sampled.SourceDataLine;

public class Shadowing {
    static int x=90; 


    public static void main(String[] args) {
    
        System.out.println(x);
        int x;
        x=8;                    //shadowed /modified but only for this block below this line
        System.out.println(x);//
    }
}
