import java.util.*;
public class minimumDistance{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Ax = sc.nextInt();
        int Ay = sc.nextInt();
        int Bx = sc.nextInt();
        int By = sc.nextInt();
        
        int D1 = (Ax * Ax) + (Ay * Ay);
        int D2 = (Bx * Bx) + (By * By);

        System.out.println("D1 is "+D1);
        System.out.println("D2 is "+D2);
        
        if(D1 < D2){
            System.out.println(D1);
        }
        else{
            System.out.println(D2);
        }
      
    }
}