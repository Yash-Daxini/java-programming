import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args)
    {
        float f,c;
        Scanner fa = new Scanner(System.in);

        System.out.print("Enter value of temperature in farenhit:");
        f = fa.nextFloat();

        c=(f-32)*5/9;
        System.out.print("Temperature in celsius :"+c);
    }
}