import java.util.Scanner;
public class sumwithDowhile
{
    public static void main(String[] args)
    {
    	int num1,num2;
    	char c;
    	do {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
       System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
       System.out.println("Do you want to still continue y/n");
        c = sc.next().charAt(0);
    	}while(c == 'y' || c == 'Y');
    }
}