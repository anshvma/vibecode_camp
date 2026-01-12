package LearnJava;
import java.util.Scanner;

public class Learnjavafunc {
    // (npr function- permutaion and combinaton)
    // public static int fact(int x) {
    //     int rv = 1;

    //     for(int i = 1; i <= x; i++) {
    //         rv = rv * i;
    //     }

    //     return rv;
    // }

    // public static void main(String[] args) {
    //     Scanner scn_num = new Scanner(System.in);
    //     int n = scn_num.nextInt();
    //     int r = scn_num.nextInt();

    //     int nfact = fact(n);
    //     int nmrfact = fact(n - r);

    //     int npr = nfact / nmrfact;
    //     System.out.println(n + "P" + r + " = " + npr); 
    // }

    // Digit counter
    // public static int digi_count(int n, int x) {
    //     int count = 0;
    //     int div = 0;

    //     while(n > 0){
    //         div = n % 10;
    //         n = n/10;
    //         if(div == x){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int x = scn.nextInt();

    //     int dig_num = digi_count(n, x);
    //     System.out.println(dig_num);
    // }

    // DEcimal to any base
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     System.out.print("Enter the Digit of number you want to covert: ");
    //     int n = scn.nextInt();
    //     System.out.println("Enter the number of Base: ");
    //     int b = scn.nextInt();
    //     int dn = getInBase(n, b);
    //     System.out.println(dn);
    // }
    // public static int getInBase(int n, int b){
    //     int rv = 0;
    //     int p = 1;
    //     while(n > 0) {
    //         int dig = n % b;
    //         n = n/b;
    //         rv += dig * p;
    //         p = p * 10;
    //     }

    //     return rv;
    // }

    //Any baser to decimal
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int n = scn.nextInt();
    //     System.out.println("Enter the base number: ");
    //     int b = scn.nextInt();
    //     int res = getDecimal(n, b);
    //     System.out.println(res);
    // }

    // public static int getDecimal(int n, int b){
    //     int rv = 0;
    //     int p = 1;
    //     while(n > 0){
    //         int dig = n % 10;
    //         n = n/10;
    //         rv += dig * p;
    //         p  = p * b;
    //     }

    //     return rv;
    // }

    //any base to any base
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int b1 = scn.nextInt();
    //     int b2 = scn.nextInt();
    //     int d = any2any(n, b1, b2);
    //     System.out.println(d);
    // }

    // public static int getInBase(int n, int b){
    //     int rv = 0;
    //     int p = 1;
    //     while(n > 0) {
    //         int dig = n % b;
    //         n = n/b;
    //         rv += dig * p;
    //         p = p * 10;
    //     }

    //     return rv;
    // }
    // public static int getDecimal(int n, int b){
    //     int rv = 0;
    //     int p = 1;
    //     while(n > 0){
    //         int dig = n % 10;
    //         n = n/10;
    //         rv += dig * p;
    //         p  = p * b;
    //     }

    //     return rv;
    // }
    // public static int any2any(int n, int b1, int b2) {
    //     int dec = getDecimal(n, b1);
    //     int dn = getInBase(dec, b2);
    //     return dn;
    // }

    // any base addition
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n1 = scn.nextInt();
    //     int b = scn.nextInt();
    //     int n2 = scn.nextInt();

    //     int addn = addAnyBase(n1, b, n2);
    //     System.out.println(addn);
    // }

    // public static int addAnyBase(int n1, int b, int n2){
    //     int rv = 0;
    //     int dig = 0;
    //     int ca = 0;
    //     int p = 1;
    //     while (n2 > 0 || ca > 0){
    //         dig = (n1%10) + (n2%10) + ca;
    //         n1 = n1/10;
    //         n2 = n2/10;
    //         rv += dig%b * p;
    //         ca = dig/b;
    //         p = p * 10;
    //     }
    //     return rv;
        
    // }

    //any Base Subtraction
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n1 = scn.nextInt();
    //     int n2 = scn.nextInt();
    //     int b = scn.nextInt();
    //     int dr = anyBaseSub(n1, n2, b);
    //     System.out.println(dr);
    // }
    // public static int anyBaseSub(int n1, int n2, int b){
    //     int rv = 0;
    //     int dig = 0;
    //     int dig2 = 0;
    //     int c = 0;
    //     int d= 0;
    //     int p = 1;
    //     while(n2 > 0){
    //         dig = n1%10;
    //         dig2 = n2%10;
    //         n1 = n1/10;
    //         n2 = n2/10;
    //         dig = dig + c;
    //         if (dig >= dig2){
    //             c = 0;
    //             d = dig - dig2;
    //         } else{
    //             c = -1;
    //             d = dig + b - dig2;
    //         }
    //         rv += d * p;
    //         p = p * 10;
    //     }

    //     return rv;
    // }

    // //anyBaseMultiplication
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int n2 = scn.nextInt();
    //     int b = scn.nextInt();
    //     int dn = anyBaseMulti(n,n2,b);
    //     System.out.println(dn);
    // }
    // public static int getAddition(int n1, int n2, int b){
    //     int rv = 0;
    //     int dig = 0;
    //     int ca = 0;
    //     int p = 1;
    //     while (n2 > 0 || ca > 0){
    //         dig = (n1%10) + (n2%10) + ca;
    //         n1 = n1/10;
    //         n2 = n2/10;
    //         rv += dig%b * p;
    //         ca = dig/b;
    //         p = p * 10;
    //     }
    //     return rv;
    // }
    // public static int singleDigMulti(int n, int n2, int b){
    //     int rv = 0;
    //     int c = 0;
    //     int p = 1;
    //     while(n > 0 || c > 0){
    //         int dig1 = n%10;
    //         n = n/10;
    //         int multi = dig1 * n2 + c;
    //         c = multi/b;
    //         multi = multi % b;
    //         rv = rv + multi * p;
    //         p = p * 10; 
    //     }
    //     return rv;
    // }
    // public static int anyBaseMulti(int n, int n2, int b){
    //     int rv = 0;
    //     int p = 1;
    //     while (n2 > 0){
    //         int dig2 = n2%10;
    //         n2 = n2/10;
    //         int spv = singleDigMulti(n, dig2, b);
    //         rv = getAddition(rv, spv * p, b);
    //         p = p * 10;
    //     }
    //     return rv;
    // }

    





    


}
