package yusuf.com;

import java.util.Scanner;

public class draw_right_triangle {

	public static void main(String[] args) 
	{
		int number,i=0,line=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		number = sc.nextInt();	
		
	
		while(line != number+1) {
			while(i!=line) {
				System.out.print(i+1 + " ");
				i++;
			}
			
			i=0;
			line++;
		System.out.println();
		}
	}
	
}
