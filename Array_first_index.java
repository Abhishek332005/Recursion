package Recursion;

public class Array_first_index {


    static int findIndex(int [] arr, int n , int target , int idx){
        if(idx >= n) return -1;

        if(arr[idx] == target) return idx;

        return findIndex(arr,arr.length,target,idx+1);
    }


    public static void main(String[] args) {
        int [] arr = {1,5,3,4,5};
        int target = 5;
        int n = arr.length;
        System.out.println(findIndex(arr,n,target,0));
    }
}
