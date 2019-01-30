
public class Factorial{
	/**
	 * Constructor for the class.
	 */
	public Factorial(){

	}
	/**
	 * calculate the factorial of a number in one of two ways.
	 * @param n The number to be counted for factorial
	 * @param type "recursive" or "iterative" only.
	 * @return the factorial of n
	 */
	public int factorial(int n, String type){
		if(type.equals("recursive")){
			return recursive(n);
		}

		else if(type.equals("iterative")){
			return iterative(n);
		}

		return 1;
	}

	/**
	 * This function calculate the number in recursive way.
	 */
	public int recursive(int n){
		if(n <= 1){
			return 1;
		}
		return n * recursive(n-1);
	}

	/**
	 * This function calculate the number in iterative way.
	 */

	public int iterative(int n){
		int total = 1;
		for(int i = 1; i <= n; i++){
			total *= i;
		}

		return total;
	}

}