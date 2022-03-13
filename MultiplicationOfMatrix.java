import java.util.*;
public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        System.out.print("ENTER SIZE OF 2-D SQUARE MATRIX:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr1 = new int [n][n];
        int [][] arr2 = new int [n][n];
        int [][] arr3 = new int [n][n];

        System.out.println("\tENTER FIRST MATRIX");
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
            arr1[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\tENTER SECOND MATRIX");
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
            arr2[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        int c = 0;
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                for(int k = 0;k<n;k++){
                    c += arr1[i][k] * arr2[k][j] ;
                }
                arr3[i][j] = c;
                c = 0;
            }
        }

        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr3[i][j]+ "\t");
            }
            System.out.println("");
        }
    }
    
}
