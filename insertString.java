import java.util.*;
public class insertString {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //insert char
        // sb.insert(0,'S');
        // System.out.println(sb);

        sb.insert(2,'n');
        System.out.println(sb);
    }
    
}
