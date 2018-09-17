import java.util.ArrayList;

public class DisplayPrimeNumber {
	

	public void printPrimeNumber() {
		int count = 0; 
		//Integer is a wrapper class to represent a int values in object manner
		//Integer is a class, 
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		
		int number =2;

		while(count<100) {
			int primeCheck = 0;
			for(int i=number -1; i>1; i--) {
				if(number%i==0) {
					primeCheck=1;
					break;
				
				}
			}
			if(primeCheck==0) {
				primeNumbers.add(number);
				count++;
			}
			number++;
		}
		//sysout to display the primnumners , systems is a class, out is a object variable, println is method.
		System.out.println("prime numbers size:" + primeNumbers.size());
		for(int j=1; j<primeNumbers.size(); j++) {
			System.out.println(j+":"+primeNumbers.get(j-1));
			
		}
	}
	

}
