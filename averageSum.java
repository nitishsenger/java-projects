import java.util.*;
public class averageSum{
    public static int averageOfNumbers(int a,int b,int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int average = averageOfNumbers(a,b,c);
        System.out.println(average);
        
    }
}