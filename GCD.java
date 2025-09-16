package Recursion;
import java.util.*;
public class GCD {

//    ----------------------------------Iterative method------------
    static int Igcd(int x, int y){
        while(x % y != 0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }

//------------Euclid's Method------------------------------------
    static int gcd(int x , int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }



    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

        System.out.println(Igcd(x,y));
        System.out.println(gcd(x,y));

    }
}
