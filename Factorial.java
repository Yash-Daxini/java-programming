import java.util.*;
class Factorial{
    public static void main(String[] args){
        System.out.print("ENTER NUMBER:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int fact=1;
        while(i <= a){
            fact = fact * i;
            i++;
        }
        System.out.print("Factorial =  "+fact);
    }
}