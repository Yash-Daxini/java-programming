import java.util.Scanner;

class AdditionOfTwoNumbers {
public static void main(String[] args)
{
    int a,b,sum;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number:");
    a = in.nextInt();

    System.out.print("Enter second number:");
    b = in.nextInt();

    sum = a+b;
    System.out.print("Sum of two numbers: "+sum);
}

}