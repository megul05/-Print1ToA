package Print1ToA;

import java.util.Scanner;

public class Print1ToA {
	
	public static void printNum(int number)
	{
		if(number == 1)
		{
			System.out.println(1 + " ");
			return;
		}
		printNum(number-1);
		System.out.println(number + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		printNum(number); 

	}

}
