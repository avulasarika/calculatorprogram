package math;
import java.util.*;

public class calculatorDemo {
	public static void main(String[] args) {
		double n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		n1=sc.nextDouble();
		n2=sc.nextDouble();
		System.out.println("enter an opetaror to perform operation(+,-,*,/,%)");
		char op=sc.next().charAt(0);
		double o=0;
		switch(op) {
		case '+' :
			 o=n1+n2;
			 break;
		case '-' :
			 o=n1-n2;
			 break;
		case '*' :
			 o=n1*n2;
			 break;
		case '/' :
			 o=n1/n2;
			 break;
		case '%' :
			 o=n1%n2;
			 break;
		default :
			System.out.println("you have entered wrong operator");
			break;
			
			
				 
		}
		System.out.println(n1 + " " +op+ " " +n2+ "=" +o);
		
	}

}
