public class Fibonacci{
	/**
	 * Constructor for the class.
	 */ 

	public Fibonacci(){

	}
	/**
	 * calculate the fibonacci number of a number in one of two ways.
	 * @param n The number to be calculated for fibonacci
	 * @param type "recursive" or "iterative" only.
	 * @return the fibonacci number of n
	 */
	public int fibonacci(int n, String type){

		if(type.equals("recursive")){
			return recursive(n);
		}

		else if (type.equals("iterative")) {
			return iterative(n);
		}

		return 0;
	}

	/**
	 * This function calculate the number in recursive way.
	 */
	public int recursive(int n){

		if(n <= 1){
			return n;
		}

		else{
			return recursive(n-1) + recursive(n-2);
		}

	}
	
	/**
	 * This function calculate the number in iterative way.
	 */

	public int iterative(int n){

		int t1 = 0, t2 = 1;
		int nextTerm;
		if(n == 0){
			return 0;
		}
		for(int i = 0; i < n; i++){

			nextTerm = t1 + t2;
			t1 = t2;
			t2 = nextTerm;
		}

		return t1;
	}
}