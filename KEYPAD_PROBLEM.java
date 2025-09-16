package Recursion;
import java.util.*;
public class KEYPAD_PROBLEM {


    static void combination(String dig, String []kp, String res){
        if(dig.length() == 0){
            System.out.print(res + " ");
            return;
        }
        int Currnum = dig.charAt(0) - '0';
        String CurrChoices = kp[Currnum];

        for(int i=0; i<CurrChoices.length(); i++){
            combination(dig.substring(1),kp,res+CurrChoices.charAt(i));
        }

    }


    public static void main(String[] args) {
        String dig = "23";
        String[] kp = {"" , "" ,"abc" ,"def", "fgh", "ijk", "lmn", "pqrs", "tuv","wxyz"};
        combination(dig,kp,"");
    }
}
