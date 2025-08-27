import java.util.Scanner;

public class gcd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 integers to find their common divisor!");
        int m = input.nextInt();
        int n = input.nextInt();

       GCD(m,n);
       System.out.print("The common divisor of " + m + " and " + n + " is " + GCD(m,n));
    }

    public static int GCD(int m, int n){
        if(m % n == 0){
            return n;
        }else {
            return GCD(n, m%n);
        }
    }
}

