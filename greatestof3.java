import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=ob.nextInt();
        int lar2=(a>b)?a:b;
            int lar3=(lar2>c)?lar2:c;
        System.out.print(lar3);
        
       
    }
}
