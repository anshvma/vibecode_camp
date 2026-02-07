package LearnJava;

// import java.util.*;
// import java.io.*;

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

    //Postfix Evaluation
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String exp = br.readLine();

    //     Stack<String> prefix = new Stack<>();
    //     Stack<String> infix = new Stack<>();
    //     Stack<Integer> valstk = new Stack<>();

    //     for(int i = 0; i < exp.length(); i++){
    //         char ch = exp.charAt(i);

    //         if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
    //             int v2 = valstk.pop();
    //             int v1 = valstk.pop();
    //             int val = operation(v1, v2, ch);
    //             valstk.push(val);

    //             String iv2 = infix.pop();
    //             String iv1 = infix.pop();
    //             String ival = "(" + iv1 + ch + iv2 + ")";
    //             infix.push(ival);

    //             String pv2 = prefix.pop();
    //             String pv1 = prefix.pop();
    //             String pval = ch + pv1 + pv2;
    //             prefix.push(pval);
    //         } else{
    //             valstk.push(ch - '0');
    //             prefix.push(ch + "");
    //             infix.push(ch + "");
    //         }
    //     }

    //     System.out.println(valstk.pop());
    //     System.out.println(infix.pop());
    //     System.out.println(prefix.pop());
    // }
    // public static int operation(int v1, int v2, char op){
    //     if(op == '+'){
    //         return v1 + v2;
    //     } else if (op == '-'){
    //         return v1 - v2;
    //     } else if (op == '*'){
    //         return v1 * v2;
    //     } else {
    //         return v1 / v2;
    //     }
    // }

    //prefix Evaluation
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String exp = br.readLine();

        // Stack<String> ifix = new Stack<>();
        // Stack<String> pfix = new Stack<>();
        // Stack<Integer> vals = new Stack<>();

        // for(int i = exp.length() - 1; i >= 0; i--){
        //     char ch = exp.charAt(i);
        //     if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
        //         int v1 = vals.pop();
        //         int v2 = vals.pop();
        //         int val = operation(v1, v2, ch);
        //         vals.push(val);

        //         String iv1 = ifix.pop();
        //         String iv2 = ifix.pop();
        //         String ival = "(" + iv1 + ch + iv2 + ")";
        //         ifix.push(ival);

        //         String pv1 = pfix.pop();
        //         String pv2 = pfix.pop();
        //         String pval = pv1 + pv2 + ch;
        //         pfix.push(pval);
        //     } else{
        //         vals.push(ch - '0');
        //         pfix.push(ch + "");
        //         ifix.push(ch + "");
        //     }
        // }

    //     System.out.println(vals.pop());
    //     System.out.println(ifix.pop());
    //     System.out.println(pfix.pop());

    // }
    //  public static int operation(int v1, int v2, char op){
    //     if(op == '+'){
    //         return v1 + v2;
    //     } else if (op == '-'){
    //         return v1 - v2;
    //     } else if (op == '*'){
    //         return v1 * v2;
    //     } else {
    //         return v1 / v2;
    //     }
    // }

    //Celebrity problem
    // public static void main(String[] args) throws Exception{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     int [][] arr = new int[n][n];

    //     for(int x = 0; x < n; x++){
    //         String line = br.readLine();
    //         for(int y = 0; y < n; y++){
    //             arr[x][y] = line.charAt(y) - '0';
    //         }
    //     }
    //     findCelebrity(arr);
    // }

    // public static void findCelebrity(int[][] arr){
    //     Stack<Integer> st = new Stack<>();
    //     for(int i = 0; i < arr.length; i++){
    //         st.push(i);
    //     }

    //     while(st.size() >= 2){
    //         int i = st.pop();
    //         int j = st.pop();

    //         if(arr[i][j] == 1){
    //             //if i knows j -> i is not a celebrity
    //             st.push(j);
    //         } else{
    //             //if i doesn't know j -> j is not a celebrity
    //             st.push(i);
    //         }
    //     }

    //     int pos = st.pop();
    //     for(int i = 0; i < arr.length; i++){
    //         if(i != pos){
    //             if(arr[i][pos] == 0 || arr[pos][i] == 1){
    //                 System.out.println("None");
    //                 return;
    //             }
    //         }
    //     }
    //     System.out.println(pos);
    // }

    //Merge overlapping intervals
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     int[][] arr = new int[n][2];
        
    //     for(int i = 0; i < n; i++){
    //         String line = br.readLine();
    //         arr[i][0] = Integer.parseInt(line.split(" ")[0]);
    //         arr[i][1] = Integer.parseInt(line.split(" ")[1]);
    //     }

    //     mergeOverLapInterwal(arr);
    // }

    // public static void mergeOverLapInterwal(int[][] arr){
    //     Pair[] pairs = new Pair[arr.length];
    //     for(int j = 0; j < arr.length; j++){
    //         pairs[j] = new Pair(arr[j][0], arr[j][1]);
    //     }
    //     Arrays.sort(pairs);
    //     Stack<Pair> st = new Stack<>();
    //     for(int i = 0; i < pairs.length; i++){
    //         if(i == 0){
    //             st.push(pairs[i]);
    //         } else {
    //             Pair top = st.peek();

    //             if(pairs[i].st > top.et){
    //                 st.push(pairs[i]);
    //             } else {
    //                 top.et = Math.max(top.et, pairs[i].et);
    //             }
    //         }
    //     }

    //     Stack<Pair> rs = new Stack<>();
    //     while(st.size() > 0){
    //         rs.push(st.pop());
    //     }

    //     while (rs.size() > 0) {
    //         Pair p = rs.pop();
    //         System.out.println(p.st + " " + p.et);
    //     }
    // }

    // public static class Pair implements Comparable<Pair> {
    //     int st;
    //     int et;

    //     Pair(int st, int et){
    //         this.st = st;
    //         this.et = et;
    //     }

    //     public int compareTo(Pair other){
    //         if(this.st != other.st){
    //             return this.st - other.st;
    //         } else {
    //             return this.et - other.et;
    //         }
    //     }
    // }

    //Smallest number following pattern
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String str = br.readLine();

    //     Stack<Integer> st = new Stack<>();
    //     int num = 1;

    //     for(int i = 0; i < str.length(); i++){
    //         char ch = str.charAt(i);

    //         if(ch == 'd'){
    //             st.push(num);
    //             num++;
    //         } else{
    //             st.push(num);
    //             num++;
    //             while (st.size() > 0) {
    //                 System.out.println(st.pop());
    //             }
    //         }
    //     }
    //     st.push(num);
    //     while (st.size() > 0) {
    //         System.out.println(st.pop());
    //     }
    // }

    



}