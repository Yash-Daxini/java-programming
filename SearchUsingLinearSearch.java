import java.util.*;
class SearchUsingLinearSearch {
    public static void main(String[] args) {
        System.out.print("ENTER SIZE OF ARRAY:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter %d element:",i+1);
            arr[i]=sc.nextInt();
        }
        System.out.print("ENTER ELEMENT YOU WANT TO SEARCH IN ARRAY:");
        int a = sc.nextInt();
        int i,flag = 0;

        for(i = 0 ;i<n;i++){
            if(arr[i] == a){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("Element not found in array");
        }
        else{
            System.out.printf("\nElement is at %d th index",i+1);
        }

    }
}
