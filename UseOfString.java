import java.util.*;

public class UseOfString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        int a = A.length();
        int b = B.length();
        int t = a+b;
        System.out.println(t);
        int a1 = A.compareTo(B);//use to compare lexicographically(if two strings are compared based on dictionary position the string which comes afterwards)
        if(a1>0) System.out.println("Yes");
        else System.out.println("No");

        // string.substring(starting index,ending index)
        //toUppercase only can be use on a String
        String x = A.substring(0, 1).toUpperCase();//output is also a string
        String y = A.substring(1);//string.substring(starting index) *this will make new array starting from the given index
        String Aa = x.concat(y);
        String m = B.substring(0, 1).toUpperCase();
        String n = B.substring(1);
        String Bb = m.concat(n);
        System.out.println(Aa.concat(" "+Bb));
    }
}
