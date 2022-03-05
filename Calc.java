import java.util.*;
class Calc{
    public static void main(String[] args){
        
        // System.out.print("1. SUM 2. SUBTRACTION 3. MULTIPLICATION 4. DIVISION 5.MODULOS 0. EXIT");
        Scanner sc = new Scanner(System.in);
        
        char choice;

        do{
            System.out.print("\nENTER YOUR CHOICE:");
            choice = sc.next().charAt(0);
            System.out.print("\nENTER TWO NUMBERS TO PERFORM OPERATION:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch(choice){
            case '+':
            System.out.print("Sum = "+ (a+b));
            break;
            case '-':
            System.out.print("Subtraction = "+ (a-b));
            break;
            case '*':
            System.out.print("Multiplication = "+ (a*b));
            break;
            case '/':
            System.out.print("Division = "+ (a/b));
            break;
            case '%':
            System.out.print("Modulos = "+ (a%b));
            break;
            case '0' :
            System.exit(0);
            break;
            default :
            System.out.print(" Invalid Input !..");
            break;
        }

        }while(choice != 0);
    }
}