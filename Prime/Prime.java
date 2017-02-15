import java.util.*;

public class Prime{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");
		int n =s.nextInt();
		//System.out.println(Arrays.toString(primeCalculator(n)));
		primeCalculator(n);


		
	}
	public static int[] primeCalculator(int n){
		int[] primes = new int[n];
		for(int i=2;i<n;i++){
			if(isPrime(i)){
				for(int j=0;j<n;j++){
					primes[j]= i;
				}
				System.out.println(primes[i]);
			}
		}
		for(int i=0;i<100;i++){
			//System.out.println(primes[i]);
		}
		return primes;
		
	}

	public static boolean isPrime(int n){
		if(n%2==0 && n !=2){
			return false;
		} 
		for(int i=3;i<n;i+=2){
			if(n%i ==0){
				return false;
			}
		}
		return true;
	
	}

	
}