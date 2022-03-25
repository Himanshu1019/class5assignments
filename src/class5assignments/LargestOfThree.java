package class5assignments;

import java.util.Scanner;

public class LargestOfThree {
	int n1,n2,n3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a  first number ::" );
	      int n1 = sc.nextInt();
	      System.out.println("Enter a  first number ::" );
	      int n2 = sc.nextInt();
	      System.out.println("Enter a  first number ::" );
	      int n3 = sc.nextInt();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
	}

}
