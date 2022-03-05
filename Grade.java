import java.util.*;
class Grade{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter five subject marks:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();

		float per=(a+b+c+d+e)/5;

		if(per<35){
			System.out.println("fail");
		}
		else if(per >= 35 && per < 45){
			System.out.println("Pass Class");
		}
		else if(per >= 45 && per < 60){
			System.out.println("Second Class");
		}
		else if(per >= 60 && per < 70){
			System.out.println("First Class");
		}
		else{
			System.out.println("Distinction");
		}
    }
}