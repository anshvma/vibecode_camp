package LearnJava;

import java.util.*;
import java.io.*;

public class Learnjavastk {
    //Introduction to Stack
    // public static void main(String[] args) {
    //     Stack<Integer> st = new Stack<>();

    //     st.push(10);
    //     System.out.println(st + "->" + st.peek() + " " + st.size());
    //     st.push(20);
    //     System.out.println(st + "->" + st.peek() + " " + st.size());
    //     st.push(30);
    //     System.out.println(st + "->" + st.peek() + " " + st.size());
    //     st.push(40);
    //     System.out.println(st + "->" + st.peek() + " " + st.size());
    //     st.pop();
    //     System.out.println(st + "->" + st.peek() + " " + st.size());
    //     st.pop();
    //     System.out.println(st + "->" + st.peek() + " " + st.size());
    //     st.pop();
    //     System.out.println(st + "->" + st.peek() + " " + st.size());
    //     st.pop();
    //     System.out.println(st + "->" + st.size());
    // }

    // Duplicate Brackets
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     String str = scn.nextLine();
        
    //     Stack<Character> st = new Stack<>();
    //     for(int i = 0; i < str.length(); i++){
    //         char ch = str.charAt(i);
    //         if(ch == ')'){
    //             if(st.peek() == '('){
    //                 System.out.println(true);
    //                 return;
    //             } else {
    //                 while (st.peek() != '(') {
    //                     st.pop();
    //                 }
    //                 st.pop();
    //             }
    //         } else {
    //             st.push(ch);
    //         }
    //     }
    //     System.out.println(false);
    // }

    // Balance Brackets
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     String str = scn.nextLine();

    //     Stack<Character> st = new Stack<>();
    //     for(int i = 0; i < str.length(); i++){
    //         char ch = str.charAt(i);
    //         if(ch == '(' || ch == '{' || ch == '['){
    //             st.push(ch);
    //         } else if (ch == ')') {
    //             boolean val = handleClosing(st, '(');
    //             if(val == false){
    //                 System.out.println(val);
    //                 return;
    //             }
    //         } else if (ch == '}') {
    //             boolean val = handleClosing(st, '{');
    //             if(val == false){
    //                 System.out.println(val);
    //                 return;
    //             }
    //         } else if (ch == ']') {
    //             boolean val = handleClosing(st, '[');
    //             if(val == false){
    //                 System.out.println(val);
    //                 return;
    //             }
    //         }
    //     }
    //     if(st.size() != 0){
    //         System.out.println(false);
    //     } else {
    //         System.out.println(true);
    //     }
    // }
    
    // public static boolean handleClosing(Stack<Character> st, char corroch){
    //     if(st.size() == 0) {
    //         return false;
    //     } else if(st.peek() != corroch){
    //         return false;
    //     } else {
    //         st.pop();
    //         return true;
    //     }
    // }

    

}
