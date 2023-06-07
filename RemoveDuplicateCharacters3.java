import java.util.*;
public class RemoveDuplicateCharacters3 {
    public static void main(String args[]){
        String str = "programming";
        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet();
        for(int i=0 ; i<str.length() ; i++){
            set.add(str.charAt(i));

        }
        for (Character c : set){
            sb4.append(c);
        }
        System.out.println(sb4);
    }
    
}
