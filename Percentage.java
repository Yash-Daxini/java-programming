import java.util.Scanner;

public class Percentage{
    public static void main(String[] args)
    {
        Scanner p = new Scanner(System.in);
        
        System.out.print("Enter five subject marks");
        int a = p.nextInt();
        int b = p.nextInt();
        int c = p.nextInt();
        int d = p.nextInt();
        int e = p.nextInt();

        double per = (a+b+c+d+e)/5;

        System.out.print("Percentage = "+per);
    }
}