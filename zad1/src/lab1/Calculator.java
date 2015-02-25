package lab1;

public class Calculator {

	public boolean greater(int a, int b){
		return a>b;
	}
	public int add(int a, int b){
		return a+b;
	}
	public int sub(int a, int b){
		return a-b;
	}
	public int multi(int a, int b){
		return a*b;
	}
	public int div(int a, int b){
		if (b==0)
				throw new ArithmeticException("Division by zero!");
		return a/b;
	}
	
}
