import java.util.*;
class LargestNumberUsingConditional{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = a > b ? ( a > c ? a : c ) : ( b > c ? b : c );

		System.out.println(max + " is MAX");
    }
}