package Recursion;
import java.util.*;

//Ques-- Given a String  , Write a method to print all the subsequences:



public class Array_Subsequance2 {


    static void allSub(String s , String currAns){   //s = "abc"  & currAns = " "
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0);  // a
        String remString = s.substring(1);  // bc


        // Curr char --> choose to be a part of currAns
        allSub(remString,currAns+curr);  // bc , a

        //curr char --> does not to be a part of currAns
        allSub(remString,currAns);
    }

    public static void main(String[] args) {
        allSub("abc" , "");

    }
}
