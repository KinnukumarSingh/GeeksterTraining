package PerfectSqr;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count_of_factors = 0;
		
		for (int i = 1; i<= num; i=i+1) {
			
			if(num%i == 0) {
				count_of_factors = count_of_factors + 1;
			}
		 
		}
		if (count_of_factors%2 != 0) {
			System.out.println("Number is perfect square");
		}
		else {
			System.out.println("Number is not perfect square");}
	    }   
		

	}

