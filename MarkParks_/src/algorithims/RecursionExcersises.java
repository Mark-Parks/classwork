package algorithims;

public class RecursionExcersises {
	
	 public static void main(String[] args){
		 solve(3,"A","B","C");
	 }

	 private static void solve(int n, String start, String help, String end) {
		if(n==1) {
			System.out.println("_______");
		}
		else { 
			if(n%2 == 0) {
				System.out.println(start+" to "+help);
				solve(n-1, help, end, start);
			}else {
				System.out.println(start+" to "+end);
				solve(n-1, start, help, end);
			}
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
