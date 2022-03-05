import java.util.*;
class SumOfEOPN{
    public static void main(String[] args){
        int i,choice,n;
        int psum,nsum;
        do{
            System.out.print("ENTER VALUE OF n:");
            Scanner sc = new Scanner(System.in);
            i=0;
            psum = 0;
            nsum = 0;
            n = sc.nextInt();
            while(i < n){
                System.out.print("Enter number:") ;
                int a = sc.nextInt();
                if(a > 0)
                {
                    psum += a;
                }
                else if(a < 0){
                    nsum += a;
                }
                i++;
            }
        System.out.print("Sum of positive numbers = "+psum);
        System.out.print("\nSum of negative numbers = "+nsum);
        System.out.print("\nPress 0 for Exit and 1 for continue:");
        choice = sc.nextInt();
        }while(choice != 0);
    }
}