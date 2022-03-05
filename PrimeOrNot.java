import java.util.*;
class PrimeOrNot{
    public static void main(String[] args){
        System.out.print("ENTER NUMBER:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i=1,count=0;
        while(i <= a){
            if(a % i == 0){
                count++;
            }
            i++;
        }
        if(count > 2)
        {
            System.out.print("Not Prime");
        }
        else
        {
            System.out.print("Prime");
        }
    }
}