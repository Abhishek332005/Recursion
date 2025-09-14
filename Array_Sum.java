package Recursion;

public class Array_Sum {

    static int  arraysum(int [] arr, int idx){
        if(idx == arr.length){

            return 0;
        }
        int smallans = arraysum(arr , idx+1);
        return smallans + arr[idx];
    }



    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        System.out.println(arraysum(arr,0));


    }
}
