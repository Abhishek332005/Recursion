package Recursion;
import java.util.*;
public class natural_number {

    static void printnumber(int n){
        if(n == 1) {
            System.out.println(n);
            return;
        }

    printnumber(n-1);
        System.out.println(n);
}


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printnumber(n);


    }
}
