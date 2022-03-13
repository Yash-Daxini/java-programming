import java.util.*;
public class SumOfRowsAndColumnsOf2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [4][4];
        int [] srow = new int [4];
        int [] scolumn = new int [4];
        System.out.println("\tENTER FIRST MATRIX");
        for(int i=0;i<4;i++){
            for(int j = 0;j<4;j++){
            System.out.printf("Enter [%d][%d] element:",i+1,j+1);
            arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<4;i++){
            for(int j = 0;j<4;j++){
            srow[i] += arr[i][j];
            }
        }

        for(int j=0;j<4;j++){
            for(int i = 0;i<4;i++){
            scolumn[j] += arr[i][j];
            }
        }

        for(int i = 0;i<4;i++){
            System.out.println("Sum of "+(i+1)+" row = "+srow[i]);
        }
        for(int i = 0;i<4;i++){
            System.out.println("Sum of "+(i+1)+" column = "+scolumn[i]);
        }
    }
}
