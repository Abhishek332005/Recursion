package Recursion;
import java.util.*;
import java.util.ArrayList;

public class Array_all_index {

    static ArrayList<Integer> searchAllIndex(int [] arr, int n, int target, int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx >= n){
            return ans;
        }

        if(arr[idx] == target){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns =  searchAllIndex(arr,n,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }



    static int findAllIndx(int [] arr, int n, int target , int idx){
        if(idx == n){
            return -1;
        }
        if(arr[idx] == target){
            System.out.print(idx+" ");
        }
        return findAllIndx(arr,n,target,idx+1);


    }


    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,2};
        int n = arr.length;
        int target = 2;

        findAllIndx(arr,n,target,0);


//        ArrayList<Integer> ans = searchAllIndex(arr,n,target,0);
//        for(Integer i : ans){
//            System.out.println(i);
//        }


    }
}
