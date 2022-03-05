import java.util.*;
class SumOfSeries{
    public static void main(String[] args){
        System.out.print("ENTER NUMBER:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        float sum=0;
        while(i <= n){
            sum = sum + 1/i;
            i++;
        }
        
        System.out.print("Sum = "+sum);

        /*while(i <= n){
            if(i == n){
            System.out.print("1/"+i);
            }
            else{
            System.out.print("1/"+i+" + ");
            }
            i++;
        }*/
        
    }
}