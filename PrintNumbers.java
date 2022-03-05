import java.util.*;
class PrintNumbers{
    public static void main(String[] args){
        System.out.print("ENTER TWO NUMBERS:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        while(i <= b){
            if(i % 2 == 0 && i % 3 != 0){
                System.out.print(i+"\n");
            }
            i++;
        }
    }
}