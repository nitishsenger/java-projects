import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Ax = sc.nextInt();
        int Ay = sc.nextInt();
        int Bx = sc.nextInt();
        int By = sc.nextInt();
        
        int D1 = (Ax * Ax) + (Ay * Ay);
        int D2 = (Bx * Bx) + (By * By);
        
        if(D1 < D2){
            System.out.println(D1);
        }
        else{
            System.out.println(D2);
        }
      
    }
}