import java.util.Scanner;

public class Area {
    static double ar(double r){
        double are = Math.PI*r*r;
        return are;
    }
    static float ar(float b,float h){
        float are = (h*b)/2;
        return are;
    }
    static float ar(float a1){
        float are = a1*a1;
        return are;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius:");
        double r = sc.nextDouble();
        System.out.println(ar(r));;
        System.out.print("Enter height and base:");
        float h = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(ar(h,b));;
        System.out.print("Enter one side of square:");
        float a1 = sc.nextFloat();
        System.out.println(ar(a1));;
    }
}
