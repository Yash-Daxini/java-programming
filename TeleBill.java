import java.util.*;
class TeleBill{
    public static void main(String[] args){
        System.out.print("ENTER NUMBER OF CALLS:");
        Scanner sc = new Scanner(System.in);
        int call = sc.nextInt();
        double amount = 0;
        if(call < 100){
            amount = 200;
        }
        else if(call >= 100  && call < 150){
            amount = (call - 100)*0.6 + 200;
            call = 100;
        }
        else if(call >= 150 && call < 200){
            amount = (call - 150)*0.5 + 50 * 0.6 + 200;
            call = 150;
        }
        else if(call >= 200){
            amount = (call - 200) * 0.4+ 50 * 0.5 + 50 * 0.6 + 200;
        }
        System.out.print("Monthly telephone bill ="+amount);
    }
}
