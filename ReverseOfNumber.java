import java.util.*;
class ReverseOfNumber{
    public static void main(String[] args){
        System.out.print("ENTER NUMBER:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        while(a != 0){
            rev = rev * 10 + a % 10; 
            a = a / 10;
        }
        System.out.print("Reverse Of Number = "+rev);
    }
}