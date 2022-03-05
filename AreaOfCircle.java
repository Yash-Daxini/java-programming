import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args)
    {
        int r;
        double pi = 3.14,area;
        
        Scanner ra = new Scanner(System.in);

        System.out.print("Enter radius of circle:");
        r = ra.nextInt();

        area = pi*r*r;

        System.out.print("Area of circle :"+area);

    }
}