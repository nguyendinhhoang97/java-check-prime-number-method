import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Check prime numbers application ");
        System.out.println("Enter a number!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkPrimeNumber(number);
    }


    public static boolean checkPrimeNumber(int number) {
        boolean check = true;
        if (number == 0 || number == 1)
            System.out.println(number + " is not prime number!");
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check == true)
            System.out.println(number + " is prime number!");
        else
            System.out.println(number + " is not prime number!");
        return check;
    }
}
