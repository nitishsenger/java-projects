import java.util.*;

public class SortStringChar {
    public static void main(String args[]){
        String str = "BCAD";
        char arr [] = str.toCharArray();

        char temp = 0; //for storing the words in it

        for(int i=0 ; i < arr.length ; i++){
            for(int j=i+1 ; j < arr.length ; j++){

                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }
            }
        }
        System.out.println(arr);

    }
    
}
