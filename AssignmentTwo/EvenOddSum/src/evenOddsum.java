import java.util.Scanner;

public class evenOddsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0, sum2 = 0;
		for(int i = 0 ;i<5 ; i++) {
			System.out.println("enter the numbers:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0) {
			sum1 = sum1 + num;
		}
		
		else {
			sum2 = sum2 + num;
		}
		
	

	}
		System.out.println("sum of even numbers: " +sum1);
		System.out.println("sum of odd numbers:"  +sum2);
	}
}

