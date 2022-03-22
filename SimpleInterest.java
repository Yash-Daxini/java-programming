import java.util.Scanner;
public class SimpleInterest {
    static float interest(float p,float r,float t){
        float sinterest = (p*r*t)/100;
        return sinterest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of p:");
        float p = sc.nextFloat();
        System.out.print("Enter value of q:");
        float r = sc.nextFloat();
        System.out.print("Enter value of r:");
        float t = sc.nextFloat();
        float sinterest = interest(p,r,t);
        System.out.println("Simple Interest = "+sinterest);
    }
}
