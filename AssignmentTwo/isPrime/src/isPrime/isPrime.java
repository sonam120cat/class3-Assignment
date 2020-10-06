package isPrime;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		
		for(int i = 2 ; i<= Math.sqrt(num) ;i++) {
			if(num % i == 0) {
				count = 1;
			}
			
			if(count == 1) {
				System.out.println(num + "is not prime");
			}
			else if(count == 0) {
				System.out.println(num + "is prime");
			}
		}
		
		
		

	}

}
