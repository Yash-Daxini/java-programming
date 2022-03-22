import java.util.Scanner;

public class Fibonacci {
    static int fib(int n){
        if(n == 1 || n == 2 ){
            return n-1;
        }
        else{
            return fib(n-2) + fib(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(fib(i) + " ");
            i++;
        }
    }
}
