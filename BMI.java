import java.util.Scanner;

public class BMI {
public static void main(String[] args)
{
    Scanner b = new Scanner(System.in);

    System.out.print("Enter Weight in pound:");
    double weight = b.nextDouble();

    System.out.print("Enter Height in inches:");
    double height = b.nextDouble();

    double weightKg =weight * 0.45359237;
    double heightMeter = height * 0.0254;

    double BMI = weightKg/(heightMeter*heightMeter);
    System.out.print("BMI =" + BMI);
}

}