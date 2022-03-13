import java.util.*;
class MatrixOf2DArray {
    public static void main(String[] args) {
        System.out.println("ENTER SIZE OF 2-D ARRAY:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] arr = new int [m][n];
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
            System.out.printf("Enter [%d][%d] element:",i+1,j+1);
            arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
