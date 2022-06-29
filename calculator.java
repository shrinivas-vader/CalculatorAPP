

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		int a,b,c;
		int ch;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.addition\n2.substraction\n3.multiplication\n4.division\n5.exit\n6.percentage");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				System.out.println("Enter your two numbers");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a+b;
				System.out.println(a+"+"+b+"="+c);
				break;
				
			case 2:
				System.out.println("Enter your two numbers");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a-b;
				System.out.println(a+"+"+b+"="+c);
				break;
				
			case 3:
				System.out.println("Enter your two numbers");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a*b;
				System.out.println(a+"+"+b+"="+c);
				break;
				
			case 4:
				System.out.println("Enter your two numbers");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a/b;
				System.out.println(a+"+"+b+"="+c);
				break;
									
					
				default :
					System.out.println("Wrong choice");
			}
			
		}while(ch!=5);
		
	}
}
