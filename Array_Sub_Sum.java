package Recursion;

public class Array_Sub_Sum {

    static void printsum(int [] a, int n ,int idx, int sum){
        if(idx >= n){
            System.out.print(sum +" ");
            return;
        }
        printsum(a,n,idx+1,sum+a[idx]);
        printsum(a,n,idx+1,sum);
    }


    public static void main(String[] args) {
        int [] a = {2,4,5};
        printsum(a,a.length,0,0);

    }
}
