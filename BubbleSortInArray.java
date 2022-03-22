import java.util.*;
public class BubbleSortInArray {
    static void bubble_Sort(int m[]){
        for(int i = 0;i<m.length;i++){
            for(int j = i+1;j<m.length;j++){
                if(m[i] > m[j]){
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for(int i = 0;i<m.length;i++){
            System.out.println(m[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n  = sc.nextInt();
        int[] a = new int [n];
        for(int i=0;i<n;i++){
            System.out.format("Enter %d element of array :",i+1);
            a[i] = sc.nextInt();
        }
        bubble_Sort(a);
    }
}
