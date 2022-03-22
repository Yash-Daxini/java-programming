import java.util.*;

class Pattern {
    static void patternOne(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    static void patternTwo(int n,char c){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    static void patternThree(int n,char c){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    static void patternFour(int n,char c){
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    static void patternFive(int n,char c){
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void patternSix(int n,char c){
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(c);
            }
            System.out.println("");
        }
        for(int i=n-1;i>=1;i--){
            for(int k=n-i;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    static void patternSeven(int n,char c){
        for(int i=n;i>=1;i--){
            for(int k=n-i;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void patternEight(int n,char c){
        for(int i=1;i<=n;i++){
            for(int k =n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j == 1 || j == i || i == n){
                    System.out.print(c);
                    System.out.print(" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    static void patternNine(int n,char c){
        for(int i=1;i<=n;i++){
            for(int k =n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j == 1 || j == i){
                    System.out.print(c);
                    System.out.print(" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for(int i=n-1;i>=1;i--){
            for(int k =n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j == 1 || j == i){
                    System.out.print(c);
                    System.out.print(" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        System.out.print("Enter character:");
        char c = sc.next().charAt(0);
        patternOne(n,c);
        System.out.println("");
        patternTwo(n,c);
        System.out.println("");
        patternThree(n,c);
        System.out.println("");
        patternFour(n,c);
        System.out.println("");
        patternFive(n,c);
        System.out.println("");
        patternSix(n,c);
        System.out.println("");
        patternSeven(n,c);
        System.out.println("");
        patternEight(n,c);
        System.out.println("");
        patternNine(n,c);
        System.out.println("");
    }
}