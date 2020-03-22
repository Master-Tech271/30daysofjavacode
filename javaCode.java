import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static boolean flag = false;
public static int B, H;
static{
    Scanner in = new Scanner(System.in);
    B = in.nextInt();
    H = in.nextInt();
    if((B<=100 && B>=-100) && (H<=100 && H>=-100)){
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            flag = true;
        }
    }     
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
