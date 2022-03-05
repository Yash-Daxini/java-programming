import java.util.*;
class TriangleType{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THREE SIDES OF TRIANGLE:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
        if( a==b && b==c && c==a){
			System.out.println("Equilator Triangle");
		}
		else if(a==b || b==c || a==c) {
			System.out.println("Isoscele Triangle");
		}
        else{
            System.out.println("Scalene Triangle");
        }
		if(((a*a)+(b*b))==c*c || (b*b +c*c)==a*a || ( a*a +c*c) == b*b )
		{
			System.out.println("Right Angle Triangle");
		}
    }
}