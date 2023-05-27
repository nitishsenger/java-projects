import java.util.*;
public class getbit {
    public static void main(String args[]){
        int n = 16; //10000
        int pos = 4;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
            System.out.println("bit was zero");

        }
        else{
            System.out.println("bit was one");
        }

    }
    
}
