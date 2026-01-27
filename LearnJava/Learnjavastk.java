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
    

    //Stock Span
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
    //     int[] span = new int[arr.length];

    //     Stack<Integer> st = new Stack<>();
    //     st.push(0);
    //     span[0] = 1;

    //     for(int i = 1; i < arr.length; i++){
    //         while(st.peek()>0 && arr[i] > arr[st.peek()]){
    //             st.pop();
    //         }
    //         if(st.size() == 0){
    //             span[i] = i + 1;
    //         } else {
    //             span[i] = i - st.peek();
    //         }

    //         st.push(i);
    //     }


    //     return span;
    // }

    //Largest area histogram
    // public static void main(String[] args) throws Exception{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n = Integer.parseInt(br.readLine());
    //     int[] arr = new int[n];
    //     for(int i = 0; i < n; i++){
    //         arr[i] = Integer.parseInt(br.readLine());
    //     }
        
    //     int[] rb = new int[arr.length];
    //     Stack<Integer> st = new Stack<>();
    //     st.push(arr.length - 1);
    //     rb[arr.length - 1] = arr.length;
        
    //     for(int i = arr.length - 2; i >= 0; i--){
    //         while(st.size() > 0 && arr[i] <= arr[st.peek()]){
    //             st.pop();
    //         }
    //         if(st.size() == 0){
    //             rb[i] = arr.length;
    //         } else {
    //             rb[i] = st.peek();
    //         }
    //         st.push(i);
    //     }

    //     int[] lb = new int[arr.length];
    //     st = new Stack<>();
    //     st.push(0);
    //     lb[0] = -1;

    //     for(int i = 1; i < arr.length; i++){
    //         while(st.size() > 0 && arr[i] <= arr[st.peek()]){
    //             st.pop();
    //         }
    //         if(st.size() == 0){
    //             lb[i] = -1;
    //         }else{
    //             lb[i] = st.peek();
    //         }
    //         st.push(i);
    //     }

    //     int MaxArea = 0;
    //     for(int i = 0; i < arr.length; i++){
    //         int width = rb[i] - lb[i] - 1;
    //         int area = arr[i] * width;
    //         if(area > MaxArea){
    //             MaxArea = area;
    //         }
    //     }

    //     System.out.println(MaxArea);
    // }
    
    //Sliding window maximum
    // public static void main(String[] args) throws Exception{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n = Integer.parseInt(br.readLine());
    //     int a[] = new int[n];
    //     for(int i = 0; i< n; i++){
    //         a[i] = Integer.parseInt(br.readLine());
    //     }
    //     int k = Integer.parseInt(br.readLine());

    //     Stack<Integer> st = new Stack<>();
    //     int[] nge = new int[a.length];

    //     st.push(a.length - 1);
    //     nge[a.length - 1] = a.length;

    //     for(int i = a.length - 2; i >= 0; i--){
    //         while(st.size() > 0 && a[i] >= a[st.peek()]){
    //             st.pop();
    //         }

    //         if(st.size() == 0){
    //             nge[i] = a.length;
    //         } else{
    //             nge[i] = st.peek();
    //         }

    //         st.push(i);
    //     }

    //     int j = 0;
    //     for(int i = 0; i <= a.length - k; i++){
    //         if(j < i){
    //             j = i;
    //         }
    //         while(nge[j] < i + k){
    //             j = nge[j];
    //         }

    //         System.out.print(a[j] + " ");
    //     }

    // }
    
    // infix Evaluation
    // public static void main(String[] args) throws Exception{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String exp = br.readLine();

    //     Stack<Integer> opnds = new Stack<>();
    //     Stack<Character> oprtrs = new Stack<>();
    //     for(int i = 0; i < exp.length(); i++){
    //         char ch = exp.charAt(i);

    //         if(ch == '('){
    //             oprtrs.push(ch);
    //         } else if(Character.isDigit(ch)){
    //             opnds.push(ch - '0'); //char to int
    //         } else if(ch == ')'){
    //             while(oprtrs.peek() != '('){
    //                 char oprtr = oprtrs.pop();
    //                 int v2 = opnds.pop();
    //                 int v1 = opnds.pop();

    //                 int opv = operation(v1, v2, oprtr);
    //                 opnds.push(opv);
    //             }
    //             oprtrs.pop();
    //         } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
    //             while(oprtrs.size() > 0 && oprtrs.peek() != '(' && precedence(ch) <= precedence(oprtrs.peek())){
    //                 char oprtr = oprtrs.pop();
    //                 int v2 = opnds.pop();
    //                 int v1 = opnds.pop();

    //                 int opv = operation(v1, v2, oprtr);
    //                 opnds.push(opv);
    //             }
    //             oprtrs.push(ch);
    //         }
    //     }
    //     while(oprtrs.size() != 0){
    //         char oprtr = oprtrs.pop();
    //         int v2 = opnds.pop();
    //         int v1 = opnds.pop();

    //         int opv = operation(v1, v2, oprtr);
    //         opnds.push(opv);
    //     }

    //     System.out.println(opnds.peek());
    // }
    // public static int precedence(char oprtr){
    //     if(oprtr == '+'){
    //         return 1;
    //     } else if (oprtr == '-'){
    //         return 1;
    //     } else if (oprtr == '*'){
    //         return 2;
    //     } else {
    //         return 2;
    //     }
    // }
    // public static int operation(int v1, int v2, char oprtr){
    //     if(oprtr == '+'){
    //         return v1 + v2;
    //     } else if (oprtr == '-'){
    //         return v1 - v2;
    //     } else if (oprtr == '*'){
    //         return v1 * v2;
    //     } else {
    //         return v1 / v2;
    //     }
    // }

    // Infix conversion
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String exp = br.readLine();

    //     Stack<String> post = new Stack<>();
    //     Stack<String> pre = new Stack<>();
        // Stack<Character> ops = new Stack<>();

        // for(int i = 0; i < exp.length(); i++){
        //     char ch = exp.charAt(i);

        //     if(ch == '('){
        //         ops.push(ch);
        //     } else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
        //         post.push(ch + "");
        //         pre.push(ch + "");
        //     } else if(ch == ')'){
        //         while(ops.peek() != '('){
        //             char op = ops.pop();

        //             String postv2 = post.pop();
        //             String postv1 = post.pop();
        //             String postv = postv1 + postv2 + op;
        //             post.push(postv);

        //             String prev2 = pre.pop();
        //             String prev1 = pre.pop();
        //             String prev = op + prev1 + prev2;
        //             pre.push(prev);
        //         }
        //         ops.pop();
        //     } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
        //         while(ops.size() > 0 && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())){
        //             char op = ops.pop();

        //             String postv2 = post.pop();
        //             String postv1 = post.pop();
        //             String postv = postv1 + postv2 + op;
        //             post.push(postv);

        //             String prev2 = pre.pop();
        //             String prev1 = pre.pop();
        //             String prev = op + prev1 + prev2;
        //             pre.push(prev);
        //         }
        //         ops.push(ch);               
        //     }
        // }
        // while(ops.size() > 0){
    //         char op = ops.pop();

    //         String postv2 = post.pop();
    //         String postv1 = post.pop();
    //         String postv = postv1 + postv2 + op;
    //         post.push(postv);

    //         String prev2 = pre.pop();
    //         String prev1 = pre.pop();
    //         String prev = op + prev1 + prev2;
    //         pre.push(prev);
    //     }
    //     System.out.println(post.pop());
    //     System.out.println(pre.pop());
    // }
    // public static int precedence(char optr){
    //     if(optr == '+' || optr == '-'){
    //         return 1;
    //     } else if (optr == '*' || optr == '/'){
    //         return 2;
    //     } else {
    //         return 0;
    //     }
    // }

    




}