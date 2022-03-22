import java.util.Scanner;

public class Gcd {
    static void gcd(int n1,int n2){
        int [] arr1 = new int[15];
        int j = 0;
        int l;
        if(n1>n2){
            l = n1;
        }
        else{
            l = n2;
        }
        for(int i =1;i<=l;i++){
            if(n1%i==0 && n2%i==0){
               arr1[j] = i;
               j++; 
            }
        }
        int max = arr1[0];;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        System.out.print("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        gcd(n1,n2);
    }
    
}
