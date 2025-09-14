package Recursion;

public class Array_target {

    static boolean search(int [] arr,int n , int target , int idx){
        if(idx >= n) return false;

        if(arr[idx] == target) return true;

        return search(arr, n , target, idx+1);
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int target = 4;
        if(search(arr, arr.length,target ,0)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
}
