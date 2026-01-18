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

    // Next to the greater element
    // public static void display(int[] a) {
    //     StringBuilder sb = new StringBuilder();

    //     for(int val: a){
    //         sb.append(val + " ");
    //     }
    //     System.out.println(sb);
    // }

    // public static void main(String[] args) throws Exception{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n = Integer.parseInt(br.readLine());
    //     int[] a = new int[n];
    //     for(int i = 0; i < n; i++){
    //         a[i] = Integer.parseInt(br.readLine());
    //     }

    //     int[] nge = solve(a);
    //     display(nge);
    // }

    // public static int[] solve(int[] arr){
    //     int[] nge = new int[arr.length];

    //     Stack<Integer> st = new Stack<>();

    //     st.push(arr.length - 1);
    //     nge[arr.length - 1] = -1;
    //     for(int i = arr.length - 2; i >= 0; i--){
    //         while(st.size() > 0 && arr[i] >= st.peek()){
    //             st.pop();
    //         }

    //         if(st.size() == 0){
    //             nge[i] = -1;
    //         } else {
    //             nge[i] = st.peek();
    //         }

    //         st.push(arr[i]);
    //     }

    //     return nge;
    // }

    // //Alternative approach
    // public static int[] solve(int[] arr){
    //     int[] nge = new int[arr.length];

    //     Stack<Integer> st = new Stack<>();

    //     st.push(0);
    //     for(int i= 1; i < arr.length; i++){
    //         while(st.size() > 0 && arr[i] > arr[st.peek()]){
    //             int pos = st.peek();
    //             nge[pos] = arr[i];
    //             st.pop();
    //         }

    //         st.push(i);
    //     }

    //     while(st.size() > 0){
    //         int pos = st.peek();
    //         nge[pos] = -1;
    //         st.pop();
    //     }
    //     return nge;
    // }
    

    


}
