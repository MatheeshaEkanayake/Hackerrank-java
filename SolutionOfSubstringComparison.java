import java.util.Scanner;

public class SolutionOfSubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        /* when there is unknown number of elements in an array we use arraylist
         * first we need to import java.util.ArrayList class
         * or we can write in the code (as below code)
         */
        java.util.ArrayList<String> subs = new java.util.ArrayList<>(); 
        for (int i = 0; i + k < s.length() + 1; i++){
        subs.add(s.substring(i, i +k));  
        }

        //this function will sort all the elements in the array
        java.util.Collections.sort(subs);

        //we have to access the elements by using .get(index)
        smallest = subs.get(0);
        largest = subs.get(subs.size() -1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
