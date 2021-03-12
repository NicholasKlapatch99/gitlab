public class Hello2{

	public int factorial(int n){
		if(n <= 1){
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args){
		System.out.println("The factorial of 7 is " + factorial(7));
	}

}