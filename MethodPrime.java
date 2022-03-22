import java.util.*;
public class MethodPrime {
    static int check(int n){    
        int count = 0;
        for(int i = 1;i <= n;i++ ){
            if(n%i ==0){
                count ++;
            }
            if(count > 2){
                break;
            }
        }
        if(count == 2){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.println(check(n));
    }
}
