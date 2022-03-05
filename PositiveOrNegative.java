import java.util.Scanner;
class PositiveOrNegative{
    public static void main(String[] args){
        int a;
        System.out.print("Enter any number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a > 0){
            System.out.println("Number is Positive");
        }
        else if(a == 0){
            System.out.println("Number is Zero");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
}