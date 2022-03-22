import java.util.Scanner;
public class MaximumNumberFromTwoNum {
    static int maxi(int a,int b){
        if(a > b){
            return a;
        }
        else {
            return b;
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = maxi(a,b);
        System.out.println("Maximum Number = " + max);
    }
}
