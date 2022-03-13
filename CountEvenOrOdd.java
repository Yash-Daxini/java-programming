import java.util.*;
class CountEvenOrOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int [] arr = new int[n];
        for(int i=0 ; i<n;i++){
            System.out.printf("Enter %d element:",i+1);
            arr[i] = sc.nextInt();

            if(arr[i] % 2 ==0) {
                even++;
            }
            else if(arr[i] % 2 != 0){
                odd++;
            }
        }
        System.out.println("Even numbers = "+even +"\nOdd numbers = "+odd);

    }
}