import java.util.*;
class TeleBill{
    public static void main(String[] args){
        System.out.print("ENTER NUMBER OF CALLS:");
        Scanner sc = new Scanner(System.in);
        int call = sc.nextInt();
        float amount = 0f;
        if(call > 200){
            amount += (call-200)*0.4;
             call = call - 200;
            System.out.print(call);
        }
        else if(call > 150 && call <= 200){
            amount += (call-50)*0.5;
            call = call - 50;
            System.out.print(call);
        }
        else if(call > 100 && call <= 150){
            call = call - 50;
            amount += (call-50)*0.6;
            System.out.print(call);
        }
        else if(call <= 100){
            amount = 200;
            System.out.print(call);
        }
        System.out.print("Monthly telephone bill = "+amount);
    }
}