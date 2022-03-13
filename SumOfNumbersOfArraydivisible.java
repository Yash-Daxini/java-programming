import java.util.*;
class SumOfNumbersOfArraydivisible {
    public static void main(String[] args) {
        System.out.print("ENTER SIZE OF ARRAY:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int sum =0;

        for(int i=0;i<n;i++){
            System.out.printf("Enter %d element:",i+1);
            arr[i]=sc.nextInt();
            
            if(arr[i] % 5 == 0 || arr[i] % 3 == 0){
                sum = sum + arr[i];
            }
        }
        System.out.println("SUM OF NUMBERS WHICH ARE EITHER DIVISIBLE BY 3 OR 5 = "+ sum);
    }
}
