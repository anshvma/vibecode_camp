package LearnJava;

import java.util.*;
import java.io.*;

public class LearnJavaOOPs {
    //OOPs Intro
    // public static class Person {
    //     int age;
    //     String name;

    //     void saysHi(){
    //         System.out.println(name + " is " + age + " Years old, Says Hi!");
    //     }
        
        //if you not provide constructor java will use its own constructor
        // Person(){
            //constructor
        // }

        //parameterized
    //     Person(int age, String name){
    //         this.age = age;
    //         this.name = name;
    //     }

    // }

    // public static void main(String[] args) {
    //     Person p1 = new Person();
    //     p1.age = 14;
    //     p1.name = "Mohit";
    //     p1.saysHi();

    //     Person p2 = new Person();
    //     p2.age = 16;
    //     p2.name = "Surbhi";
    //     p2.saysHi();

    //     //with constructor
    //     Person p3 = new Person(20, "Ronit");
    //     p3.saysHi();
    // }

    // Swap game
    // public static void main(String[] args) {
    //     Person p1 = new Person();
    //     p1.age = 14;
    //     p1.name = "Anit";
        
    //     Person p2 = new Person();
    //     p2.age = 16;
    //     p2.name = "Bonni";

    //     p1.saysHi();
    //     p2.saysHi();
    //     swap1(p1, p2);
    //     p1.saysHi();
    //     p2.saysHi();
    // }

    // public static void swap1(Person prsn1, Person prsn2){
    //     int age = prsn1.age;
    //     prsn1.age = prsn2.age;
    //     prsn2.age = age;

    //     String name = prsn1.name;
    //     prsn1.name = prsn2.name;
    //     prsn2.name = name;
    // }

    // Build Normal Stack
    // public static class CustomStack{
    //     int[] data;
    //     int tos;

    //     public CustomStack(int cap){
    //         data = new int[cap];
    //         tos = -1;
    //     }

    //     int size() {
    //         return tos + 1;
    //     }

    //     void display() {
    //         for(int i = tos; i >= 0; i--){
    //             System.out.print(data[i] + " ");
    //         }
    //         System.out.println();
    //     }

    //     void push(int val) {
    //         if(tos == data.length - 1){
    //             System.out.println("Stack Overflow");
    //         } else{
    //             tos++;
    //             data[tos] = val;
    //         }
    //     }

    //     int pop() {
    //         if(tos == -1){
    //             System.out.println("Stack Underflow");
    //             return -1;
    //         } else {
    //             int val = data[tos];
    //             tos--;
    //             return val;
    //         }
    //     }

    //     int top() {
    //         if(tos == -1){
    //             System.out.println("Stack Underflow");
    //             return -1;
    //         } else {
    //             int val = data[tos];
    //             return val;
    //         }
    //     }
    // }
    
    
    
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     CustomStack st = new CustomStack(n);

    //     String str = br.readLine();
    //     while(str.equals("quit") == false){
    //         if(str.startsWith("push")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             st.push(val);
    //         } else if(str.startsWith("pop")){
    //             int val = st.pop();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("top")){
    //             int val = st.top();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("size")){
    //             System.out.println(st.size());
    //         } else if(str.startsWith("display")){
    //             st.display();
    //         }
    //         str = br.readLine();
    //     }
    // }

    //dynamic Stack
    // public static class CustomStack{
    //     int[] data;
    //     int tos;

    //     public CustomStack(int cap){
    //         data = new int[cap];
    //         tos = -1;
    //     }

    //     int size() {
    //         return tos + 1;
    //     }

    //     void display() {
    //         for(int i = tos; i >= 0; i--){
    //             System.out.print(data[i] + " ");
    //         }
    //         System.out.println();
    //     }

    //     void push(int val) {
    //         if(tos == data.length - 1){
    //             int[] ndata = new int[2 * data.length];
    //             for(int i = 0; i < data.length; i++){
    //                 ndata[i] = data[i];
    //             }
    //             data = ndata;

    //             tos++;
    //             data[tos] = val;
    //         } else{
    //             tos++;
    //             data[tos] = val;
    //         }
    //     }

    //     int pop() {
    //         if(tos == -1){
    //             System.out.println("Stack Underflow");
    //             return -1;
    //         } else {
    //             int val = data[tos];
    //             tos--;
    //             return val;
    //         }
    //     }

    //     int top() {
    //         if(tos == -1){
    //             System.out.println("Stack Underflow");
    //             return -1;
    //         } else {
    //             int val = data[tos];
    //             return val;
    //         }
    //     }
    // }
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     CustomStack st = new CustomStack(n);

    //     String str = br.readLine();
    //     while(str.equals("quit") == false){
    //         if(str.startsWith("push")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             st.push(val);
    //         } else if(str.startsWith("pop")){
    //             int val = st.pop();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("top")){
    //             int val = st.top();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("size")){
    //             System.out.println(st.size());
    //         } else if(str.startsWith("display")){
    //             st.display();
    //         }
    //         str = br.readLine();
    //     }
    // }

    //Minimum Stack
    // public static class minStack {
    //     Stack<Integer> allData;
    //     Stack<Integer> minData;

    //     public minStack() {
    //         allData = new Stack<>();
    //         minData = new Stack<>();
    //     }

    //     int size() {
    //         return allData.size();
    //     }

    //     void push(int val){
    //         allData.push(val);

    //         if(minData.size() == 0 || val <= minData.peek()){
    //             minData.push(val);
    //         }
    //     }

    //     int pop(){
    //         if(size() == 0){
    //             System.out.println("Stack Underflow");
    //             return -1;
    //         } else {
    //             int val = allData.pop();

    //             if(val == minData.peek()){
    //                 minData.pop();
    //             }
    //             return val;
    //         }
    //     }

    //     int top(){
    //         if(size() == 0){
    //             System.out.println("Stack Underflow");
    //             return -1;
    //         } else {
    //             return allData.peek();
    //         }
    //     }

    //     int min(){
    //         if(size() == 0){
    //             System.out.println("Stack Underflow");
    //             return -1;
    //         } else {
    //             return minData.peek();
    //         }
    //     }
        
    // }

    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     minStack st = new minStack();

    //     String str = br.readLine();
    //     while(str.equals("quit") == false){
    //         if(str.startsWith("push")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             st.push(val);
    //         } else if(str.startsWith("pop")){
    //             int val = st.pop();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("top")){
    //             int val = st.top();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("size")){
    //             System.out.println(st.size());
    //         } else if(str.startsWith("min")){
    //             int val = st.min();
    //             System.out.println(val);
    //         }
    //         str = br.readLine();
    //     }
    // }

    //MinStack-2
    // public static class minStack {
    //     Stack<Integer> data;
    //     int min;

    //     public minStack() {
    //         data = new Stack<>();
    //     }

    //     int size() {
    //         return data.size();
    //     }

    //     void push(int val){
    //         if(data.size() == 0){
    //             data.push(val);
    //             min = val;
    //         } else if(val >= min){
    //             data.push(val);
    //         } else{
    //             data.push(val + val - min);
    //             min = val;
    //         }
    //     }

    //     int pop(){
    //         if(size() == 0){
    //             System.out.println("Stack Underflow");
    //             return -1;
    //         } else {
    //             int val = data.pop();

    //             if(data.peek() >= min){
    //                 return data.pop();
    //             } else{
    //                 int ov = min;
    //                 min = 2 * min - data.pop();
    //                 return ov;
    //             }
    //         }
    //     }

    //     int top(){
    //         if(size() == 0){
    //             System.out.println("Stack Underflow");
    //             return -1;
    //         } else {
    //             if(data.peek() >= min){
    //                 return data.peek();
    //             } else{
    //                 return min;
    //             }
    //         }
    //     }

    //     int min(){
    //         if(size() == 0){
    //             System.out.println("Stack Underflow");
    //             return -1;
    //         } else {
    //             return min;
    //         }
    //     }
    // }
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     minStack st = new minStack();

    //     String str = br.readLine();
    //     while(str.equals("quit") == false){
    //         if(str.startsWith("push")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             st.push(val);
    //         } else if(str.startsWith("pop")){
    //             int val = st.pop();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("top")){
    //             int val = st.top();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("size")){
    //             System.out.println(st.size());
    //         } else if(str.startsWith("min")){
    //             int val = st.min();
    //             System.out.println(val);
    //         }
    //         str = br.readLine();
    //     }
    // }

    // Queue Introduction
    // public static void main(String[] args) {
    //     Queue<Integer> que = new ArrayDeque<>();

    //     que.add(10);
    //     que.add(20);
    //     que.add(30);
    //     System.out.println(que);

    //     System.out.println(que.peek());
    //     System.out.println(que);

    //     System.out.println(que.remove());
    //     System.out.println(que);        
    // }

    //Build Normal Queue
    // public static class customQueue {
    // int[] data;
    // int front;
    // int size;

    // public customQueue(int cap){
    //     data = new int[cap];
    //     front = 0;
    //     size = 0;
    // }

    // int size(){
    //     return size;
    // }

    // void display(){
    //     for(int i = 0; i < size; i++){
    //         int idx = (front + i) % data.length;
    //         System.out.print(data[idx] + " ");
    //     }
    //     System.out.println();
    // }

    // void add(int val){
    //     if(size == data.length){
    //         System.out.println("Queue Overflow");
    //     } else {
    //         int rear = (front + size) % data.length;
    //         data[rear] = val;
    //         size++;
    //     }
    // }

    // int remove(){
    //     if(size == 0){
    //         System.out.println("Queue Underflow");
    //         return -1;
    //     } else{
    //         int val = data[front];
    //         front= (front + 1) % data.length;
    //         size--;
    //         return val;
    //     }
    // }

    // int peek(){
    //     if(size == 0){
    //         System.out.println("Queue Underflow");
    //         return -1;
    //     } else{
    //         return data[front];
    //     }
    // }
        
    // }

    // public static void main(String[] args)throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     customQueue qu = new customQueue(n);

    //     String str = br.readLine();
    //     while(str.equals("quit") == false){
    //         if(str.startsWith("add")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             qu.add(val);
    //         } else if(str.startsWith("remove")){
    //             int val = qu.remove();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("peek")){
    //             int val = qu.peek();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("size")){
    //             System.out.println(qu.size());
    //         } else if(str.startsWith("display")){
    //             qu.display();
    //         } else{
    //             System.out.println("Write only given arguments:\n 1)add\n 2)remove\n 3)peek\n 4)size\n 5)display");
    //         }
    //         str = br.readLine();
    //     }
    // }

    // Dynamic Queue
    // public static class customQueue {
    // int[] data;
    // int front;
    // int size;

    // public customQueue(int cap){
    //     data = new int[cap];
    //     front = 0;
    //     size = 0;
    // }

    // int size(){
    //     return size;
    // }

    // void display(){
    //     for(int i = 0; i < size; i++){
    //         int idx = (front + i) % data.length;
    //         System.out.print(data[idx] + " ");
    //     }
    //     System.out.println();
    // }

    // void add(int val){
    //     if(size == data.length){
    //         int [] ndata = new int[2 * data.length];
    //         for(int i = 0; i < size; i++){
    //             int idx = (front + i) % data.length;
    //             ndata[i] = data[idx];
    //         }
    //         data = ndata;
    //         front = 0;

    //         int rear = (front + size) % data.length;
    //         data[rear] = val;
    //         size++;
    //     } else {
    //         int rear = (front + size) % data.length;
    //         data[rear] = val;
    //         size++;
    //     }
    // }

    // int remove(){
    //     if(size == 0){
    //         System.out.println("Queue Underflow");
    //         return -1;
    //     } else{
    //         int val = data[front];
    //         front= (front + 1) % data.length;
    //         size--;
    //         return val;
    //     }
    // }

    // int peek(){
    //     if(size == 0){
    //         System.out.println("Queue Underflow");
    //         return -1;
    //     } else{
    //         return data[front];
    //     }
    // }
        
    // }

    // public static void main(String[] args)throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     customQueue qu = new customQueue(n);

    //     String str = br.readLine();
    //     while(str.equals("quit") == false){
    //         if(str.startsWith("add")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             qu.add(val);
    //         } else if(str.startsWith("remove")){
    //             int val = qu.remove();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("peek")){
    //             int val = qu.peek();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("size")){
    //             System.out.println(qu.size());
    //         } else if(str.startsWith("display")){
    //             qu.display();
    //         } else{
    //             System.out.println("Write only given arguments:\n 1)add\n 2)remove\n 3)peek\n 4)size\n 5)display");
    //         }
    //         str = br.readLine();
    //     }
    // }

    






}
