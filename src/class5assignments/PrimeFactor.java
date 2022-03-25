package class5assignments;

import java.util.Scanner;

public class PrimeFactor {
	
	public static void main(String[] args)
	{
		int num=0,i=2;
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the numbner to check the prime factors ");
		 num=s.nextInt();
		
		while(num >1)
		{
			if(num%i==0)
			{
				System.out.println(" " + i);
				num=num/i;
			}
			else
				{
				i++;
				}
			
		}
	}
}
		
		
		
		



















