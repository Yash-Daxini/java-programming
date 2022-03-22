import java.util.Scanner;

public class SelectionSortInArray {
    static void selection_Sort(int m[]) {
        int temp,current;
        for(int i = 0;i<m.length-1;i++){
            current = i;
            for(int j = i+1;j<m.length;j++){
                if (m[j] < m[current]) {
                    current = j;        
                }
            }
            temp = m[i];
            m[i] = m[current];
            m[current] = temp; 
        }
        System.out.println("Sorted array is");
        for (int i = 0; i < m.length; i++) {
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
        selection_Sort(a);
    }
}
