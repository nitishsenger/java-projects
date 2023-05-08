import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        
        if(name1.compareTo(name2)==0){
            System.out.print("Strings are equal");
        }
        else{
            System.out.printf("Strings are not equal");
        }
    }
}