import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//This program is written by Mohd Umar (Master-Tech271)
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while(n>0){
            String str = in.nextLine();
            char arr[] = str.toCharArray();
            //even indexes
            for(int i=0; i<arr.length; i=i+2){
                System.out.print(arr[i]);
            }
            //two spaces
            System.out.print(" ");
            //odd indexes
            for(int i=1; i<arr.length; i=i+2){
                System.out.print(arr[i]);
            }
            //new line
            System.out.println();
            //decrease the number of string 
            n--;
        }
    }
}
