package algorithims;

public class RecursionExcersises {
	
	 public static void main(String[] args){
		solve(4, "A","B","C");
		//System.out.println(fibonacci(9));
	 }

	 public static int fibonacci(int i) {
		if( i <= 1) {
			return 1;
		}else {
			return fibonacci(i-1) + fibonacci(i-2);
		}
	}

	private static void solve(int n, String start, String help, String end) {
		if(n==1) {
			/**THIS IS THE BASE CASE NO MATTER WHAT WHEN A TOWER'S HEIGHT IS 1
			 * IT MOVES TO THE PILLAR THAT IS NOT DEFINE AS THE PREVIOUS HELP
			 */
			System.out.println(start+" to "+end);
		}else {
			/**SINCE WE JUST REMOVED A DISC WE GOTTA n-1 BUT ALSO
			 * REARRANGED THE PAREMETERS BECAUSE WE ARN'T ONLY MOVING TO THE END PILLAR
			 */
			solve(n-1, start, end, help);
			/**NOW THAT THE PARAMETERS WERE CHANGED WE SAY THIS AGAIN
			 * BECUASE THE HELP IS NOW OUR END BUT STILL THE SAME PILLAR
			 */
			System.out.println(start+" to "+end);
			/**AND NOW THAT WE ARE ON THE HELP PILLAR
			 * WHICH WAS OUR PREVIOUS END PILLAR 
			 * WE MOVE IT BACK TO THE PRIVOUS END WHICH WAS THE HELP
			 * AND USE THE STARTING PILLAR AS OUR NEW HELP
			 */
			solve(n-1, help, start, end);
		}
	}
	

	public static long countPrimeFactors(long value, long testPrime) {
		 if(value/testPrime == 1) {
			 return 1;
		 }else if(value%testPrime == 0) {
			 return countPrimeFactors(value/testPrime, testPrime)+1;
		 }else return countPrimeFactors(value, testPrime+1);
	 }

	 public static long factorial(long x) {
		 if(x == 1)
			 return 1;
		 else return x * factorial(x-1);
	 }


}
