package week1;

public class TotalNumberOfPrimes {
	  /**
	   * Checks whether the given integer value is a prime number.
	   *
	   * @param n integer value to be checked if it is a prime number or not
	   * @return returns true if n is prime, false otherwise
	   */
	  public static boolean isPrime(int n) {
	    int number = 1;
	    for(int divisor = 2; divisor <= n; divisor++) {
	      if(n % divisor == 0) {
	        number++;
	      }
	    }
	    return (number == 2);
	  }
	
	  /**
	   * Counts and returns the number of prime numbers that are less or equal
	   * than the given integer value.
	   *
	   * @param n integer value defining an upper bound on the set of prime number to count
	   * @return returns the number of prime numbers that are less or equal than n
	   */
	  public static int numPrimes(int n) {
	    int numberOfPrimes = 0;
	    for(int i=0; i <=n; i++) {
	      if(isPrime(i)) {
	        numberOfPrimes++;
	      }
	    }
	    return numberOfPrimes;
	  }
	}



