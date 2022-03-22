import java.util.*;
public class PatternUsingRecursion {
    static void patternOne(int n, char c) {
    if (n > 1) {
        patternOne(n-1, c);
    }        
        for (int i = 1; i <= n; i++) {
                System.out.print(c);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        System.out.print("Enter character:");
        char c = sc.next().charAt(0);
        patternOne(n,c);
        System.out.println("");
    }   
}
