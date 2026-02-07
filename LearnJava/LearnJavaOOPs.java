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

    





}
