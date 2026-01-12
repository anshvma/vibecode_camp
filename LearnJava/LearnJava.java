package LearnJava;
import java.util.Scanner; //using all package may can cause runtime error

public class LearnJava {

    public static void main(String[] args) {

        Scanner scn_num = new Scanner(System.in);

        // int a = 5;
        // int b = 3;
        // int fsum = a + b;

        // System.out.print("The sum of " + a + " and " + b + " is " + fsum);

        
        // for loop for star triangle
        // for (int i=0; i<=5; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }

        
        // Z-pattern test
        // System.out.println("*****");
        // for (int i=2; i<=5; i++) {
        //     System.out.print(" ");
        //     for (int j=3; j<i; j++) {
        //         System.out.println("*");
        //     }
        // }
        // System.out.println("*****");


        // input method
        // Scanner scn = new Scanner(System.in);
        // int n = Integer.parseInt(scn.nextLine()); //scn.nextInt(); //(for only integer)
        // String name = scn.nextLine();
        // System.out.println("Dear " + name + ", here is your desiered numbers: ");
        
        // for (int i = 0; i <= n; i++) {
        //     System.out.println(i);
        // }

        // is number prime
        // Scanner scn_num = new Scanner(System.in);
        // int user_num = scn_num.nextInt();
        // for (int i = 0; i < user_num; i++) {
        //    int n = scn_num.nextInt();
            
        //    int count = 0;
        //    for (int div = 2; div * div <= n; div++) {
        //     if (n % div == 0){
        //         count++;
        //         break;
        //     }
        //    }
        //    if (count == 0) {
        //     System.out.println("Is prime");
        //    }
        //    else {
        //     System.out.println("Not prime");
        //    }
        // }

        // print all the prime number till n
        // int x_num = scn_num.nextInt();
        // int y_num = scn_num.nextInt();
        // while (x_num < y_num) {
        //     int count = 0;
        //     x_num++;
        //     for (int div = 2; div * div <= x_num; div++) {
        //         if (x_num % div == 0) {
        //             count++;
        //             break;
        //         }
        //     }
        //     if (count == 0) {
        //         System.out.println(x_num);
        //     }
        // }

        // fibonacci series
        // int series_num = scn_num.nextInt();
        // int x_num = 0;
        // int y_num = 1;
        // for (int i = 0; i < series_num; i++) {
        //     System.out.println(x_num);
        //     int fib_s = x_num + y_num;
        //     x_num = y_num;
        //     y_num = fib_s;
        // }


        // count of a digit
        // Scanner scn_num = new Scanner(System.in);
        // int series_num = scn_num.nextInt();
        
        // int dig = 0;
        // while (series_num != 0){
        //     series_num = series_num / 10;
        //     dig++;
        // }
        // System.out.println(dig);


        //digit of number in line
        // Scanner scn_num = new Scanner(System.in);
        // int series_num = scn_num.nextInt();

        // int divsor = 0; 
        // int temp = series_num;
        // while (temp != 0) {
        //     temp = temp / 10;
        //     divsor++;
        // }
        // int div = (int)Math.pow(10, divsor - 1);
        // while (div != 0) {
        //     int q = series_num / div;
        //     System.out.println(q);
        //     series_num = series_num % div;
        //     div = div/10;
        // }


        // Reverse numbers
        // int series_num = scn_num.nextInt();
        
        // while (series_num > 0){
        //     int q = series_num % 10;
        //     series_num = series_num / 10;
        //     System.out.println(q);
        // }

        // inverse number
        // int read_num = scn_num.nextInt();
        // int inv = 0;
        // int op = 1;

        // while (read_num != 0) {
        //     int od = read_num % 10;
        //     int id = op;
        //     int ip = od;

        //     inv = inv + id * (int)Math.pow(10, ip - 1);

        //     read_num = read_num / 10;
        //     op++;
        // }
        // System.out.println(inv);

        // Rotate a number
        // int read_num = scn_num.nextInt();
        // int Nrotation = scn_num.nextInt();

        // int temp = read_num;
        // int nod = 0;
        // while (temp > 0) {
        //     temp = temp / 10;
        //     nod++;
        // }

        // Nrotation = Nrotation % nod;
        // if (Nrotation < 0) {
        //     Nrotation = Nrotation + nod; 
        // }

        // int div = 1;
        // int mult = 1;
        // for (int i = 1; i <= nod; i++) {
        //     if (i < Nrotation) {
        //         div = div * 10;
        //     } else {
        //         mult = mult * 10;
        //     }
        // }

        // int q = read_num / div;
        // int r = read_num % div;

        // int Rotate = r * mult + q;
        // System.out.println(Rotate);



        // GCD(HCF) and LCM
        // int num1 = scn_num.nextInt();
        // int num2 = scn_num.nextInt();

        // int on1 = num1;
        // int on2 = num2;
        // while (on1 % on2 != 0) {
        //     int rem = on1 % on2;
        //     on1 = on2;
        //     on2 = rem;
        // }
        // int gcd = on2;
        // int lcm = (num1 * num2) / gcd;

        // System.out.println(gcd);
        // System.out.println(lcm);

        // Prime factorization
        // int n = scn_num.nextInt();

        // for(int div = 2; div * div <= n; div++) {
        //     while(n % div == 0) {
        //         n = n / div;
        //         System.out.print(div + " ");
        //     }
        // }

        // if (n != 0) {
        //     System.out.print(n);
        // }

        // pythagoras triplets
        // int a = scn_num.nextInt();
        // int b = scn_num.nextInt();
        // int c = scn_num.nextInt();

        // int max = a;
        // if (b >= max) {
        //     max = b;
        // }

        // if (c >= max) {
        //     max = c;
        // }

        // if (max == a) {
        //     boolean flag = ((b * b + c * c) == (a * a));
        //     System.out.println(flag);
        // } else if(max == b) {
        //     boolean flag = ((a * a + c * c) == (b * b));
        //     System.out.println(flag);
        // } else {
        //     boolean flag = ((a * a + b * b) == (c * c));
        //     System.out.println(flag);

        // }


        // Benjamin bulb (perfect square)
        // int n = scn_num.nextInt();

        // for (int i = 1; i * i <= n; i++) {
        //     System.out.println(i * i);
        // }


        //pattern 1
        // int n = scn_num.nextInt();
        // for (int i = 1; i <= n; i++){
        //     for (int j = 0; j <i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //pattern 2
        // int n = scn_num.nextInt();
        // for(int i = n; i >= 1; i--) {
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //pattern 3
        // int n = scn_num.nextInt();
        // int sp = n - 1;
        // int st = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int s = 1; s <= st; s++) {
        //     System.out.print("*");
        //     }
        //     System.out.println();
        //     sp--;
        //     st++;
        // }

        //pattern 4
        // int n =scn_num.nextInt();
        // int sp = 0;
        // int st = n + 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int s = 1; s < st; s++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     st--;
        //     sp++;
        // }

        //pattern 5
        // int n = scn_num.nextInt();
        // int st = 1;
        // int sp = n/2;
        // for (int i = 1; i <= n; i++) {

        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int s = 0; s < st; s++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        //     if (i <= n/2) {
        //         sp--;
        //         st+=2;
        //     } else {
        //         sp++;
        //         st-=2;
        //     }
        // }


        // pattern 6
        // int n = scn_num.nextInt();
        // int sp = 1;
        // int st = n/2 + 1;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        //     if (i <= n/2) {
        //         sp+=2;
        //         st--;
        //     } else {
        //         sp-=2;
        //         st++;
        //     }
        // }

        // pattern 7
        // int n = scn_num.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == j) {
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }
        

        // pattern 8
        // int n = scn_num.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = n; j >= 0; j--) {
        //         if (i == j) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //pattern 9
        // int n = scn_num.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i==j || i + j == n + 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //pattern 10
        // int n = scn_num.nextInt();
        // int os = n/2;
        // int is = -1;

        // for (int i = 1; i <= n; i++) {

        //     for (int j = 1; j <= os; j++) {
        //         System.out.print(" ");
        //     }
        //     System.out.print("*");

        //     for (int j = 1; j <= is; j++) {
        //         System.out.print(" ");
        //     }

        //     if(i > 1 && i < n) {
        //         System.out.print("*");
        //     }

        //     if (i <=  n/2) {
        //         os--;
        //         is += 2;
        //     } else {
        //         os++;
        //         is -= 2;
        //     }
        //     System.out.println();
        // }

        //pattern 11
        // int n = scn_num.nextInt();
        // int s = 0;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         s++;
        //         System.out.print(s + " ");
        //     }
        //     System.out.println();
        // }
        

        //pattern 12
        // int n = scn_num.nextInt();
        // int x = 0;
        // int y = 1;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(x + " ");
        //         int fib_s = x + y;
        //         x = y;
        //         y = fib_s;
        //     }
        //     System.out.println();
        // }

        //pattern 13 (pemutation and combination)
        // int n = scn_num.nextInt();

        // for(int i = 0; i < n; i++) {
        //     int icj = 1;
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print(icj + " ");
        //         int icj1 = icj * (i - j) / (j +1);
        //         icj = icj1;
        //     }
        //     System.out.println();
        // }

        //pattern 14
        // int n = scn_num.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     int v = n * i;
        //     System.out.println(n + "*" + i + "=" + v);
        // }

        // pattern 15
        // int n = scn_num.nextInt();
        // int sp = n/2;
        // int st = 1;
        // int x = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print(" ");
        //     }
        //     int xcol = x;
        //     for ( int j = 1; j <= st; j++){
        //         System.out.print(xcol);
        //         if (j <= st/2) {
        //             xcol++;
        //         } else {
        //             xcol--;
        //         }
        //     }
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        //     if (i <= n/2) {
        //         sp--;
        //         st+=2;
        //         x++;
        //     } else {
        //         sp++;
        //         st-=2;
        //         x--;
        //     }
        // }

        //pattern 16
        // int n = scn_num.nextInt();
        // int sp = 2 * n - 3;
        // int st = 1;
        // for (int i = 1; i <= n; i++) {
        //     int count = 1;
        //     for (int s = 1; s <= st; s++) {
        //         System.out.print(count);
        //         count++;

        //     }
        //     for (int g = 1; g <= sp; g++) {
        //         System.out.print(" ");
        //     }
        //     if (i == n){
        //         st--;
        //         count--;
        //     }
        //     for (int s = 1; s <= st; s++) {
        //         count--;
        //         System.out.print(count);
        //     }
        //     System.out.println();
        //     sp -= 2;
        //     st++;
        // }

        //pattern 17
        // int n = scn_num.nextInt();
        // int st = 1;
        // int sp = n/2;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         if (i == n / 2 + 1) {
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        //     if (i <= n/2) {
        //         st++;
        //     } else {
        //         st--;
        //     }
        // }

        //pattern 18
        // int n = scn_num.nextInt();
        // int sp = 0;
        // int st = n;

        // for (int i = 1; i <= n + 1; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("\t");
        //     }
        //     for (int j = 1; j <= st; j++) {
        //         if (i > 1 && i <= n/2 && j > 1 && j < st) {
        //             System.out.print("\t");
        //         } else {
        //             System.out.print("*\t");
        //         }
        //     }
        //     System.out.println();
        //     if (i < n/2) {
        //         sp++;
        //         st -= 2;
        //     } else {
        //         sp--;
        //         st += 2;
        //     }
        //     if (i == n/2 || i == n/2 + 1) {
        //         sp = n/2;
        //         st = 1;
        //     } 
            
        // }

        //pattern 19
        // int n = scn_num.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if(i == 1) {
        //             if(j == n || j <= n / 2 + 1) {
        //                 System.out.print("*");
        //             } else {
        //                 System.out.print(" ");
        //             }
        //         } else if(i <= n / 2) {
        //             if(j == n ||j == n / 2 + 1) {
        //                 System.out.print("*");
        //             } else {
        //                 System.out.print(" ");
        //             }
        //         } else if(i == n/2 + 1) {
        //             System.out.print("*");
        //         } else if(i < n) {
        //             if(j == 1 || j == n/2 + 1) {
        //                 System.out.print("*");
        //             } else {
        //                 System.out.print(" ");
        //             }
        //         }else {
        //             if(j == 1 || j >= n/2 + 1) {
        //                 System.out.print("*");
        //             } else {
        //                 System.out.print(" ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }

        //pattern 20
        // int n = scn_num.nextInt();
        
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (j == 1 || j == n) {
        //             System.out.print("*\t");
        //         } else if (i > n/2 && (i == j || i + j == n + 1)) {
        //                 System.out.print("*\t");
        //         } else {
        //                 System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }






    }




}