import java.util.Scanner;

public class MeterToFeet
{
    public static void main(String[] args)
    {
    Scanner me = new Scanner(System.in);
    System.out.print("Enter value in meter:");
    double meter = me.nextDouble();
    double feet = meter*3.281;
    System.out.print("VALUE IN FEET :" + feet);
    }
}