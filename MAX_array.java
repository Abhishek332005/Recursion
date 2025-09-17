package Recursion;
import java.util.*;
public class MAX_array {

    static int maxarray(int [] arr, int idx){
        if(idx == arr.length-1) {
            return arr[idx];
        }
        int smallAns = maxarray(arr,idx+1);
        return Math.max(smallAns,arr[idx]);
    }


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int [] arr = {12,5,7,1,5};
        System.out.println(maxarray(arr,0));

    }
}
