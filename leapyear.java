import java.io.*;
import java.util.*;

public class Solution {////

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int year=ob.nextInt();
        String ans=(year%4==0 && year%100!=0)?"Yes":(year%400==0)?"Yes":"No";
       
                    System.out.println(ans);
                }
    }
