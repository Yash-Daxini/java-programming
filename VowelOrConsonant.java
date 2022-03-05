import java.util.*;
class VowelOrConsonant{
    public static void main(String[] args)
    {
        char c;
        System.out.print("ENTER ANY CHARACTER:");
        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
        {
            System.out.print("Character is vowel");
        }
        else{
            System.out.print("Character is consonant");
        }

    }
}