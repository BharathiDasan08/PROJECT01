package fibonacciseries;

public class Fibonaccilogic {

	public static void main(String[] args) {
		int i = 10;
		int fib1=0;
		int fib2=1;
		int fib3=fib1+fib2;
		while(i>0)
		{
			System.out.println(fib1);
			fib1=fib2;
			fib2=fib3;
			fib3=fib1+fib2;
			i--;
		}

	}

}
