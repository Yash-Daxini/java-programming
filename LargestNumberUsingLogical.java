import java.util.*;
class LargestNumberUsingLogical{
    public static void main(String[] args)
    {
        int a,b,c;
        System.out.print("ENTER THREE NUMBERS:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if( a > b)
        {
            if( a > c)
            {
                System.out.println("Largest Number is " + a );
            }
            else
            {
                System.out.println("Largest Number is " + c );
            }
        }
        else
        {
            if( b > c)
            {
                System.out.println("Largest Number is " + b );
            }
            else
            {
                System.out.println("Largest Number is " + c );
            }
        }
        

    }
}