import java.util.*;

public class RemoveWhitespaces {
    public static void main(String args[]){
        String str = "  j a  va  s t  a r  ";

        String trimmedString = str.replaceAll("\\s","");
        //by using \\s we can remove single spaces from the string

        System.out.println(trimmedString);

        
    }
    
}
