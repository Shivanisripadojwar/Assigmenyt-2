import java.util.Scanner;

public class Calculator {
	public void cal() {
		System.out.println("Select operations 1. Arithematic 2. Trigonometric");
		Scanner sc= new Scanner(System.in);
		int opt=sc.nextInt( );
		if(opt==1) {
			System.out.println("enter a value");
			int a=sc.nextInt();
			System.out.println("enter b value");
			int b=sc.nextInt();
			System.out.println("enter operation");
			String fun=sc.next();
			switch(fun) {
			case "+":
				Addition add=new Addition();
				add.addition(a, b);
				break;
			case "-":
				Subtraction su= new Subtraction();
				su.sub(a, b);
				break;
			case "*":
				Multiplication mu=new Multiplication();
				mu.mul(a,b);
				break;
			case "/":
				Division di= new Division();
				di.div(a, b);
				break;
			default:
				System.out.println("invalid operation");
			}
		}
		else if(opt==2) {
			System.out.println("enter a function :\nsin\ncos\ntan\ncot ");
			String function = sc.next();
			System.out.println("enter degree");
			double degree=sc.nextDouble();
			Trigonometry tr=new Trigonometry();
			tr.trig(degree,function);
		}
		else
			System.out.println("enter valid option");
	}
public static void main(String[] args) {
	Calculator c=new Calculator();
	c.cal();
}
}
