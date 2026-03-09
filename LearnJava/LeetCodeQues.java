package LearnJava;

import java.io.*;
import java.util.*;

public class LeetCodeQues {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dig = scn.nextInt();

        // int v = 5;
        // int x = 10;
        // int l = 50;
        // int c = 100;
        // int D = 500;
        // int m = 1000;
        int rx = 0;
        int s = 1;
        while(dig > 0){
            int d = dig % 10;
            dig = dig/10;
            rx = d *s;
            s = s * 10;
            for(int i = 0; i < d; i++){
                if(d == 4 || d == 9){
                    //code
                }
            }
        }   
    }
}
