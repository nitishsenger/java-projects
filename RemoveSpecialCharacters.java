import java.util.*;


public class RemoveSpecialCharacters {
    public static void main(String args[]){
        String str = "$ja!va!$st%ar*";

        String replaceString = str.replaceAll("[^a-zA-z0-9]", "");

        System.out.println(replaceString);

    }

}
