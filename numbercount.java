package Countnumber;
import java.util.Scanner;
public class numbercount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count = 1;
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			num = num/10;
			count++;
		}
		System.out.print(count);

	}

}
