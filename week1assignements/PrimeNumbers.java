package week1assignements;

public class PrimeNumbers {

    public static void main(String[] args) {
        int j = 50; 
        System.out.println("Prime Numbers Between 50:"+"");

            for (int num = 2; num <= j; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
            isPrime = false;
                    break;
                    
                }
            }

           
             if (isPrime) {
             System.out.print(num + " ");
                
            }
        }
    }}
	
