package LearnJava;
// Imports
import java.io.*;
import java.util.*;


public class Learnjavaarr {
    // public static void main(String[] args) {
    //     int[] arr;

    //     arr = new int[5];
    //     arr[0] = 24;
    //     arr[1] = 59;
    //     arr[2] = 37;
    //     arr[3] = 61;
    //     arr[4] = 95;

    //     System.out.println(arr.length);
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.println(arr[i]);
    //     }

    // }

    //span of an array

    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int[] arr = new int[n];

    //     for(int i = 0; i < arr.length; i++){
    //         arr[i] = scn.nextInt();
    //     }

    //     int max = arr[0];
    //     int min = arr[0];
    //     for(int i = 1; i < arr.length; i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }

    //         if(arr[i] < min){
    //             min = arr[i];
    //         }
    //     }

    //     int span = max - min;
    //     System.out.println(span);
    // }

    //Find element in the array
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int[] arr = new int[n];

    //     for(int i = 0; i < arr.length; i++){
    //         arr[i] = scn.nextInt();
    //     }

    //     int find = scn.nextInt();
    //     int idx = -1;

    //     for(int i = 1; i < arr.length; i++){
    //         if(find == arr[i]){
    //             idx = i;
    //             break;
    //         }
    //     }

    //     System.out.println(idx);
    // }

    //Bar Graph
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int[] arr = new int[n];

    //     for(int i = 0; i < arr.length; i++){
    //         arr[i] = scn.nextInt();
    //     }

    //     int max = arr[0];
    //     for(int i = 1; i < arr.length; i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //     }

    //     for(int i = max; i > 0; i--){
    //         for(int j = 0; j < n; j++){
    //             if(arr[j] < i){
    //                 System.out.print("\t");
    //             }else{
    //                 System.out.print("*\t");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //Sum of two array
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int[] arr = new int[n];
    //     for(int i = 0; i < arr.length; i++){
    //         arr[i] = scn.nextInt();
    //     }
    //     int n2 = scn.nextInt();
    //     int[] arr2 = new int[n2];
    //     for(int i = 0; i < arr2.length; i++){
    //         arr2[i] = scn.nextInt();
    //     }

    //     int[] sum = new int[n > n2? n: n2];
    //     int c = 0;

    //     int i = arr.length - 1;
    //     int j = arr2.length - 1;
    //     int k = sum.length - 1;
        
    //     while (k >= 0){
    //         int d = c;

    //         if(i >= 0){
    //             d += arr[i];
    //         }
    //         if(j >= 0){
    //             d += arr2[j];
    //         }
            
    //         c = d / 10;
    //         d = d% 10;
            
    //         sum[k] = d;

    //         i--;
    //         j--;
    //         k--;
    //     }
    //     if(c != 0){
    //             System.out.print(c);
    //         }

    //     for(int val: sum){
    //         System.out.print(val);
    //     }
    // }

    //difference of two arrays
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n1 = scn.nextInt();
    //     int[] arr1 = new int[n1];

    //     for(int i = 0; i < arr1.length; i++){
    //         arr1[i] = scn.nextInt();
    //     }
    //     int n2 = scn.nextInt();
    //     int[] arr2 = new int[n2];
    //     for(int i = 0; i < arr2.length; i++){
    //         arr2[i] = scn.nextInt();
    //     }

    //     int[] arr3 = new int[n2]; //assumtion that number n2 is greater

    //     int c = 0;
    //     int i = arr1.length - 1;
    //     int j = arr2.length - 1;
    //     int k = arr3.length - 1;

    //     while(k >= 0){
    //         int d= 0;
    //         int a1v = i >= 0? arr1[i]: 0;
    //         if(arr2[j] + c >= a1v){
    //             d = arr2[j] + c - a1v;
    //             c = 0;
    //         } else {
    //             d = arr2[j] + c + 10 - a1v;
    //             c = -1;
    //         }

    //         arr3[k] = d;

    //         i--;
    //         j--;
    //         k--;
    //     }
    //     int idx = 0;
    //     while(idx < arr3.length){
    //         if(arr3[idx] == 0){
    //             idx++;
    //         } else {
    //             break;
    //         }
    //     }
    //     while(idx < arr3.length){
    //         System.out.print(arr3[idx]);
    //         idx++;
    //     }
    // }

    


}
