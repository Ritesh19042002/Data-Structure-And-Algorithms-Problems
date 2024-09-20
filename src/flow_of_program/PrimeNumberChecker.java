package flow_of_program;

public class PrimeNumberChecker {

    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        // Check divisibility from 3 up to number/2
        for (int i = 3; i <= number / 2; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void prime(int number){
        int flag = 0;
        for (int i = 4; i < number ; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("prime");
        }else {
            System.out.println("Not prime");
        }
    }
    public static void primeRange(int number){
        for (int i = 2; i <= number ; i++) {
            boolean myPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    myPrime = false;
                    break;
                }
            }
            if(myPrime){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int number = 29;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        prime(number);
        primeRange(number);



    }
}